package com.example.demo1;

import com.example.demo1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button logout;


    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("hello-view.fxml");

    }
}