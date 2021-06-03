import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author duong
 */
public class LinkFollower implements HyperlinkListener  {
    private JEditorPane pane;
  
  public LinkFollower(JEditorPane pane) {
    this.pane = pane;
  }

  public void hyperlinkUpdate(HyperlinkEvent evt) {
    
    if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
      try {
        pane.setPage(evt.getURL());        
      }
      catch (Exception e) {        
      } 
    }
    
  }

}


