import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public class Triangle extends Figure {
	
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, FabriquePoint fabrique) {
    	super(fabrique);
    	this.ajouterPoint(fabrique.creerPoint(x1, y1));
    	this.ajouterPoint(fabrique.creerPoint(x2, y2));
    	this.ajouterPoint(fabrique.creerPoint(x3, y3));
    }

	@Override
	public void tracer(Graphics g) {
		Polygon triangle = new Polygon();
		List<Point> points = this.getPoints();
		for (Point p : points)
			triangle.addPoint(p.getAbscisse(), p.getOrdonnée());
		g.drawPolygon(triangle);
	}

}
