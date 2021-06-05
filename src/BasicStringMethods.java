
public class BasicStringMethods {

	public static void main(String[] args) {
		
	String str="My name is Sankalpa SMehra";
	String str1="my name is Sankalpa SMehra";
	String str2="  Hello World  ";
	String str4="Hello_World_to_you";
	
	System.out.println(str.length());
	
	System.out.println(str.charAt(3));
	
	System.out.println(str.indexOf('S'));
	
	System.out.println(str.indexOf('S', 12));   //want index of 2nd S so start my range from 12th index 
	
	System.out.println(str.indexOf("is"));
	
	System.out.println(str.indexOf("hii"));   //wont give exception as hiii is not present but give -1
	
	System.out.println(str.equals(str1));
	
	System.out.println(str.equalsIgnoreCase(str1));   //ignores casing
	
	System.out.println(str.substring(0, 5));    //exclude 5th position character
	
	System.out.println(str2.trim());
	
	System.out.println(str2.replace(" ", ""));
	
	String arr[]=str4.split("_");
	System.out.println(arr[0]);
	System.out.println(arr[3]);
	
	System.out.println(str.concat(str4));
	
	String s1="Hello";
	String s2="World";
	int a=100;
	int b=200;
	System.out.println(s1+s2+a+b);    //not 300
	
	
	}

}
