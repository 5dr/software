/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 *
 * @author asd
 */
public class c1 {
 
    
   public void exit (ActionEvent e) throws Exception{
       
       Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();
       } 
   
     @FXML
    private JFXToggleButton toggel;
   
   public void log1 (ActionEvent e) throws Exception{
       
    
     if(toggel.isSelected()==true){
     
       Parent root = FXMLLoader.load(getClass().getResource("doctor.fxml"));
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();
       }
     else{
     
       Parent root = FXMLLoader.load(getClass().getResource("admain.fxml"));
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();
     }

   }
      public void log2 (ActionEvent e) throws Exception{
          
     if(toggel.isSelected()==true){
     
       Parent root = FXMLLoader.load(getClass().getResource("Ministry_of_Health.fxml"));
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();
       }
     else{
     
       Parent root = FXMLLoader.load(getClass().getResource("Ministry_of_education.fxml"));
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();
     }

   }
         public void log3 (ActionEvent e) throws Exception{
       
    
     if(toggel.isSelected()==true){
     
       Parent root = FXMLLoader.load(getClass().getResource("doctor.fxml"));
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();
       }
     else{
     
       Parent root = FXMLLoader.load(getClass().getResource("admain.fxml"));
       Scene scene = new Scene(root);
       Stage s = (Stage) ((Node) e.getSource()).getScene().getWindow();
       s.setScene(scene);
       s.show();
     }

   }
   
    
}
