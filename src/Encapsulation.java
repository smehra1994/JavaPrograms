
public class Encapsulation {

	private static String productName;
	private static int price;
	
	public Encapsulation(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		Encapsulation s=new Encapsulation(productName,price);
		s.setPrice(10);
		s.setProductName("Mobile");
		System.out.println(s.getPrice());
		System.out.println(s.getProductName());
		
	}

	}




