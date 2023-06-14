package oopsabainterface;

public class Chrome implements Browser {

	@Override
	public void open() {
		System.out.println("Open");
		
	}

	@Override
	public void close() {
		System.out.println("Close");
		
	}

}
