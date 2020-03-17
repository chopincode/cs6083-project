INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (1, 'Cristiano', 'Ronaldo', '100 W Fleet Ave', 'M', 'M', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (2, 'Leo', 'Messi', '100 W Pennsylvania Ave, New York, NY, 10002', 'M', 'M', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (3, 'Robert', 'Lewandowski', '1010 W University Ave, Urbana, IL, 61801', 'M', 'S', 'H');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (4, 'Sadio', 'Mane', '1067 S Hampton Str', 'M', 'S', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (5, 'Zlatan', 'Ibrahimovic', '703 W Conduit Ave', 'M', 'S', 'H');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (6, 'Gareth', 'Bale', '333 N Lincoln Ave', 'M', 'M', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (7, 'Karim', 'Benzema', '7063 N Michigan Ave', 'M', 'M', 'H');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (8, 'Eden', 'Hazard', '101 University Circle', 'M', 'S', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (9, 'Sergio', 'Aguero', '608 E Duffiled Ave', 'M', 'M', 'H');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (10, 'Pep', 'Guardiola', '703 Southampton Blvd', 'M', 'M', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (11, 'Luka', 'Modric', '777 London Ave', 'M', 'M', 'H');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (12, 'Ike', 'Cassilyas', '100 W Pennsylvania Ave, New York, NY, 10002', 'M', 'M', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (13, 'Sergio', 'Ramos', '1010 W University Ave, Urbana, IL, 61801', 'M', 'S', 'H');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (14, 'Gerad', 'Pique', '1067 S Hampton Str', 'M', 'S', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (15, 'Musa', 'Sissoko', '703 W Conduit Ave', 'M', 'S', 'H');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (16, 'Antonio', 'Grizmann', '333 N Lincoln Ave', 'M', 'M', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (17, 'Pierre', 'Abameiyang', '7063 N Michigan Ave', 'M', 'M', 'H');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (18, 'Wu', 'Lei', '101 University Circle', 'M', 'S', 'A');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (19, 'Mario', 'Gotzu', '608 E Duffiled Ave', 'M', 'M', 'H');

INSERT INTO customer (customer_id, first_name, last_name, address, gender, marital_status, customer_type)
VALUES (20, 'Jose', 'Mourihno', '703 Southampton Blvd', 'M', 'M', 'A');

INSERT INTO home_insurance_policy (policy_number, start_date, end_date, premium_amount, insurance_status, customer_id)
values(11111111, TO_DATE('10/08/2001 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('10/08/2002 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1365.33, 'P', 3);

INSERT INTO home_insurance_policy (policy_number, start_date, end_date, premium_amount, insurance_status, customer_id)
values(22222222, TO_DATE('10/08/2019 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('10/08/2022 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 3655.08, 'C', 5);

INSERT INTO home_insurance_policy (policy_number, start_date, end_date, premium_amount, insurance_status, customer_id)
values(33333333, TO_DATE('10/08/2005 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('10/08/2006 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1322.57, 'P', 7);

INSERT INTO home_insurance_policy (policy_number, start_date, end_date, premium_amount, insurance_status, customer_id)
values(44444444, TO_DATE('10/08/2001 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('10/08/2002 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1365.33, 'P', 9);

INSERT INTO home_insurance_policy (policy_number, start_date, end_date, premium_amount, insurance_status, customer_id)
values(55555555, TO_DATE('10/08/2007 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('10/08/2008 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1365.33, 'P', 11);

INSERT INTO home_insurance_policy (policy_number, start_date, end_date, premium_amount, insurance_status, customer_id)
values(66666666, TO_DATE('10/08/2001 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('10/08/2002 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1365.33, 'P', 13);

INSERT INTO home_insurance_policy (policy_number, start_date, end_date, premium_amount, insurance_status, customer_id)
values(77777777, TO_DATE('10/08/2001 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('10/08/2002 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1365.33, 'P', 15);

INSERT INTO home_insurance_policy (policy_number, start_date, end_date, premium_amount, insurance_status, customer_id)
values(88888888, TO_DATE('10/08/2017 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('10/08/2023 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1365.33, 'C', 17);

INSERT INTO home_insurance_policy (policy_number, start_date, end_date, premium_amount, insurance_status, customer_id)
values(99999999, TO_DATE('10/08/2018 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('10/08/2024 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1365.33, 'C', 19);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1111, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 11111111);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1112, TO_DATE('10/08/2001 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880700.00, 1000.00, 'C', 1, 1, 'I', 1, 11111111);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1113, TO_DATE('10/08/1997 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880050.00, 1000.00, 'S', 1, 1, 'UI', 1, 22222222);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1114, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 884000.00, 1000.00, 'S', 1, 1, 'UI', 1, 22222222);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1115, TO_DATE('10/08/1993 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 33333333);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1116, TO_DATE('10/08/1996 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 33333333);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1117, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 44444444);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1118, TO_DATE('10/08/1993 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 44444444);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1119, TO_DATE('10/08/1997 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 44444444);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1120, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 55555555);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1121, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 66666666);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1122, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 66666666);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1123, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 77777777);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1124, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 88888888);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1125, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 99999999);

INSERT INTO home_insured (home_id, purchase_date, purchase_value, home_area, type_of_home, auto_fire_notification, home_security_system, swimming_pool, basement, policy_number)
Values (1126, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 880000.00, 1000.00, 'S', 1, 1, 'UI', 1, 99999999);


INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100000, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 11111111);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100001, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 11111111);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100002, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 22222222);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100002, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 22222222);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100003, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 33333333);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100004, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 44444444);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100005, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 55555555);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100006, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 66666666);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100007, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 77777777);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100008, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 88888888);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100009, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 99999999);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100010, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 99999999);

INSERT INTO home_insurance_invoice (invoice_number, invoice_amount, payment_due_date, policy_number)
VALUES (100011, 7000.00, TO_DATE('10/08/1995 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 99999999);


INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1234, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100000);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1235, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100001);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1236, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100002);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1237, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100003);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1238, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100004);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1239, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100005);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1240, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100006);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1241, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100007);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1242, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100008);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1243, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100009);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1244, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100010);

INSERT INTO home_installment_payment (transaction_number, payment_date, method_of_payment, invoice_number)
VALUES (1245, TO_DATE('10/08/1998 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 'check', 100011); 
