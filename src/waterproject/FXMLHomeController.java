package waterproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dirane
 */
public class FXMLHomeController implements Initializable {
    
     @FXML
     private Button newUser;
     private Button manageCustomer;
     private Button processApp;
     private Button payment;
     private Button aproveCon;
     
   
     
     @FXML
    public void handleButtonLogoutAction(ActionEvent event) throws IOException {
     Parent LoginViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     Scene LoginViewScene = new Scene(LoginViewParent);
     
     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     
     window.setScene(LoginViewScene);
     window.show();
    }
    @FXML
    private void handleButtonNewUser(ActionEvent event) throws IOException {
         Parent newUserParent;
         newUserParent = FXMLLoader.load(getClass().getResource("FXMLNewUser.fxml"));
         Scene newUserScene = new Scene(newUserParent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     
     window.setScene(newUserScene);
     window.show();
    }
    @FXML
    private void handleButtonManageCustomer(ActionEvent event) throws IOException {
        Parent manageCustomerParent = FXMLLoader.load(getClass().getResource("FXMLManageCustomer.fxml"));
        Scene manageCustomerScene = new Scene(manageCustomerParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(manageCustomerScene);
        window.show();
        
    }
    @FXML
    private void handleButtonProcessApp(ActionEvent event) throws IOException {
        Parent processAppParent = FXMLLoader.load(getClass().getResource("FXMLProcessApplications.fxml"));
        Scene processAppScene = new Scene(processAppParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(processAppScene);
        window.show();
    }
    @FXML
    private void handleButtonPayment(ActionEvent event) throws IOException {
        Parent paymentParent = FXMLLoader.load(getClass().getResource("FXMLPayment.fxml"));
        Scene paymentScene = new Scene(paymentParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(paymentScene);
        window.show();
        
    }
    
    @FXML
    private void handleButtonAproveCon(ActionEvent event) throws IOException {
        Parent aproveConParent = FXMLLoader.load(getClass().getResource("FXMLAproveConnection.fxml"));
        Scene aproveConScene = new Scene(aproveConParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(aproveConScene);
        window.show();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
