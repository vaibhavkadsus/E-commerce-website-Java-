package UserAuthentication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import UserClientdetails.UserDetails;

public class CreateAccount {
	Scanner sc=new Scanner(System.in);
	UserDetails obj=new UserDetails();
	public void createaccount() throws IOException {
		System.out.println("***Create Account***");
		System.out.print("Enter User Name: ");
		String uname1=sc.next()+sc.nextLine();
		for(int i=0;i<uname1.length();i++) {
			char x=uname1.charAt(i);
			if((x>='A' && x<='Z')||(x>='a'&&x<='z')||(x==' ')){
				obj.setUname1(uname1);
			}else {
				System.out.println("Enter valid name");
			}
		}
		System.out.print("Enter your Email Id: ");
		String uemail=sc.next()+sc.nextLine();
		for(int i=0;i<uemail.length();i++) {
		char ch=uemail.charAt(i);
		if(ch!=' ') {
			obj.setUemail(uemail);
		}else {
			System.out.println("Enter valid email");
		}
		}
		System.out.print("Enter Mobile number:");
		long umNo=sc.nextLong();
		int len=String.valueOf(umNo).length();
		if(len==10) {
			obj.setUmNo(umNo);
		}else {
			System.out.println("Enter valid mobile number");
		
		}
		System.out.print("Create password:");
		String upassword1=sc.next();
		obj.setUpassword1(upassword1);
		
		File f=new File("A.txt");
		f.createNewFile();
		
		FileWriter fw=new FileWriter(f);
		fw.write(uname1);
		fw.write("\n"+upassword1);
		fw.close();
		System.out.println("||----|| Thank you for providing the details. Your account has been successfully created! ||----||");
	}
	public void login() {
		System.out.println("***Login***");
		System.out.print("Enter User name: ");
		String uname2=sc.next()+sc.nextLine();
		obj.setUname2(uname2);
		System.out.print("Enter Password: ");
		String upassword2=sc.next()+sc.nextLine();
		obj.setUpassword2(upassword2);
		
		if(uname2.equals(obj.getUname1())&&upassword2.equals(obj.getUpassword1())) {
			System.out.println();
			System.out.println("login successfully........");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("User name and password is wrong...");
			System.out.println();
		}
		
	}
	public void exit() {
		System.exit(0);
	}
	
}
