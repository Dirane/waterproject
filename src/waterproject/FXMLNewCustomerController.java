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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dirane
 */
public class FXMLNewCustomerController implements Initializable {
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
    private TextField NID;
    @FXML 
    private TextField PassportNum;
    @FXML 
    private MenuButton Gender;
    @FXML 
    private TextField Quarter;
    @FXML 
    private TextField HouseNum;
    @FXML 
    private MenuButton Zone;
    @FXML 
    private DatePicker DOB;
    
    @FXML
    private void handleButtonLogoutAction(ActionEvent event) throws IOException {
     Parent LoginViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     Scene LoginViewScene = new Scene(LoginViewParent);
     
     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     
     window.setScene(LoginViewScene);
     window.show();
    }
    public void handleSubmit(ActionEvent event) throws SQLException {

//    String query = "INSERT INTO testDatabase.Gebruikers (Voornaam) VALUES (?);";
//    PreparedStatement statement = database.prepareStatement(query);
//    try {
//        statement.setString(1, FXVoornaam.getText());
//        statement.executeUpdate();
//    } catch (Exception e) {
//         // log info somewhere at least until it's properly tested/
//         // you implement a better way of handling the error
//         e.printStackTrace(System.err);
//    }
    
    
    ConnectionClass connectionClass = new ConnectionClass();
     Connection connection = connectionClass.getConnection();
     

     Statement stmt = connection.createStatement();
     String sql1 = "insert into addresses (address_id, phone_num, email, quarter, zone, house_num)"
                  +"values ('"+2+"', '"+PhoneNum.getText()+"', '"+EmailAddress.getText()+"', '"+Quarter.getText()+"', '"+Zone.getText()+"', '"+HouseNum.getText()+"')";
    String sql = "insert into customers (cust_id,NID, passport_no,user_id, gender_id,first_name, middle_name, last_name, address_id,dob) "
             + "values ( '"+2+"','"+NID.getText() +"', '"+ PassportNum.getText()+"','"+1+"','"+1+"','"+FName.getText()+"','"+MName.getText()+"','"+LName.getText()+"','"+2+"','"+DOB.getValue()+"')";
        
        
     stmt.execute(sql1);
     
     stmt.execute(sql);
}
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
