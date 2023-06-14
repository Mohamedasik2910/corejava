package oopsencaps;

public class Employee {
	private String Empid;
	private String Empname;
	private long Empno;
	public void setempid(String empid)
	{
		this.Empid=empid;
		
		
	}
	
public String getempid()
{
	return Empid;
	
}
public void setempname(String empname)
{
	this.Empname=empname;
}
public String getempname()
{
	return Empname;
	
}
public void setempno(long l)
{
	this.Empno=l;
	
	
}
public long getempno()
{
	return Empno;
	
}
}
