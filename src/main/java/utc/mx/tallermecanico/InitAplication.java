package utc.mx.tallermecanico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.scene.layout.Panel;

import java.io.IOException;

import static utc.mx.tallermecanico.ViewSwitcher.setScene;
import static utc.mx.tallermecanico.ViewSwitcher.switchTo;

public class InitAplication extends Application {
    @Override
    public void start(Stage stage) {
        var scene = new Scene(new Panel());
        setScene(scene);
        switchTo(View.Selection);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}