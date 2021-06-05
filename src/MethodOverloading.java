
public class MethodOverloading {

	public void sum() {
		System.out.println("blank");
	}

	public void sum(String a) {
		System.out.println(a);
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.sum();
		m.sum("Sankalpa");
		m.sum(10, 20);
	}

}
