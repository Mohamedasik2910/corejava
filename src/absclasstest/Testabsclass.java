package absclasstest;

import oopsabsclass.Instagran;
import oopsabsclass.facebook;
import oopsabsclass.meta;

public class Testabsclass {

	public static void main(String[] args) {
		meta b=new facebook();
		b.open();
		b.maximize();
		b.close();
		meta i=new Instagran();
		i.open();
		i.maximize();
		i.close();
		
		

	}

}
