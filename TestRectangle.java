//TODO: Write a TestRectangle  class (in a different file) that does the following:
    //		1. Creates a rectangle object using the 0-parameter constructor of Rectangle
    //		2. Creates a rectangle object using the parameterized constructor of Rectangle
    //		3. Prints the location as well as the height and width of each rectangle
    //		4. Sets the height and width of the first rectangle to 5 and 10 respectively
    //		5. Prints the area and parameter of each rectangle
public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Rectangle param = new Rectangle(0,0,11,25);
		
		System.out.println("(" + param.getX() + " " + param.getY() + ") \nHeight: " + param.getHeight() + " Width: " + param.getWidth());
		param.setHeight(5);
		param.setWidth(10);
		
		System.out.println("Area: " + param.getArea() + " Perimeter: " + param.getPerimeter());
	}
}
