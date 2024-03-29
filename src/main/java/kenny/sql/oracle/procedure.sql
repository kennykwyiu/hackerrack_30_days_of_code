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
