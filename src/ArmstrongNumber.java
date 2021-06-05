/*Armstrong number : 
number:153 or 407 or 0 or 1
1*1*1=1
5*5*5=125
3*3*3=27
1+125+27=153
num=num/10; -- gives u last digit of number*/
public class ArmstrongNumber {

	public static void isArmstrong(int num)
	{
		int cube=0;
		int remainder;
		int originalInteger;
		
		originalInteger=num;
		
		while(num>0)                                                          // 2 LOOP :15>0-YES     //1>0-yes
		{
			remainder=num%10;                          //153%10=3             // 2 LOOP :15%10=5      //1%10=1
			num=num/10;                                //153/10=15            //2 LOOP :15/10=1       //1/10=0
			cube=cube+(remainder*remainder*remainder); //0+(3*3*3)=0+27=27    //2 LOOP :0+5*5*5=125   //0+1*1*1=1--loop stops as next 1>0--no
		}
		if(originalInteger==cube)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}
	
	public static void main(String[] args) {
	
		isArmstrong(120);
	}

}
