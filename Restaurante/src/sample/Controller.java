package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    TextField txtUsuario;
    @FXML
    PasswordField txtPassword;

    public void login(ActionEvent event){
        String u = txtUsuario.getText();
        String p = txtPassword.getText();
        if(u.equals("Yo") && p.equals("123")){

        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Restaurant");
            alert.setContentText("Datos Invalidos");
            alert.show();
        }
    }
}
