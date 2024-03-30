CREATE OR REPLACE PROCEDURE helloWorld
AS

BEGIN
	dbms_output.put_line("Hello");
end;
/

BEGIN
	helloWorld;
end;
/

CREATE OR REPLACE PROCEDURE raiseSalary(xno emp.empno%type)
AS
BEGIN
	UPDATE emp set sal = sal * 1.1
	WHERE empno = xno;
	COMMIT;
end;
/

BEGIN
	raiseSalary(7369);
end;
/

drop PROCEDURE raiseSalary;

CREATE or REPLACE PROCEDURE findEmpNameAndSalAndJob(xno IN emp.empno%type, 
													name OUT emp.ename%type,
													xjob OUT emp.job%type, 
													sal OUT emp.sal%type)
AS
BEGIN
	select ename, job, sal, into xname, sjob, xsal from emp
	WHERE empno = xno;
end;
/

DECLARE
	name  emp.ename%type;
	xjob  emp.job%type;
	sal   emp.sal%type;

BEGIN
	findEmpNameAndSalAndJob(&xxxx, xname, xjob, xsal);
	dbms_output.put_line('Employee info: '||xname||' '||xjob||' '||xsal)
end;
/

CREATE or REPLACE PROCEDURE getSalTax(xsal NUMBER, salTax out NUMBER)
AS
	x NUMBER :=xsal - 5000;
BEGIN
	IF x <= 3000 
		THEN salTax := 0;
			dbms_output.put_line('No need to pay tax');
	ELSIF x <= 3000
		THEN salTax := x * 0.03 - 0;
	ELSIF x <= 12000
		THEN salTax := x * 0.1 - 210;
	ELSIF x <= 25000
		THEN salTax := x * 0.2 - 1410;
	ELSIF x <= 35000
		THEN salTax := x * 0.25 - 2660;
	ELSIF x <= 55000
		THEN salTax := x * 0.3 - 4410;
	ELSIF x <= 80000
		THEN salTax := x * 0.35 - 7160;
	ELSE 
		salTax := x * 0.45 - 15160;
	
	END IF;
end;
/