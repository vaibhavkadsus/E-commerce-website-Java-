package UserAuthentication;

import java.util.ArrayList;
import java.util.List;

import UserClientdetails.Productd;

public class Ecommerce {
	List<Productd> list=new ArrayList<>();
	public void proList() {
		Productd obj1=new Productd(101," Oppo Reno 5 Pro+ ",29000l);
		Productd obj2=new Productd(102," Oppo Reno 6 Pro+ ",32000l);
		Productd obj3=new Productd(103," Oppo Reno 7 Pro+ ",35000l);
		Productd obj4=new Productd(104," Oppo Reno 8 Pro+ ",34000l);
		Productd obj5=new Productd(105," Oppo Reno 9 Pro+ ",38000l);
		Productd obj6=new Productd(106," Oppo Reno 10 Pro+ ",40000l);
		Productd obj7=new Productd(107," Oppo Reno 11 Pro+ ",42000l);
		Productd obj8=new Productd(108," Oppo Reno 12 Pro+ ",44000l);
		Productd obj9=new Productd(109," Oppo Reno 13 Pro+ ",45000l);
		Productd obj10=new Productd(110," Oppo Reno 14 Pro+ ",46000l);
		Productd obj11=new Productd(111," Oppo Reno 15 Pro+ ",42000l);
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj6);
		list.add(obj7);
		list.add(obj8);
		list.add(obj9);
		list.add(obj10);
		list.add(obj11);
		System.out.println("Buy Mobile List..........");
		System.out.println();
		list.forEach((i)->System.out.println(i));
		System.out.println();
	}	
	public Productd selectProductById(int proid) {
        for (Productd product :  list) {
            if (product.proid==proid) {
                return product;
            }
        }
        return null;
    }
	ArrayList<Productd> cart = new ArrayList<>();
	public void addToCart(Productd product) {
        cart.add(product);
        System.out.println("***"+product.proname + " has been added to your cart.");
        System.out.println();
    }
	  public void addProduct(Productd product) {
	        list.add(product);
	    }
	  public void bill() {
		  double gst=0;
		  double totalbill=0;
		  double fbill=0;
		  System.out.println();
		  System.out.println("Your cart: ");
		  for (Productd product : cart) {
			  System.out.println(product);
			  totalbill=totalbill+product.price;
			  gst=totalbill*0.18;
			  fbill=totalbill+gst;
		  }
		  System.out.println("Your bill is "+fbill);
	  }
	  public void removeProductById(int id) {
	        boolean removed = false;
	        for (Productd product : cart) {
	            if (product.proid == id) {
	                cart.remove(product);
	                System.out.println(product.proname + " has been removed from the cart.");
	                removed = true;
	                break;
	            }
	        }

	        if (!removed) {
	            System.out.println("Product with ID " + id + " not found in the cart.");
	        }
	    }

}
