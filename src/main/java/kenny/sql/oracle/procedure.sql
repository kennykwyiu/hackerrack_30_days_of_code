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