package source.programs.others;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class ImageWriter {
   
   public ImageWriter(){}
   public ImageWriter(String fileDestination, String fileOutputDestination) 
                      throws FileNotFoundException, IOException {
       int width = 10;
       int height = 10;
       int x = 0;
       int y = 0;
      File file = new File(fileDestination);
      Scanner sc = new Scanner(file);
      StringBuffer sb = new StringBuffer();
      getFileLines(file.getPath());
      
      while(sc.hasNext()) {
         sb.append(sc.nextLine());
      }
      char[] CharGroup = sb.toString().toCharArray();
      for (int j = 0; j < CharGroup.length; j++) {
         if (CharGroup[j] == '/') {
            width = j;
            break;  
         }
      }
      BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
      Graphics2D g2d = bi.createGraphics();
      
      for (int i = 0; i <= CharGroup.length - 1; i++) {
         char curChar = CharGroup[i];
         switch (curChar) {
             case '1' -> {
                g2d.setColor(Color.BLACK);
                g2d.drawRect(x, y, 1, 1);
                g2d.fillRect(x, y, 1, 1);
                x++;
             }
             case '0' -> {
                g2d.setColor(Color.WHITE);
                g2d.drawRect(x, y, 1, 1);
                g2d.fillRect(x, y, 1, 1);
                x++;
             }
             case '/' -> {
                x = 0;
                y++;
             }
         }
         
      }
      try {
         ImageIO.write(bi, "jpg", 
                       new File( fileOutputDestination));
      }catch (IOException e) { 
         e.printStackTrace();
      }
   }
   public long getFileLines(String filePath) throws IOException {
      String fileName = filePath;
      long noOfLines = -1;

      try(LineNumberReader lineNumberReader =
    	new LineNumberReader(new FileReader(new File(fileName)))) {
  	lineNumberReader.skip(Long.MAX_VALUE);
  	noOfLines = lineNumberReader.getLineNumber() + 1;
      }
      return noOfLines;
   }   
}
