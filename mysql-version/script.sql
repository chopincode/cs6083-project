CREATE TABLE auto_customer (
    customer_id     VARCHAR2(1) NOT NULL,
    first_name      VARCHAR2(50) NOT NULL,
    last_name       VARCHAR2(50) NOT NULL,
    address         VARCHAR2(100) NOT NULL,
    gender          VARCHAR2(1),
    marital_status  VARCHAR2(1) NOT NULL,
    customer_type   VARCHAR2(1) NOT NULL,
    policy_number   NUMBER(30) NOT NULL
);

ALTER TABLE auto_customer ADD CONSTRAINT auto_customer_pk PRIMARY KEY ( customer_id );

CREATE TABLE auto_installment_payment (
    transaction_number  NUMBER(30) NOT NULL,
    payment_date        DATE NOT NULL,
    method_of_payment   VARCHAR2(6) NOT NULL,
    invoice_number      NUMBER(20) NOT NULL
);

COMMENT ON COLUMN auto_installment_payment.method_of_payment IS
    'paypal, credit, debit, check';

ALTER TABLE auto_installment_payment ADD CONSTRAINT auto_payment_pk PRIMARY KEY ( transaction_number );

CREATE TABLE auto_insurance_invoice (
    invoice_number      NUMBER(20) NOT NULL,
    invoice_amount      FLOAT NOT NULL,
    payment_due_date    DATE NOT NULL,
    policy_number       NUMBER(30) NOT NULL,
    transaction_number  NUMBER(30) NOT NULL
);

ALTER TABLE auto_insurance_invoice ADD CONSTRAINT auto_invoice_pk PRIMARY KEY ( invoice_number );

CREATE TABLE auto_insurance_policy (
    policy_number          NUMBER(30) NOT NULL,
    start_date             DATE NOT NULL,
    end_date               DATE NOT NULL,
    premium_amount         FLOAT NOT NULL,
    auto_insurance_status  VARCHAR2(1) NOT NULL
);

COMMENT ON COLUMN auto_insurance_policy.auto_insurance_status IS
    'C -> current
P -> expired';

ALTER TABLE auto_insurance_policy ADD CONSTRAINT auto_insurance_policy_pk PRIMARY KEY ( policy_number );

CREATE TABLE auto_insured (
    auto_id        NUMBER(10) NOT NULL,
    vin_number     VARCHAR2(17) NOT NULL,
    make           VARCHAR2(20) NOT NULL,
    model          VARCHAR2(20) NOT NULL,
    year           VARCHAR2(4) NOT NULL,
    auto_status    VARCHAR2(1) NOT NULL,
    policy_number  NUMBER(30) NOT NULL
);

COMMENT ON COLUMN auto_insured.auto_status IS
    'L -> lease
F -> finance
O -> ownership';

ALTER TABLE auto_insured ADD CONSTRAINT auto_insured_pk PRIMARY KEY ( auto_id );

CREATE TABLE driver_under_vehicle (
    license_number        NUMBER(10) NOT NULL,
    first_name            VARCHAR2(50) NOT NULL,
    last_name             VARCHAR2(50) NOT NULL,
    birth_date            DATE NOT NULL,
    vin_number            VARCHAR2(17) NOT NULL,
    license_issued_state  VARCHAR2(2) NOT NULL,
    auto_id               NUMBER(10) NOT NULL
);

ALTER TABLE driver_under_vehicle ADD CONSTRAINT driver_pk PRIMARY KEY ( license_number );

CREATE TABLE home_customer (
    customer_id     NUMBER NOT NULL,
    first_name      VARCHAR2(50) NOT NULL,
    last_name       VARCHAR2(50) NOT NULL,
    address         VARCHAR2(100) NOT NULL,
    gender          VARCHAR2(1),
    marital_status  VARCHAR2(1) NOT NULL,
    customer_type   VARCHAR2(1) NOT NULL,
    policy_number   NUMBER(30) NOT NULL
);

COMMENT ON COLUMN home_customer.gender IS
    'M -> male F -> femail. This field can be optional';

COMMENT ON COLUMN home_customer.marital_status IS
    'M -> married S -> single W -> widow/widower';

ALTER TABLE home_customer ADD CONSTRAINT customer_pk PRIMARY KEY ( customer_id );

CREATE TABLE home_installment_payment (
    transaction_number  NUMBER(30) NOT NULL,
    payment_date        DATE NOT NULL,
    method_of_payment   VARCHAR2(6) NOT NULL
);

COMMENT ON COLUMN home_installment_payment.method_of_payment IS
    'Paypal, credit, debit, check';

ALTER TABLE home_installment_payment ADD CONSTRAINT home_installment_pk PRIMARY KEY ( transaction_number );

CREATE TABLE home_insurance_invoice (
    invoice_number      NUMBER(20) NOT NULL,
    invoice_amount      FLOAT NOT NULL,
    payment_due_date    DATE NOT NULL,
    policy_number       NUMBER(30) NOT NULL,
    transaction_number  NUMBER(30) NOT NULL
);

ALTER TABLE home_insurance_invoice ADD CONSTRAINT home_invoice_pk PRIMARY KEY ( invoice_number );

CREATE TABLE home_insurance_policy (
    policy_number          NUMBER(30) NOT NULL,
    start_date             DATE NOT NULL,
    end_date               DATE NOT NULL,
    premium_amount         FLOAT NOT NULL,
    home_insurance_status  VARCHAR2(1) NOT NULL
);

COMMENT ON COLUMN home_insurance_policy.home_insurance_status IS
    'C -> current P -> expired';

ALTER TABLE home_insurance_policy ADD CONSTRAINT home_insurance_pk PRIMARY KEY ( policy_number );

CREATE TABLE home_insured (
    home_id                 NUMBER(10) NOT NULL,
    purchase_date           DATE NOT NULL,
    purchase_value          FLOAT NOT NULL,
    home_area               FLOAT NOT NULL,
    type_of_home            VARCHAR2(1) NOT NULL,
    auto_fire_notification  NUMBER(1) NOT NULL,
    home_security_system    NUMBER(1) NOT NULL,
    swimming_pool           VARCHAR2(2),
    basement                NUMBER(1) NOT NULL,
    policy_number           NUMBER(30) NOT NULL
);

COMMENT ON COLUMN home_insured.home_area IS
    'in sqrt ft';

COMMENT ON COLUMN home_insured.type_of_home IS
    'S -> single family
M -> Multifamily
C -> Condominium
T -> Town House';

COMMENT ON COLUMN home_insured.auto_fire_notification IS
    '1 -> There is automatic fire notification to the fire department
0 -> There is NO fire notification to the fire department';

COMMENT ON COLUMN home_insured.home_security_system IS
    '1 -> The home security system is installed and monitored 
0 -> The home security system is not installed or not monitored';

COMMENT ON COLUMN home_insured.swimming_pool IS
    'U -> Underground swimming pool
O -> Overground swimming pool
I -> Indoor swimming pool
M -> Multiple swimming pool
null -> No swimming pool ';

COMMENT ON COLUMN home_insured.basement IS
    '1 -> There is a basement
0 -> There is NO basement';

ALTER TABLE home_insured ADD CONSTRAINT home_insured_pk PRIMARY KEY ( home_id );

ALTER TABLE auto_customer
    ADD CONSTRAINT auto_custome_fk FOREIGN KEY ( policy_number )
        REFERENCES auto_insurance_policy ( policy_number );

ALTER TABLE auto_insurance_invoice
    ADD CONSTRAINT auto_installment_payment_fk FOREIGN KEY ( transaction_number )
        REFERENCES auto_installment_payment ( transaction_number );

ALTER TABLE auto_insurance_invoice
    ADD CONSTRAINT auto_insurance_invoice_fk FOREIGN KEY ( policy_number )
        REFERENCES auto_insurance_policy ( policy_number );

ALTER TABLE auto_insured
    ADD CONSTRAINT auto_insured_fk FOREIGN KEY ( policy_number )
        REFERENCES auto_insurance_policy ( policy_number );

ALTER TABLE driver_under_vehicle
    ADD CONSTRAINT drive_fk FOREIGN KEY ( auto_id )
        REFERENCES auto_insured ( auto_id );

ALTER TABLE home_insured
    ADD CONSTRAINT home_insured_fk FOREIGN KEY ( policy_number )
        REFERENCES home_insurance_policy ( policy_number );

ALTER TABLE home_insurance_invoice
    ADD CONSTRAINT home_invoice_fk FOREIGN KEY ( policy_number )
        REFERENCES home_insurance_policy ( policy_number );

ALTER TABLE home_customer
    ADD CONSTRAINT home_policy_fk FOREIGN KEY ( policy_number )
        REFERENCES home_insurance_policy ( policy_number );

ALTER TABLE home_insurance_invoice
    ADD CONSTRAINT payment_home_fk FOREIGN KEY ( transaction_number )
        REFERENCES home_installment_payment ( transaction_number );
