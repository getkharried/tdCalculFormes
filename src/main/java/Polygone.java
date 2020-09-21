import java.util.Arrays;

public class Polygone {
	protected final Point[] coordonnees;

	public Polygone(Point[] coordonnees) {
		this.coordonnees = coordonnees;
	}

	public Point[] getSommets() {
		return this.coordonnees;
	}

	public String texteSommets() {
		String texte = "";
		for (Point p : coordonnees) {
			texte += p.toString();
		}
		return texte;
	}

	public double getPerimeter() {
		double perimetre = 0.00;
		for (int i = 0; i < this.coordonnees.length - 1; i++) {
			perimetre += coordonnees[i].distance(coordonnees[i + 1]);
		}
		perimetre += coordonnees[0].distance(coordonnees[coordonnees.length - 1]);
		return perimetre;
	}

	public double surface() {
		throw new RuntimeException();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			throw new RuntimeException("incompatible Type");
		}
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Polygone other = (Polygone) obj;
		if(this.coordonnees.length != other.coordonnees.length) {
			return false;
		}
		int k = 0;
		for (int i = 0; i < this.coordonnees.length; i++) {
			for (int j = 0; j < this.coordonnees.length; j++) {
				if (this.coordonnees[i].equals(other.coordonnees[j])) {
					k++;
				}
			}
		}
		if(k == other.coordonnees.length) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "polygone à " + coordonnees.length + " sommets" + this.texteSommets();
	}
}