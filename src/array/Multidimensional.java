package array;

public class Multidimensional {

	public static void main(String[] args) {
		String s[][]=new String[3][2];
		s[0][0]="user1";
		s[0][1]="Pass1";
		s[1][0]="user2";
		s[1][1]="pass2";
		s[2][0]="user3";
		s[2][1]="pass3";
		
		for(int i=0;i<s.length;i++) 
		{
		for(int j=0;j<s[i].length;j++)
		{
			System.out.println(s[i][j]);
		}
		}

	}

}
