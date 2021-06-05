

public class CallByValue {

	public void Sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		CallByValue c=new CallByValue();
		int x=10;
		int y=10;
		c.Sum(x, y);
	}

}
