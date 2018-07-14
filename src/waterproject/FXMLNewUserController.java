/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterproject;

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
public class FXMLNewUserController implements Initializable {
    @FXML
    private Button newUser;
    private Button newCustomer;
    private Button newWorker;
    private Button newInstitution;
    //FXMLHomeController pc = new FXMLHomeController();
   // pc.handleButtonLogoutAction(event)
    
    
    @FXML
    private void handleButtonLogoutAction(ActionEvent event) throws IOException {
     Parent LoginViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     Scene LoginViewScene = new Scene(LoginViewParent);
     
     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     
     window.setScene(LoginViewScene);
     window.show();
    }
    
    @FXML
    private void handleButtonNewCustomer(ActionEvent event) throws IOException {
        Parent newCustomerParent = FXMLLoader.load(getClass().getResource("FXMLNewCustomer.fxml"));
        Scene newCustomerScene = new Scene(newCustomerParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(newCustomerScene);
        window.show();
    }
    
    @FXML
    private void handleButtonNewWorker(ActionEvent event) throws IOException {
        Parent newWorkerParent = FXMLLoader.load(getClass().getResource("FXMLNewWorker.fxml"));
        Scene newWorkerScene = new Scene(newWorkerParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(newWorkerScene);
        window.show();
    }
    
    @FXML
    private void handleButtonNewInstitution(ActionEvent event) throws IOException {
        Parent newInstitutionParent = FXMLLoader.load(getClass().getResource("FXMLNewInstitution.fxml"));
        Scene newInstitutionScene = new Scene(newInstitutionParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(newInstitutionScene);
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
