package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Praktikum 6");
                TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new
                TableColumn<>("ID");
        kolom1.setCellValueFactory(
                new PropertyValueFactory<>("id"));
        TableColumn<Mahasiswa, String>kolom2 = new
                TableColumn<>("NIM");
        kolom2.setCellValueFactory(
                new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String>kolom3 = new
                TableColumn<>("Nama");
        kolom3.setCellValueFactory(
                new PropertyValueFactory<>("nim"));
        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getColumns().add(kolom3);
        tabel.getItems().add(
                new Mahasiswa(1, "Ikhsan","2210817310000"));
        tabel.getItems().add(
                new Mahasiswa(2, "Gymnastiar","2210817310001"));
        tabel.getItems().add(
                new Mahasiswa(3, "San",  "2210817310002"));
        tabel.getItems().add(
                new Mahasiswa(4, "Jim",  "2210817310003"));
        tabel.getItems().add(
                new Mahasiswa(5, "Gojo", "2210817310004"));
        tabel.getItems().add(
                new Mahasiswa(6, "Sato", "2210817310005"));
        tabel.getItems().add(
                new Mahasiswa(7, "Si", "2210817310006"));
        tabel.getItems().add(
                new Mahasiswa(8, "Peko","2210817310007"));
        tabel.getItems().add(
                new Mahasiswa(9, "Sapier","2210813210008"));
        tabel.getItems().add(
                new Mahasiswa(10, "Reg", "2210817310009"));
        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
