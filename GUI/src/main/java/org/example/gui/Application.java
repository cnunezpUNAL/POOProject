package org.example.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("App");
        stage.setScene(scene);
        stage.setMinHeight(720);
        stage.setMinWidth(1080);
        stage.setWidth(1080);
        stage.setHeight(720);

        stage.show();
    }
}
