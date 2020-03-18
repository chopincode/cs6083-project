SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS home_customer;

CREATE TABLE `home_customer` (
    `customer_id` int(10) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(50) DEFAULT NULL,
    `last_name` varchar(50) DEFAULT NULL,
    `address` varchar(100) DEFAULT NULL,
    `gender` varchar(1) DEFAULT NULL,
    `marital_status` varchar(1) DEFAULT NULL,
    `customer_type` varchar(1) DEFAULT NULL,
    `policy_number` int(10) default null,
    primary key (customer_id),
    key home_insurance_FK (policy_number),
    constraint home_insurance_detail 
    foreign key (policy_number) references home_insurance (policy_number)
) engine=InnoDB auto_increment=1 default charset=latin1;

drop table if exists home_insurance;

create table home_insurance (
    `policy_number` int(10) not null auto_increment,
    `insurance_status` varchar(1) default null,
    `start_date` datetime default null,
    `end_date` datetime default null,
    `premium_amount` double default null,

    primary key (policy_number)
);

drop table if exists home_insured

create table home_insured (
    `home_id` int(10) not null auto_increment,
    `purchase_date` datetime default null,
    `purchase_value` double default null,
    `home_area` double default null,
    `type_of_home` varchar(1) default null,
    `auto_fire_notification` int(1) default null, 
    `home_security_system` int(1) default null,
    `swimming_pool` varchar(2) default null,
    `basement` int(1) default null,
    `policy_number` int(10) not null,

    primary key (home_id),

    key policy_number (policy_number),
    constraint home_insured_FK foreign key (policy_number) references home_insurance(policy_number)
    on delete no action on update no action
)engine=InnoDB auto_increment=1 default charset=latin1;

drop table if exists home_invoice;

create table home_invoice (
    `invoice_number` int(20) not null auto_increment,
    `invoice_amount` double default null,
    `payment_due_date` datetime default null,
    `policy_number` int(10) not null,
    `transaction_number` int(10) not null,

    primary key (invoice_number),
    key policy_number (policy_number),
    constraint home_invoice_FK foreign key (policy_number) references home_insurance(policy_number)
    on delete no action on update no action,

    key transaction_number (transaction_number),
    constraint home_payment_FK foreign key (transaction_number) references home_payment (transaction_number)
)engine=InnoDB auto_increment=1 default charset=latin1;

drop table if exists home_payment;

create table home_payment (
    `transaction_number` int(20) not null auto_increment,
    `payment_date` datetime default null,
    `method_of_payment` varchar(7) default null,

    primary key (transaction_number)
)engine=InnoDB auto_increment=1 default charset=latin1;







