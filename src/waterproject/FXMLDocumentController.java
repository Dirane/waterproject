/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterproject;

import Connectivity.ConnectionClass;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author dirane
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField username;
    @FXML
    private Label label;
    @FXML
    private TextField password;
    @FXML
    private Button buttonLogin;
    @FXML
    private Button forgotPassword;
    
    
    @FXML
    private void handleButtonLoginAction(ActionEvent event) throws IOException, SQLException {
     Parent HomeViewParent = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
     Scene HomeViewScene = new Scene(HomeViewParent);
     
     //This line gets the stage info
     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     
     window.setScene(HomeViewScene);
     window.show();
     
//     ConnectionClass connectionClass = new ConnectionClass();
//     Connection connection = connectionClass.getConnection();
//     
//     Statement stmt = connection.createStatement();
//     //String sql = "insert into users(username) values("+username.getText()+");";
//     String sql = "insert into users (username, password) "
//               + "values ( '"+username.getText() +"', '"+ password.getText()+"')";
//     
//     stmt.execute(sql);
//     System.out.println("user name is :"+username.getText());
 }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
