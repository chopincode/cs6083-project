CREATE TABLE auto_installment_payment (
    transaction_number  DECIMAL(30) NOT NULL,
    payment_date        DATETIME NOT NULL,
    method_of_payment   VARCHAR(6) NOT NULL COMMENT 'paypal, credit, debit, check',
    invoice_number      DECIMAL(20) NOT NULL
);

/* Moved to CREATE TABLE
COMMENT ON COLUMN auto_installment_payment.method_of_payment IS
    'paypal, credit, debit, check'; */

ALTER TABLE auto_installment_payment ADD CONSTRAINT auto_installment_payment_pk PRIMARY KEY ( transaction_number );

CREATE TABLE auto_insurance_invoice (
    invoice_number    DECIMAL(20) NOT NULL,
    invoice_amount    DOUBLE NOT NULL,
    payment_due_date  DATETIME NOT NULL,
    policy_number     DECIMAL(30) NOT NULL
);

ALTER TABLE auto_insurance_invoice ADD CONSTRAINT auto_invoice_pk PRIMARY KEY ( invoice_number );

CREATE TABLE auto_insurance_policy (
    policy_number          DECIMAL(30) NOT NULL,
    start_date             DATETIME NOT NULL,
    end_date               DATETIME NOT NULL,
    premium_amount         DOUBLE NOT NULL,
    auto_insurance_status  VARCHAR(1) NOT NULL COMMENT 'C -> current
P -> expired'
);

/* Moved to CREATE TABLE
COMMENT ON COLUMN auto_insurance_policy.auto_insurance_status IS
    'C -> current
P -> expired'; */

ALTER TABLE auto_insurance_policy ADD CONSTRAINT auto_insurance_policy_pk PRIMARY KEY ( policy_number );

CREATE TABLE auto_insured (
    auto_id        BIGINT NOT NULL,
    vin_number     VARCHAR(17) NOT NULL,
    make           VARCHAR(20) NOT NULL,
    model          VARCHAR(20) NOT NULL,
    year           VARCHAR(4) NOT NULL,
    auto_status    VARCHAR(1) NOT NULL COMMENT 'L -> lease
F -> finance
O -> ownership',
    policy_number  DECIMAL(30) NOT NULL
);

/* Moved to CREATE TABLE
COMMENT ON COLUMN auto_insured.auto_status IS
    'L -> lease
F -> finance
O -> ownership'; */

ALTER TABLE auto_insured ADD CONSTRAINT auto_insured_pk PRIMARY KEY ( auto_id );

CREATE TABLE customer (
    customer_id     DOUBLE NOT NULL,
    first_name      VARCHAR(50) NOT NULL,
    last_name       VARCHAR(50) NOT NULL,
    address         VARCHAR(100) NOT NULL,
    gender          VARCHAR(1) COMMENT 'M -> male F -> femail. This field can be optional',
    marital_status  VARCHAR(1) NOT NULL COMMENT 'M -> married S -> single W -> widow/widower',
    customer_type   VARCHAR(1) NOT NULL
);

/* Moved to CREATE TABLE
COMMENT ON COLUMN customer.gender IS
    'M -> male F -> femail. This field can be optional'; */

/* Moved to CREATE TABLE
COMMENT ON COLUMN customer.marital_status IS
    'M -> married S -> single W -> widow/widower'; */

ALTER TABLE customer ADD CONSTRAINT customer_pk PRIMARY KEY ( customer_id );

CREATE TABLE driver_under_vehicle (
    license_number        BIGINT NOT NULL,
    first_name            VARCHAR(50) NOT NULL,
    last_name             VARCHAR(50) NOT NULL,
    birth_date            DATETIME NOT NULL,
    vin_number            VARCHAR(17) NOT NULL,
    license_issued_state  VARCHAR(2) NOT NULL,
    auto_id               BIGINT NOT NULL
);

ALTER TABLE driver_under_vehicle ADD CONSTRAINT driver_pk PRIMARY KEY ( license_number );

CREATE TABLE home_installment_payment (
    transaction_number  DECIMAL(30) NOT NULL,
    payment_date        DATETIME NOT NULL,
    method_of_payment   VARCHAR(6) NOT NULL COMMENT 'Paypal, credit, debit, check',
    invoice_number      DECIMAL(20) NOT NULL
);

/* Moved to CREATE TABLE
COMMENT ON COLUMN home_installment_payment.method_of_payment IS
    'Paypal, credit, debit, check'; */

ALTER TABLE home_installment_payment ADD CONSTRAINT home_installment_pk PRIMARY KEY ( transaction_number );

CREATE TABLE home_insurance_invoice (
    invoice_number    DECIMAL(20) NOT NULL,
    invoice_amount    DOUBLE NOT NULL,
    payment_due_date  DATETIME NOT NULL,
    policy_number     DECIMAL(30) NOT NULL
);

ALTER TABLE home_insurance_invoice ADD CONSTRAINT home_invoice_pk PRIMARY KEY ( invoice_number );

CREATE TABLE home_insurance_policy (
    policy_number          DECIMAL(30) NOT NULL,
    start_date             DATETIME NOT NULL,
    end_date               DATETIME NOT NULL,
    premium_amount         DOUBLE NOT NULL,
    home_insurance_status  VARCHAR(1) NOT NULL COMMENT 'C -> current P -> expired'
);

/* Moved to CREATE TABLE
COMMENT ON COLUMN home_insurance_policy.home_insurance_status IS
    'C -> current P -> expired'; */

ALTER TABLE home_insurance_policy ADD CONSTRAINT home_insurance_pk PRIMARY KEY ( policy_number );

CREATE TABLE home_insured (
    home_id                 BIGINT NOT NULL,
    purchase_date           DATETIME NOT NULL,
    purchase_value          DOUBLE NOT NULL,
    home_area               DOUBLE NOT NULL COMMENT 'in sqrt ft',
    type_of_home            VARCHAR(1) NOT NULL COMMENT 'S -> single family
M -> Multifamily
C -> Condominium
T -> Town House',
    auto_fire_notification  TINYINT NOT NULL COMMENT '1 -> There is automatic fire notification to the fire department
0 -> There is NO fire notification to the fire department',
    home_security_system    TINYINT NOT NULL COMMENT '1 -> The home security system is installed and monitored 
0 -> The home security system is not installed or not monitored',
    swimming_pool           VARCHAR(2) COMMENT 'U -> Underground swimming pool
O -> Overground swimming pool
I -> Indoor swimming pool
M -> Multiple swimming pool
null -> No swimming pool ',
    basement                TINYINT NOT NULL COMMENT '1 -> There is a basement
0 -> There is NO basement',
    policy_number           DECIMAL(30) NOT NULL
);

/* Moved to CREATE TABLE
COMMENT ON COLUMN home_insured.home_area IS
    'in sqrt ft'; */

/* Moved to CREATE TABLE
COMMENT ON COLUMN home_insured.type_of_home IS
    'S -> single family
M -> Multifamily
C -> Condominium
T -> Town House'; */

/* Moved to CREATE TABLE
COMMENT ON COLUMN home_insured.auto_fire_notification IS
    '1 -> There is automatic fire notification to the fire department
0 -> There is NO fire notification to the fire department'; */

/* Moved to CREATE TABLE
COMMENT ON COLUMN home_insured.home_security_system IS
    '1 -> The home security system is installed and monitored 
0 -> The home security system is not installed or not monitored'; */

/* Moved to CREATE TABLE
COMMENT ON COLUMN home_insured.swimming_pool IS
    'U -> Underground swimming pool
O -> Overground swimming pool
I -> Indoor swimming pool
M -> Multiple swimming pool
null -> No swimming pool '; */

/* Moved to CREATE TABLE
COMMENT ON COLUMN home_insured.basement IS
    '1 -> There is a basement
0 -> There is NO basement'; */

ALTER TABLE home_insured ADD CONSTRAINT home_insured_pk PRIMARY KEY ( home_id );

CREATE TABLE insurance_policy (
    policy_number  DECIMAL(30) NOT NULL,
    customer_id    DOUBLE NOT NULL,
    customer_type  VARCHAR(1) NOT NULL
);

ALTER TABLE insurance_policy ADD CONSTRAINT insurance_policy_pk PRIMARY KEY ( policy_number );

ALTER TABLE auto_installment_payment
    ADD CONSTRAINT auto_installment_payment_fk FOREIGN KEY ( invoice_number )
        REFERENCES auto_insurance_invoice ( invoice_number );

ALTER TABLE auto_insurance_policy
    ADD CONSTRAINT auto_insurance_fk FOREIGN KEY ( policy_number )
        REFERENCES insurance_policy ( policy_number );

ALTER TABLE auto_insured
    ADD CONSTRAINT auto_insured_fk FOREIGN KEY ( policy_number )
        REFERENCES auto_insurance_policy ( policy_number );

ALTER TABLE auto_insurance_invoice
    ADD CONSTRAINT auto_invoice_fk FOREIGN KEY ( policy_number )
        REFERENCES auto_insurance_policy ( policy_number );

ALTER TABLE driver_under_vehicle
    ADD CONSTRAINT driver_fk FOREIGN KEY ( auto_id )
        REFERENCES auto_insured ( auto_id );

ALTER TABLE home_installment_payment
    ADD CONSTRAINT home_installment_payment_fk FOREIGN KEY ( invoice_number )
        REFERENCES home_insurance_invoice ( invoice_number );

ALTER TABLE home_insurance_policy
    ADD CONSTRAINT home_insurance_fk FOREIGN KEY ( policy_number )
        REFERENCES insurance_policy ( policy_number );

ALTER TABLE home_insured
    ADD CONSTRAINT home_insured_fk FOREIGN KEY ( policy_number )
        REFERENCES home_insurance_policy ( policy_number );

ALTER TABLE home_insurance_invoice
    ADD CONSTRAINT home_invoice_fk FOREIGN KEY ( policy_number )
        REFERENCES home_insurance_policy ( policy_number );

ALTER TABLE insurance_policy
    ADD CONSTRAINT policy_customer_fk FOREIGN KEY ( customer_id )
        REFERENCES customer ( customer_id );
