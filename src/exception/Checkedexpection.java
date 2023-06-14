package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checkedexpection {

	public static void main(String[] args) 
	{
		try
		{
		FileInputStream fb=new FileInputStream("E:\\file\\softwares Testing.pptx");
		}
		catch(Exception e)
		{
			System.out.println("File Location Not Found");
		}
	}

}
