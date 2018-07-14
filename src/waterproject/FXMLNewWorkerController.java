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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dirane
 */
public class FXMLNewWorkerController implements Initializable {

    @FXML
    private void handleButtonLogoutAction(ActionEvent event) throws IOException {
     Parent LoginViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     Scene LoginViewScene = new Scene(LoginViewParent);
     
     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     
     window.setScene(LoginViewScene);
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
