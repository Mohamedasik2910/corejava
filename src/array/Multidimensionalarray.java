package array;

public class Multidimensionalarray {

	public static void main(String[] args) {
	String i[][]=new String[3][2];
	i[0][0]="user1";
	i[0][1]="Pass1";
	i[1][0]="user2";
	i[1][1]="pass2";
	i[2][0]="user3";
	i[2][1]="pass3";
	String s[][]=i.clone();
	System.out.println(s.length);
	System.out.println(s[0].length);
	System.out.println(s[0][1]);
	
	}
	

}
