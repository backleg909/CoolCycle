package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainWindow extends Application {
    @Override
    public void start(Stage mainStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindowInterfaceController.fxml"));

        Scene mainScene = new Scene(fxmlLoader.load());

        mainStage.initStyle(StageStyle.DECORATED);
        mainStage.setScene(mainScene);
        mainStage.setTitle("CoolCycle 1.0");
        mainStage.setResizable(false);
        mainStage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/icon1.jpg")));
        mainStage.show();
    }

    public void run() {
        launch();
    }
}
