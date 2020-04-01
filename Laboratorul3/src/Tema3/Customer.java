package Tema3;
import java.util.*;

public class Customer {
	private String lastName ;
	private String firstName ;
	private int age ;
	private Prob3 adress ;
	private PaymentMethod type ;
	
	public Customer(String ln , String fn , int a ,Prob3 ad) {
		this.lastName = ln ;
		this.firstName = fn ; 
		this.age = a ;	
		this.adress = ad ;
		
	}
	
	public Customer(String ln , String fn , int a ,Prob3 ad,PaymentMethod t) {
		this.lastName = ln ;
		this.firstName = fn ; 
		this.age = a ;	
		this.adress = ad ;
		this.type = t ;
		
	}
	
	public Customer (String ln , String fn , int a) {
		this.lastName = ln ;
		this.firstName = fn ; 
		this.age = a ;	
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public Prob3 getAdress() {
		return adress;
	}

	
	void getCompleteName() 
    { 
	
       System.out.println("Numele:"+getLastName()+",prenumele:"+getFirstName() + ",varsta:"+getAge());
    }
	
	void getCustomer() {  

		System.out.println("Numele:"+lastName+",prenumele:"+firstName+"varsta:"+age);  
		adress.getFullAdress();  
	}
	
	void getCustomerWithPayment() {  

		System.out.println("Numele:"+lastName+",prenumele:"+firstName+"varsta:"+age);  
		adress.getFullAdress();
		type.getPaymentMethod();
	}
	
	void test() {
		adress.getFullAdress();
	}
	
	
	
}