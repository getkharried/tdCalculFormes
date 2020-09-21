

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PointTest
{

    @Test
    public void testDistance(){
        Point p1=new Point(1,2);
        Point p2=new Point(1,3);
        Point p3=new Point(4,3);
        assertEquals(1,p1.distance(p2),00000001);
        assertEquals(Math.sqrt(10),p1.distance(p3),00000001);
    }
    @Test
    public void testTwoPointsEquals(){
        Point p1=new Point(1,2);
        Point p2=new Point(1,3);
        Point p3=new Point(1,2);
        assertFalse(p1.equals(p2));
        assertTrue(p1.equals(p3));
        
    }
    
    
     @Test
    public void testPointsToString(){
        Point p1=new Point(1,2);
        assertEquals(" <1.0,2.0> ",p1.toString());

        
    }
    
    @Test
    public void testMemeReel(){
        assertFalse(Point.memeReel(1, 2));
        assertTrue(Point.memeReel(1, 0.5*2));
        assertFalse(1.2*3==3.6);
        assertTrue(Point.memeReel(1.2*3, 3.6));
        
    }
}
