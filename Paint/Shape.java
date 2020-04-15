package Paint;
import java.util.*;


interface Shape{
	void draw();
	void getArea();
	default void getName() {
		System.out.println("Shape simplu...");
	}
	void getHexColor();
	void getBorderWidth();
}
