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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dirane
 */
public class FXMLNewWorkerController implements Initializable {
      @FXML
    private TextField FName;
    @FXML 
    private TextField MName;
    @FXML 
    private TextField LName;
    @FXML 
    private TextField PhoneNum;
    @FXML 
    private TextField EmailAddress;
    @FXML 
    private TextField BatchNum;
    @FXML 
    private TextField Position;
    @FXML 
    private MenuButton Gender;
    @FXML
    private MenuButton Role;
     @FXML
    private MenuButton Dept;
    @FXML 
    private DatePicker DOB;
    @FXML
    private TextField Password;
    
    @FXML
    private void handleButtonLogoutAction(ActionEvent event) throws IOException {
     Parent LoginViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     Scene LoginViewScene = new Scene(LoginViewParent);
     
     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     
     window.setScene(LoginViewScene);
     window.show();
    }
    public void handleSubmit(ActionEvent event) throws SQLException {    
    ConnectionClass connectionClass = new ConnectionClass();
     Connection connection = connectionClass.getConnection();
     

     Statement stmt = connection.createStatement();
     String sql1 = "insert into addresses (address_id, phone_num, email)"
                  +"values ('"+5+"', '"+PhoneNum.getText()+"','"+EmailAddress.getText()+"')";
    String sql = "insert into workers (worker_id,batch_num,position,user_id, gender_id,role_id,first_name, middle_name, last_name,password, dob,address_id)"
             + "values ( '"+2+"','"+BatchNum.getText() +"', '"+ Position.getText()+"','"+1+"','"+1+"','"+1+"','"+FName.getText()+"','"+MName.getText()+"','"+LName.getText()+"','"+Password.getText()+"','"+DOB.getValue()+"','"+5+"')";
        
        
     stmt.execute(sql1);
     
     stmt.execute(sql);
        System.out.println("New Worker added successfully");
}
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
