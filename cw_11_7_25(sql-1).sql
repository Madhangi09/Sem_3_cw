CREATE TABLE employee_detail(emp_id INT,emp_name VARCHAR(15),emp_dept VARCHAR(15),emp_salary DECIMAL(10,2));
INSERT INTO employee_detail(emp_id,emp_name,emp_dept,emp_salary) VALUES(100,'Mad','Student',5000.00);
INSERT INTO employee_detail(emp_id,emp_name,emp_dept,emp_salary) VALUES(101,'Ani','Student',20000.00);
INSERT INTO employee_detail(emp_id,emp_name,emp_dept,emp_salary) VALUES(102,'Kam','Teacher',300000.00);
DELETE FROM employee_detail where emp_id="102";
ALTER TABLE employee_detail ADD emp_city VARCHAR(15);
ALTER TABLE employee_detail MODIFY emp_salary decimal(10,1);
ALTER TABLE employee_detail DROP column emp_city; /*you should give drop before select*/
TRUNCATE TABLE employee_detail;
/*RENAME employee_detail to employee;
BEGIN;
UPDATE employee_detail set emp_name="Anil" where emp_id="101";
rollback;
commit;
SELECT * FROM employee_detail where emp_id="100";
SELECT emp_id,emp_name FROM employee_detail;*/
SELECT * FROM employee_detail;