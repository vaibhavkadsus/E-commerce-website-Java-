package userService;

import java.io.IOException;
import java.util.Scanner;
import UserAuthentication.CreateAccount;
import UserAuthentication.Ecommerce;

import UserClientdetails.Productd;

public class Test {

	public static void main(String[] args) throws IOException {
		System.out.println("----------------------------------------------------------");
		System.out.println("||***********Welcome to my E-Commerce Website***********||");
		System.out.println("----------------------------------------------------------");
		CreateAccount cobj=new CreateAccount();
		Ecommerce eobj=new Ecommerce();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter your choice \n1.Login\n2.Create Account\n3.Exit");
		int ch=sc.nextInt();
		switch(ch){
		case 1:{
			cobj.login();
			break;
		}
		case 2:{
			cobj.createaccount();
			cobj.login();
			eobj.proList();
			System.out.print("Enter the ID of the Mobile to add to your cart: ");
			int productId = sc.nextInt();
	        Productd selectedProduct = eobj.selectProductById(productId);
	        if (selectedProduct != null) {
	            eobj.addToCart(selectedProduct);
	        } else {
	            System.out.println("Product not found.");
	        }
	        System.out.println("Do you want to add more Mobiles? (yes/no)");
            String addMore = sc.next();
            while(addMore.equalsIgnoreCase("yes")) {
            	System.out.println("Enter the ID of the Mobile to add to your cart:");
    			productId = sc.nextInt();
    	        selectedProduct = eobj.selectProductById(productId);
    	        if (selectedProduct != null) {
    	            eobj.addToCart(selectedProduct);
    	            break;
    	         } else {
    	            System.out.println("Product not found.");
    	        }	
    	        }
            System.out.println("Do you want to remove your cart Mobiles? (yes/no)");
            String remove = sc.next();
            while(remove.equalsIgnoreCase("yes")) {
            	productId = sc.nextInt();
            	eobj.removeProductById(productId);
            	eobj.bill();
            }
            eobj.bill();
            
            }
		case 3:{
			cobj.exit();
			}
		}
		}
	}
	}

