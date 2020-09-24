import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testConstructor() {
		Point[] coordonnees = { new Point(3,2), new Point(4,3), new Point(3,3), new Point(4,2) };
		Polygone rect = new Rectangle(coordonnees);
	}
	
	@Test
	public void testSommetsToCoordonnees() {
		Point[] coordonnees = { new Point(3,3), new Point(4,3), new Point(4,2), new Point(3,2) };
		coordonnees.equals(Rectangle.sommetsToCoordonnees(coordonnees[0], coordonnees[2]));
	}

	@Test
	public void testSurface() {
		Polygone rect = new Rectangle(new Point(0,2), new  Point(3,0));
		assertEquals(6, rect.surface(), 0.0001);
	}
}
