
public class Rectangle extends Polygon {

	
	private double length;
	private double width;

	
	public Rectangle(String id, double length, double width)
	{
		// TODO: complete this...
		super(id);
		this.length = length;
		this.width = width;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	
	public double getPerimeter() {
		return length+length+width+width;
	}

	@Override
	public String getShapeType() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

}
