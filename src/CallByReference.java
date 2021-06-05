
public class CallByReference {

	 int q;
	 int p;

	public void Sum(CallByReference c1)
	{
	System.out.println(p+q);
	}
	
	public static void main(String[] args) {
		CallByReference c=new CallByReference();
		c.p=10;
		c.q=90;
		c.Sum(c);
	}

}
