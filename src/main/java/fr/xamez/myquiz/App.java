package fr.xamez.myquiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final MenuBar menuBar = setupMenuBar();
        final VBox vBox = new VBox(menuBar);
        final Scene scene = new Scene(vBox, 1000, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Quizz");
        primaryStage.show();
        primaryStage.centerOnScreen();
    }

    private MenuBar setupMenuBar(){
        final MenuBar menuBar = new MenuBar();
        final Menu quizMenu = new Menu("Quizz");
        final MenuItem createQuiz = new MenuItem("Create Quiz");
        createQuiz.setOnAction(e -> System.out.println(createQuiz.getText()));
        final MenuItem editQuiz = new MenuItem("Edit Quiz");
        editQuiz.setOnAction(e -> System.out.println(editQuiz.getText()));
        final MenuItem listQuiz = new MenuItem("Quizzes list");
        listQuiz.setOnAction(e -> System.out.println(listQuiz.getText()));
        quizMenu.getItems().addAll(createQuiz, editQuiz, listQuiz);
        menuBar.getMenus().add(quizMenu);
        return menuBar;
    }

}
