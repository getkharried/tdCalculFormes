

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest
{
  
    
    @Test
    public void testsurface(){

        Polygone tri = new Triangle(new Point(-3,4),new Point(-3,-4),new Point(3,-4));
        assertEquals(24,tri.getPerimeter(),0.0001);
        assertEquals(24,tri.surface(),0.0001);
        
    }
    
    @Test
    public void testTypeTriangle(){
        {
    
        Polygone tri = new Triangle(new Point(0,0),new Point(0,1),new Point(1,0));
        assertEquals("triangle isocèle <0.0,0.0>  <0.0,1.0>  <1.0,0.0> ",tri.toString());
        }
        
        {
        Polygone tri = new Triangle(new Point(1,5),new Point(0,1),new Point(1,0));
        assertEquals("triangle quelconque <1.0,5.0>  <0.0,1.0>  <1.0,0.0> ",tri.toString());
        }
        
        {
        Polygone tri = new Triangle(new Point(0f,0f),new Point(1f,0f),new Point(0.5,Math.sqrt(3)/2.0));
        System.out.println(tri.getPerimeter());
        assertEquals("triangle équilatéral <0.0,0.0>  <1.0,0.0>  <0.5,0.8660254037844386> ",tri.toString());
        }

        
        
    }
}
