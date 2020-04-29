import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
	
    private List<Point> points;
	
	private FabriquePoint fabrique;

	public Figure(FabriquePoint fabrique) throws IllegalArgumentException {
		if (! this.sontCouleursCompatibles(fabrique)) {
				throw new IllegalArgumentException("Couleurs incompatibles");
		}
		this.fabrique = fabrique;
		this.points = new ArrayList<Point>();
	}
	
    private boolean sontCouleursCompatibles(FabriquePoint fabrique) {
    	return (fabrique.getCouleur().equals(Color.BLACK))
    			|| ((! fabrique.getCouleur().equals(Color.BLACK)));
	}
    
    public List<Point> getPoints() {
    	return this.points;
    }
    
    public Color getCouleur() {
    	return this.getFabrique().getCouleur();
    }
	public FabriquePoint getFabrique() {
		return this.fabrique;
	}
    
	public void ajouterPoint(Point p) {;
		this.points.add(p);
	}
	
	public abstract void tracer(Graphics g);
	
}
