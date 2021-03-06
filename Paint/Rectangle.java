package Paint;
import java.util.*;


public class Rectangle implements Shape{
	private int lungime;
	private int latime;
	private String fillColor ;
	private int border;
	private static final String nume = "Dreptunghi";
	
	Rectangle(int l,int la,String s,int b){
		this.lungime=l;
		this.latime=la;
		this.fillColor=s;
		this.border=b;
	}
	
	
	public void draw() {
		int rows = latime;
		int columns = lungime;
		String array[][]= new String[rows][columns];

		if(lungime==0 && latime==0) {
			System.out.println("Valoare 0");
		}else {
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				array[i][j] = "#";

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();		 
			} 
		}
		}
	
	public void getArea() {
		System.out.println("Aria patratului este:"+(lungime*latime));	
	}
	
	public void getName() {
		System.out.println("Acesta este un :"+nume);
	}
	
	public void getHexColor() {
		System.out.println("Culoarea in format hex este:"+fillColor);
	}
	
	public void getBorderWidth() {
		System.out.println("Grosime chenar:");
		int rows = latime;
		int columns = lungime;
		String array[][]= new String[rows][columns];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				array[i][j] = "#";
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				// condition for obtaining the boundary elements
				if(i==0 || j==0 || i == rows-1 || j == columns-1) 
					System.out.print(array[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
