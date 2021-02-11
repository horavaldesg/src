public class Rectangle
{
    //You can declare instance variables (properties) anywhere outside
    //a method, but we usually put them at the start of a class to
    //keep everything organized
    private double x;
    private double y;
    //TODO: add width and height
    private double width;
    private double height;
    //The constructor is what initializes a class
    //Classes can have multiple constructors

    //A default constructor has no parameters
    public Rectangle()
    {
        x = 0;
        y = 0;
        //TODO: width and height
        width = 10;
        height = 10;
    }
    //We can also have one or more parameterized constructors
    public Rectangle(double x, double y, double width, double height)
    {
        //We can declare parameters with the same name as properties, but
        //this will "hide" the properties inside that method. We can still
        //refer to the properties by typing "this." before the property name
        this.x = x;
        this.y = y;
        //TODO: set width and height
        this.width = width;
        this.height = height;
        
    }

    //Below are all of the rectangle's methods. I've written the shorter
    //methods on one line

    //Methods that just allow us to access a property are called "accessor" or
    //"getter" methods, and normally have names starting with "get"
    public double getX() { return x; }
    public double getY() { return y; }
    //TODO: write getters for width/height
    public double getWidth() { return width;}
    public double getHeight() { return height;}

    //Methods that allow us to modify a property are called "mutator" or "setter"
    //methods, and normally have names starting with "set"
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    //TODO: write setters for width/height
    //TODO: restrict width/height to positive numbers
    public void setWidth(double width) { this.width = Math.abs(width); }
    public void setHeight(double height) { this.height = Math.abs(height); }
    
    //TODO: add getArea and getPerimeter methods
    public double getArea() { return width * height;}
    public double getPerimeter() { return 2 * (width + height);}
    //TODO (OPTIONAL): add containsPoint method
    public boolean containsPoint(double px, double py) {
    	return x <= px && px<= (x + width) &&
    			y<= py && py<= (y+height);
    }
    //TODO: Write a TestRectangle  class (in a different file) that does the following:
    //		1. Creates a rectangle object using the 0-parameter constructor of Rectangle
    //		2. Creates a rectangle object using the parameterized constructor of Rectangle
    //		3. Prints the location as well as the height and width of each rectangle
    //		4. Sets the height and width of the first rectangle to 5 and 10 respectively
    //		5. Prints the area and parameter of each rectangle
}