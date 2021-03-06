import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Trapezoid("test", 3, 3,4,5);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Ellipse("test3", 3,9);
		Shape d = new Circle("test4", 1.5);
		
		sorter.sortShapes();
		sorter.addShape(c);
		sorter.addShape(a);
		sorter.addShape(d);
		sorter.addShape(b);
		Assert.assertEquals(c, sorter.shapes.get(0));
		Assert.assertEquals(a, sorter.shapes.get(1));
		Assert.assertEquals(d, sorter.shapes.get(2));
		Assert.assertEquals(b, sorter.shapes.get(3));		
		
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Trapezoid("test", 3, 3,4,5);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Ellipse("test3", 3,9);
		Shape d = new Circle("test4", 1.5);
		
		sorter.sortShapes(new ShapeAreaComparator());
		
		sorter.addShape(c);
		sorter.addShape(a);
		sorter.addShape(d);
		sorter.addShape(b);
		Assert.assertEquals(c, sorter.shapes.get(0));
		Assert.assertEquals(a, sorter.shapes.get(1));
		Assert.assertEquals(d, sorter.shapes.get(2));
		Assert.assertEquals(b, sorter.shapes.get(3));		
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...ShapeSorter sorter = new ShapeSorter();
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Trapezoid("test", 3,3,3,3);
		Shape b = new Square("test2", 4);
		Shape c = new Circle("test3", 6);
		Shape d = new EquilateralTriangle("test4", 8);
		
		sorter.addShape(c);
		sorter.addShape(a);
		sorter.addShape(d);
		sorter.addShape(b);
		sorter.sortShapes(new ShapePerimeterComparator());
		
		Assert.assertEquals(a, sorter.shapes.get(0));
		Assert.assertEquals(b, sorter.shapes.get(1));
		Assert.assertEquals(d, sorter.shapes.get(2));
		Assert.assertEquals(c, sorter.shapes.get(3));	
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		Shape s1 = new Square("first",1.0);
		Shape s2 = new Rectangle("second",3.0,2.0);
		
		sorter.addShape(s1);
		sorter.addShape(s2);
		
		Assert.assertEquals("[Square:	 ID = first	 area = 1.000	 perimeter = 4.000, Rectangle:	 ID = second	 area = 6.000	 perimeter = 10.000]", sorter.toString());
		

	}
}
