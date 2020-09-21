
public class Triangle extends Polygone
{
	private double distA;
	private double distB;
	private double distC;
	
    public Triangle(Point point, Point point0, Point point1) {
    	super(new Point[] {point, point0, point1});
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double surface(){
    	double p = this.getPerimeter()/2;
    	double a = (float)this.coordonnees[0].distance(this.coordonnees[1]);
    	double b = (float)this.coordonnees[1].distance(this.coordonnees[2]);
    	double c = (float)this.coordonnees[2].distance(this.coordonnees[0]);

    	this.distA = a;
    	this.distB = b;
    	this.distC = c;
    	
    	double surface = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    	return surface;
    }
       
    public String typeTriangle() {
    	this.surface();
    	
    	if(distA == distB && distB == distC) {
        	return "triangle équilatéral";
    	}else if(distA == distB || distB == distC || distA == distC) {
    		return "triangle isocèle";
    	}else {
    		return "triangle quelconque";
    	}
    }
    
    @Override
    public String toString() {
    	return this.typeTriangle() + this.texteSommets();
    }
}