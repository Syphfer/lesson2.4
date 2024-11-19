//<TextField> </TextField> - однострочное текстовое поле;
//<TextArea> </TextArea> - многострочное текстовое поле;
//<VBox> - располагает элементы сверху вниз;
//<HBox> - располагает элементы слева направо;
//tf.clear(); - очистить textField;



package org.example.lessonfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChatApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ChatApplication.class.getResource("chat.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Клиентский чат");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}