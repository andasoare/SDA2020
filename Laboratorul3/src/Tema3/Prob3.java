package Tema3;

public class Prob3 {

	private String street ;
	private String city ;
	private int number ;
	
	public Prob3(String st , String ct , int nr) {
	    this.street = st;
	    this.city = ct ;
	    this.number = nr;
	  }
	
	public Prob3() {
		
	}
	
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public int getNumber() {
		return number;
	}

    public void getFullAdress() 
    { 
	
       System.out.println("Strada:"+getStreet()+",Orasul :"+getCity()+",numarul: "+getNumber());
    } 
    
    public void foo(){
		try {
			System.out.println("Strada:"+getStreet()+",Orasul :"+getCity()+",numarul: "+getNumber());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException thrown!");
		}
	}
	

}