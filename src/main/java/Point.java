public class Point {
	private final double coordonneesX;
	private final double coordonneesY;
	
	public Point(double coordonneesX, double coordonneesY) {
		this.coordonneesX = coordonneesX;
		this.coordonneesY = coordonneesY;
	}

	public double getCoordonneesX() {
		return coordonneesX;
	}

	public double getCoordonneesY() {
		return coordonneesY;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if(!memeReel(this.coordonneesX, other.getCoordonneesX()) || !memeReel(this.coordonneesY, other.getCoordonneesY())) {
			return false;
		}
		return true;
	}

	public double distance(Point p) {
		return Math.sqrt(Math.pow(p.getCoordonneesY() - this.coordonneesY, 2) + Math.pow(p.getCoordonneesX() - this.coordonneesX, 2));
	}
	
    static boolean memeReel(double a, double b) {
    	if(Math.abs(a - b) < 1e-10) {
    		return true;
    	}
    	return false;
    }

	@Override
	public String toString() {
		return " <" + coordonneesX + "," + coordonneesY + "> ";
	}
    
}
