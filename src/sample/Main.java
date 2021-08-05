package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private GridPane createGridPane() {
        String[] urls = {
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/1920px-Flag_of_Vietnam.svg.png",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Flag_of_Great_Britain_%281707%E2%80%931800%29.svg/1200px-Flag_of_Great_Britain_%281707%E2%80%931800%29.svg.png",
                "https://images-na.ssl-images-amazon.com/images/I/51YCk1KrXWL._SL1414_.jpg",
                "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1280px-Flag_of_the_United_States.svg.png"
        };

        GridPane gridPane = new GridPane();
        ImageView iv;
        for (int i = 0; i < urls.length; i++) {
            iv = new ImageView(urls[i]);
            iv.setFitWidth(300);
            iv.setPreserveRatio(true);
            iv.setSmooth(true);
            gridPane.add(iv, i % 2 + 1, i / 2 + 1);
        }

        return gridPane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene = new Scene(createGridPane());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Four Flags");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
