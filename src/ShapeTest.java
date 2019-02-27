import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for shapes and their comparators.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeTest
{
	//==================================================================================================================
	// Basic Shape Testing:
	//==================================================================================================================
    /**
     * Tests for the square class.
     */
	@Test
	public void SquareTest()
	{
		Shape sqr = new Square("Square1", 3.0);
		Assert.assertEquals("Square area incorrect.", 9.0, sqr.getArea(), 0.0001);
		Assert.assertEquals("Square perimeter incorrect.", 12.0, sqr.getPerimeter(), 0.0001);
		Assert.assertEquals("Square type incorrect.", "Square", sqr.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Square1", sqr.getId());
	}

	/**
     * Tests for the rectangle class.
     */
	@Test
	public void RectangleTest()
	{
		// TODO: complete this...
		Shape rec = new Rectangle("Rec1", 5.0, 5.0);
		Assert.assertEquals("Rectangle area incorrect.", 25.0, rec.getArea(), 0.0001);
		Assert.assertEquals("Rectangle perimeter incorrect.", 20.0, rec.getPerimeter(), 0.0001);
		Assert.assertEquals("Rectangular type incorrect.", "Rectangle",rec.getShapeType());
		Assert.assertEquals("Shape ID incorrect.",  "Rec1", rec.getId());
	}

	/**
     * Tests for the EquilateralTriangle class.
     */
	@Test
	public void TriangleTest()
	{
		// TODO: complete this...
		Shape tri = new EquilateralTriangle("trix", 5.0);
		Assert.assertEquals("Triangle area incorrect.", 10.8253, tri.getArea(), 0.0001);
		Assert.assertEquals("Triangle perimeter incorrect.", 15.0, tri.getPerimeter(), 0.0001);
		Assert.assertEquals("Triangle type incorrect.", "EquilateralTriangle",tri.getShapeType());
		Assert.assertEquals("Shape ID incorrect.",  "trix", tri.getId());
	}

	/**
     * Tests for the trapezoid class. Also test that IDs are done correctly.
     */
	@Test
	public void TrapezoidTest()
	{
		// TODO: complete this...
		Shape traipe = new Trapezoid("ugh", 5.0, 5.0, 6.0, 7.0);
		Assert.assertEquals("Triangle area incorrect.", 32.33709, traipe.getArea(), 0.0001);
		Assert.assertEquals("Triangle perimeter incorrect.", 23.0, traipe.getPerimeter(), 0.0001);
		Assert.assertEquals("Triangle type incorrect.", "Trapezoid",traipe.getShapeType());
		Assert.assertEquals("Shape ID incorrect.",  "ugh", traipe.getId());
		
	}

	/**
     * Tests for the ellipse class. Also test that IDs are done correctly.
     */
	@Test
	public void EllipseTest()
	{
		Shape circ = new Ellipse("Ellipse1", 3.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(3, 2) + Math.pow(3, 2)) / 2),
				circ.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse1", circ.getId());

		Shape circs = new Ellipse("Ellipse2", 5.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3*5, circs.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(5.0, 2) + Math.pow(3.0, 2)) / 2),
				circs.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circs.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse2", circs.getId());
	}

	/**
     * Tests for the circle class. Also test that IDs are done correctly.
     */
	@Test
	public void CircleTest()
	{
		// TODO: complete this...
		Shape circle = new Circle("Circle1", 3.0);
		Assert.assertEquals("Circle area incorrect.",  Math.PI*3*3, circle.getArea(),.0001);
		Assert.assertEquals("Circle perimeter incorrect.", 2*Math.PI*3.0, circle.getPerimeter(),0.0001);
		Assert.assertEquals("Circle type incorrect.", "Circle",circle.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Circle1", circle.getId());
	}

	/**
	 * Tests for Shape's toString().
	 */
	@Test
	public void ShapeToStringTest()
	{
		// TODO: complete this...
		Shape new1 = new Square("first", 5.0);
		Shape new2 = new Rectangle("second", 5.0, 1.0);
		Assert.assertEquals("Square:	 ID = first	 area = 25.000	 perimeter = 20.000", new1.toString());
		Assert.assertEquals("Rectangle:	 ID = second	 area = 5.000	 perimeter = 12.000", new2.toString());

	}

	//==================================================================================================================
	// Comparisons:
	//==================================================================================================================
	/**
     * Tests for the Shape Area Comparator class.
     */
	@Test
	public void CompareAreaTest()
	{
	    // Test equals:
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapeAreaComparator sc = new ShapeAreaComparator();
		Assert.assertEquals("ShapeAreaComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapeAreaComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test equal perimeter, different area:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
	}

	/**
     * Tests for the Shape Perimter Comparator class.
     */
	@Test
	public void ComparePerimeterTest()
	{
		// TODO: complete this...
		Shape circe = new Square("x1", 5.0 );
		Shape elip = new Rectangle("y1", 5.0,5.0);
		
		ShapePerimeterComparator pc = new ShapePerimeterComparator();
		Assert.assertEquals("ShapePerimeterComparator should find shapes equal.", 0, pc.compare(circe, elip));
		Assert.assertTrue("ShapePerimeterComparator should find shapes equal.", pc.equals(circe, elip));

		// Test equal area, different perimeter:
		Shape circe2 = new Square("x2", 5.0 );
		Shape elip2 = new Rectangle("y2",2.0,3.0);
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1, pc.compare(circe2, elip2));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, pc.compare(elip2, circe2));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", pc.equals(circe2, elip2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1, pc.compare(circe2, elip2));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, pc.compare(elip2, circe2));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", pc.equals(circe2, elip2));
		
	}

	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 */
	@Test
    public void NaturalCompareTest()
    {
		// TODO: complete this...
		Shape rect = new Rectangle("x1", 9.0, 4.0);
		Shape sq1 = new Square("y1", 6.0);
		Shape sq2 = new Square("z1", 6.0);
		Assert.assertEquals("CompareTest should find shapes equal", 0,sq2.compareTo(sq1));
		Assert.assertEquals("CompareTest found shapes inequal", -1, sq1.compareTo(rect));
		Assert.assertEquals("CompareTest found shapes inequal", 1,rect.compareTo(sq2));

    }
}
