import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<Figure>();
        FabriquePoint fabriqueBlue = new FabriquePointC(Color.blue);
        FabriquePoint fabriqueOrange = new FabriquePointC(Color.orange);
        FabriquePoint fabriqueRed = new FabriquePointC(Color.red);
        FabriquePoint fabriqueNoire = new FabriquePointNB();
        figures.add(new Rectangle(50, 50, 100, 100,fabriqueOrange));
        figures.add(new Cercle(200, 300, 200, 150, fabriqueBlue));
        figures.add(new Rectangle(90, 90, 450, 350, fabriqueNoire));
        figures.add(new Cercle(120, 250, 120, 300, fabriqueNoire));
        figures.add(new Cercle(100, 100, 0, 100, fabriqueRed));
        figures.add(new Triangle(200, 400, 300, 100, 100, 250, fabriqueRed));
        new FenetreFigures(figures);
    }
    
}
