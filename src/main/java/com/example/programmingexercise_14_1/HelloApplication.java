package com.example.programmingexercise_14_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;


/**
 * 14.1 (DISPLAY IMAGES)
 * Write a program that displays four images in a grid pane, as shown in Figure 14.43a.
 */

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creating the GridPane
        GridPane pane = new GridPane();

        // Set horizontal and vertical gaps between images
        pane.setHgap(10);
        pane.setVgap(10);

        // Set padding around the GridPane
        pane.setPadding(new Insets(10, 10, 10, 10)); // 10 pixels of padding on all sides

        // Loading Images
        Image usaFlag = new Image("file:src/main/resources/images/flag1.gif");
        Image englandFlag = new Image("file:src/main/resources/images/flag2.gif");
        Image franceFlag = new Image("file:src/main/resources/images/flag6.gif");
        Image chinaFlag = new Image("file:src/main/resources/images/flag7.gif");

        // Showing Images with ImageView
        ImageView usaImageView = new ImageView(usaFlag);
        usaImageView.setFitWidth(150);
        usaImageView.setFitHeight(100);

        ImageView englandImageView = new ImageView(englandFlag);
        englandImageView.setFitWidth(150);
        englandImageView.setFitHeight(100);

        ImageView franceImageView = new ImageView(franceFlag);
        franceImageView.setFitWidth(150);
        franceImageView.setFitHeight(100);

        ImageView chinaImageView = new ImageView(chinaFlag);
        chinaImageView.setFitWidth(150);
        chinaImageView.setFitHeight(100);

        // Adding images to the GridPane
        pane.add(usaImageView, 0, 0);
        pane.add(englandImageView, 1, 0);
        pane.add(franceImageView, 0, 1);
        pane.add(chinaImageView, 1, 1);

        // Setting up and showing the window
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_01");

        // Set window size
        primaryStage.setWidth(350);
        primaryStage.setHeight(280);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
