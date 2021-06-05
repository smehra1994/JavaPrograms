
public final class ImmutableClass2WithFinal {
	
	final String name;
	final int age;
	
	public ImmutableClass2WithFinal (String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
//we don't use setters in immutable class so there is no option to change value of instance variables
//if you don't use final keyword in class name and variables then u can write setter method too
	
	public static void main(String[] args) {
		ImmutableClass2WithFinal s=new ImmutableClass2WithFinal("Sankalpa",27);
		System.out.println(s.getName());
		System.out.println(s.getAge());

	}

}
