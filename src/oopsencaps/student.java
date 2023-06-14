package oopsencaps;

public class student {
	private String Stdid;
	private String Stdname;
	private long Stdno;

	public void setstdid(String stdid)
	{
		this.Stdid=stdid;
	}
	public String getstdid()
	{
		return Stdid;
		
	}
	public void setstdname(String stdname)
	{
		this.Stdname=stdname;
	}

	public String getstdname()
	{
		return Stdname;
	
	}
	public void setstdno(long l)
	{
		this.Stdno=l;
	}
	public long getstdno()
	{
		return Stdno;
		
	}
}

