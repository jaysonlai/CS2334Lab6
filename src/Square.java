
public class Square extends Rectangle {
	private double length;

	
	public Square(String id, double length)
	{
		// TODO: complete this...
		super(id, length,length);
		this.length = length;
	}
	

	@Override
	public String getShapeType() {
		// TODO Auto-generated method stub
		return "Square";
	}


}
