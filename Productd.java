package UserClientdetails;

public class Productd {
	public int proid;
	public String proname;
	public double price;
	public Productd(int proid, String proname, double price) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile id= " + proid + ", Mobile Name=" + proname + ", Mobile price= " + price;
	}
	

}
