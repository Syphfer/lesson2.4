package org.example.lessonfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {

@FXML
TextField mainTextField;

@FXML
TextArea mainTextArea;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

   public void sendMessage(ActionEvent actionEvent) {
mainTextArea.appendText(mainTextField.getText() + "\n");
       mainTextField.clear();

   }


}