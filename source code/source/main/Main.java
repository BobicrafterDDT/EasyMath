package source.main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Logger;
import source.graph.WindowGraph;
import source.programs.math.EasyMath;
//import source.html.OpenPage;

public class Main {
    private static final Logger LOG = Logger.getLogger("Math");
    public Main() {}
    public Main(String msg) {
       LOG.info(msg);
    }
    public static void main(String[] args) throws URISyntaxException, IOException {
       LOG.info("Starting console...");
       EasyMath aa = new EasyMath();
       WindowGraph ab = new WindowGraph();
       Main main = new Main();
       //LOG.info("Opening webpage...");
       //OpenPage ac = new OpenPage();
       //ac.openWebPage();
       LOG.info("Starting Dialog Interface...");
       ab.startMenu();
    }
}
