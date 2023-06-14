package nonprimitive;

public class Stringmethods {

	public static void main(String[] args) {
		String s1= "Mohamed Asik";
		String s2 ="Mohamed Imthiyas";
		String s3="Mohamed Asik";	
			
		System.out.println("The Statement is "+s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1+75);
		System.out.println(s1.concat(s2));
		
System.out.println(s2.concat(" Khan"));

System.out.println("The Length of the Name Is "+s1.length());

System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());

System.out.println("The Character of Fifth Poisition Is "+s1.charAt(5));

System.out.println("Index Value of E Is "+s1.indexOf('e'));
System.out.println(s1.indexOf('e'));
System.out.println("The Index Value Of Next M is "+s1.indexOf('m', 1));

System.out.println("The Index Value of Imthiyas is "+s2.indexOf("Imthiyas"));

int i=100;
String s4=String.valueOf(i);
System.out.println(s4);
String s5="86";
int j=Integer.parseInt(s5);
System.out.println(j);
System.out.println(s1);
System.out.println(s1.substring(3));
System.out.println(s1.substring(4, 8));

String s8="09/03/2022";
String s9[]=s8.split("/");
System.out.println(s9[0]);
System.out.println(s9[1]);
System.out.println(s9[2]);
System.out.println(s8.replace("2022", "2023"));

}

}
