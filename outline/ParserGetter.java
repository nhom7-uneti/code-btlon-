/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outline;

import javax.swing.text.html.*;
/**
 *
 * @author duong
 */
public class ParserGetter extends HTMLEditorKit {
    // purely to make this method public
  public HTMLEditorKit.Parser getParser(){
    return super.getParser();
  }
  
}
