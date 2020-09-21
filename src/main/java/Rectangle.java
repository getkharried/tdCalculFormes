import java.util.Arrays;

public class Rectangle extends Polygone {
	/**
	 * 
	 * @param coordonnees
	 * @throws IllegalArgumentException
	 * 
	 * Cette classe vérifie que le rectangle est bien plat en vérifiant qu'il y ait bien
	 * au moins 1 point pour chaque qui ait la même coordonnée Y.
	 */
	public Rectangle(Point[] coordonnees) throws IllegalArgumentException {
		super(coordonnees);
		
		for(Point pointTestY : coordonnees) {
			boolean testMemeY = false;
			
			for(Point pointTestY2 : coordonnees) {
				if(pointTestY.getCoordonneesY() == pointTestY2.getCoordonneesY()) {
					testMemeY = true;
				}
			}
			
			if(!testMemeY) throw new IllegalArgumentException("Le rectangle n'est pas plat !");
		}
	}
	
	public Rectangle(Point sg, Point id) {
		this(sommetsToCoordonnees(sg, id));
	}
	
	public static Point[] sommetsToCoordonnees(Point sg, Point id) {
		Point sd = new Point(id.getCoordonneesX(), sg.getCoordonneesY());
		Point ig = new Point(sg.getCoordonneesX(), id.getCoordonneesY());
		
		Point[] coordonnees = { sg, sd, id, ig };
		return coordonnees;
	}
	
	@Override
	/**
	 * Cette fonction prend 1 point origine, calcule les distances aux 3 autres points,
	 * exclut la plus grande (la diagonale qui ne nous intéresse pas) et multiplie la longueur
	 * par la largeur.
	 */
	public double surface() {
		Point origine = this.coordonnees[0];
		double[] distances = new double[3];
		
		for(int i = 1; i <= 3; i++) {
			distances[i-1] += origine.distance(this.coordonnees[i]);
		}
		
		Arrays.sort(distances);
		return distances[0] * distances[1];
	}
	
	@Override
	public String toString() {
		return "Rectangle à plat :" + this.texteSommets();
	}
}
