package Paint;
import java.*;
import java.util.List;
import java.util.ArrayList;;

public class Console{

	public static void main(String[] args) {
		ArrayList<Shape> s = new ArrayList<>();
		
		
		Square p = new Square(2,"#b50aba",100);
		p.draw();
		p.getArea();
		p.getName();
		p.getHexColor();
		p.getBorderWidth();

		Rectangle d = new Rectangle(5,3,"#b50aba",90);
		d.draw();
		d.getArea();
		d.getName();
		d.getHexColor();
		d.getBorderWidth();
		
		Circle c= new Circle(5,"#b50aba",10);
		c.draw();
		c.getArea();
		c.getName();
		c.getHexColor();
		c.getBorderWidth();
		
	}

}
