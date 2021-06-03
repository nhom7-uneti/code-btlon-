import javax.swing.text.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;

/** Sử dụng JEditorPane để hiển thị một trang web dang text?html

 */
public class OReillyHomePage {
    public static void main(String[] args) {
        // tạo JEditorPane = jep 
     JEditorPane jep = new JEditorPane();
     jep.setEditable(false);   
     
     try {
       jep.setPage("http://www.oreilly.com");
     }
     catch (IOException e) {
       jep.setContentType("text/html");
       jep.setText("<html>Could not load http://www.oreilly.com </html>");
     } 
      
     JScrollPane scrollPane = new JScrollPane(jep);     
     JFrame f = new JFrame("O'Reilly & Associates");
     // Next line requires Java 1.3
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.getContentPane().add(scrollPane);
     f.setSize(512, 342);
     f.show();
    
  }

}

