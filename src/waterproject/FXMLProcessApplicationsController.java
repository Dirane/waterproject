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
public class FXMLProcessApplicationsController implements Initializable {
    @FXML
    private Button report;
    
      @FXML
    public void handleButtonLogoutAction(ActionEvent event) throws IOException {
     Parent LoginViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     Scene LoginViewScene = new Scene(LoginViewParent);
     
     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     
     window.setScene(LoginViewScene);
     window.show();
    }
        
      @FXML
    private void handleButtonReport(ActionEvent event) throws IOException {
         Parent reportParent;
         reportParent = FXMLLoader.load(getClass().getResource("FXMLReport.fxml"));
         Scene reportScene = new Scene(reportParent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     
     window.setScene(reportScene);
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
