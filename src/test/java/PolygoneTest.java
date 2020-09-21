

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PolygoneTest
{
    
  @Test
  public void testPerimeter1(){
      
      Point []pts = {
          new Point(-1,3),
          new Point(1,3),
           new Point(4,-1),
          new Point(-1,-1)
        };

      Polygone poly = new Polygone(pts);
      assertEquals(16,poly.getPerimeter(),0.00001);
      
      
  }
  
  
  @Test
  public void testGetTextSommet(){
      
      Point []pts = {
          new Point(-1,3),
          new Point(1,3),
           new Point(4,-1),
          new Point(-1,-1)
        };

      Polygone poly = new Polygone(pts);
      assertEquals(" <-1.0,3.0>  <1.0,3.0>  <4.0,-1.0>  <-1.0,-1.0> ",poly.texteSommets());
      
  }
  
    @Test
  public void testGetTextSommet2(){
      
      Point []pts = {
          new Point(-1,3),
          new Point(1,3),
           new Point(4,-1),
          new Point(-1,-1)
        };

      Polygone poly = new Polygone(pts);
      assertEquals("polygone à 4 sommets <-1.0,3.0>  <1.0,3.0>  <4.0,-1.0>  <-1.0,-1.0> ",poly.toString());
      
      
  }
  
  
    @Test
  public void testPolyEquals(){
      
      Point []pts = {
          new Point(-1,3),
          new Point(1,3),
           new Point(4,-1),
          new Point(-1,-1)
        };
        
        Point []pts2 = {
            new Point(-1,-1),
          new Point(-1,3),
          new Point(1,3),
           new Point(4,-1)
          
        };
        
        Point []pts3 = {
            new Point(-1,-1),
          new Point(-1,3),
          new Point(1,3),

          
        };
        
            Point []pts4 = {
            new Point(-1,-2),
          new Point(-1,3),
          new Point(1,3),
           new Point(4,-1)
          
        };

      Polygone poly1 = new Polygone(pts);
      //same coordinates, moved by 1
      Polygone poly1bis = new Polygone(pts);
      Polygone poly2 = new Polygone(pts2);
      Polygone poly3 = new Polygone(pts3);
      Polygone poly4 = new Polygone(pts4);
      
      assertTrue(poly1.equals(poly1bis));
      assertTrue(poly1.equals(poly2));
      assertFalse(poly1.equals(poly3));
      assertFalse(poly1.equals(poly4));
      try{
      assertFalse(poly1.equals(null));
      fail();
    }   
    catch(java.lang.RuntimeException e){
assertEquals("incompatible Type",e.getMessage());
      
      
      }
  }
  
}
