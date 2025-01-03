package source.html;

import java.awt.Desktop;
import java.io.*;

public class OpenPage {
   public void openWebPage() throws IOException {
      File htmlFile = new File(System.getProperty("user.dir") + "/src/source/html/index.html");
      Desktop.getDesktop().browse(htmlFile.toURI());
      System.out.println(System.getProperty("user.dir"));
   }
   public static void main(String[] args) throws IOException {
      OpenPage op = new OpenPage();
      op.openWebPage();
   }
}
