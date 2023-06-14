package oopsencaps;

public class studentdetails {

	public static void main(String[] args) {
		student s=new student();
		s.setstdid("Std_001");
		System.out.println(s.getstdid());
		s.setstdname("Mobile");
		System.out.println("\n"+s.getstdname());
		s.setstdno(9999999999L);
		System.out.println("\n"+s.getstdno());

	}

}
