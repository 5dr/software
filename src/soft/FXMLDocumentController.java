/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;

import com.jfoenix.controls.*;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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
//     @FXML
//    private JFXButton log;

    @FXML
    private JFXRadioButton internal;

    @FXML
    private JFXRadioButton external;

    @FXML
    private JFXRadioButton other;
  
    
     public void log (ActionEvent e) throws Exception{
//     
//   
     if(internal.isSelected()){
       Parent root = FXMLLoader.load(getClass().getResource("log1.fxml"));     
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();}
     else if(external.isSelected()){
       Parent root = FXMLLoader.load(getClass().getResource("log2.fxml"));     
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();}
     else if(other.isSelected()){
       Parent root = FXMLLoader.load(getClass().getResource("log3.fxml"));     
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();}
     }
     
    
     
//       Parent root = FXMLLoader.load(getClass().getResource("log1.fxml"));
//       Scene scene = new Scene(root);
//       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
//       s.setScene(scene);
//       s.show();
     
    
       
      //  System.out.println("c2");
  //  } 
  
    
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

//    log.setOnMouseClicked(new EventHandler() {
//          @Override
//          public void handle(Event event) {
//   if(internal.isSelected()){
//        Parent root = null;
//              try {
//       root = FXMLLoader.load(getClass().getResource("log1.fxml"));
//       Scene scene = new Scene(root);
//       Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
//       s.setScene(scene);
//       s.show();
//
//              } catch (IOException ex) {              }
//
//              
//              
//          }}
//      });
      
    }    
    
}
