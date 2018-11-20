/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *
 * @author asd
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXHamburger h;

    @FXML
    private JFXDrawer d;
    

  @FXML
    private Pane p;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 

      d.setSidePane(p);
     
        
      HamburgerBackArrowBasicTransition ha = new HamburgerBackArrowBasicTransition(h);
      ha.setRate(-1);
  
      h.setOnMouseClicked(new EventHandler() {
          @Override
          public void handle(Event event) {
           ha.setRate(ha.getRate()*-1);
              ha.play();
              
           if(d.isShown())
               d.close();
           else    
              d.open();
          }});
        
    }    
    
}
