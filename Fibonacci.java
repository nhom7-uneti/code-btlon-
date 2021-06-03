import javax.swing.text.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;

/**
 *
 * @author duong
 */
public class Fibonacci {
    public static void main(String[] args) {
              
     StringBuffer result = 
      new StringBuffer("<html><body><h1>Fibonacci Sequence</h1><ol>");   
     
     long low = 0;
     long high = 1;
        
     for (int i = 0; i < 50; i++) {
       result.append("<li>");
       result.append(low);
       long temp = high;
       high = low + high;
       low = temp;
     }  
        
     result.append("</ol></body></html>");
     
     JEditorPane jep = new JEditorPane("text/html", result.toString());
     jep.setEditable(false);    
      
     JScrollPane scrollPane = new JScrollPane(jep);     
     JFrame f = new JFrame("Fibonacci Sequence");
     f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
     f.getContentPane().add(scrollPane);
     f.setSize(512, 342);
     f.show();
    
  }

}

