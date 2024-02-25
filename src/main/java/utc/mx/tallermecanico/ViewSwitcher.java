package utc.mx.tallermecanico;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ViewSwitcher {
    private static final Map<View, Parent> cache = new HashMap<>();
    private static Scene scene;

    public static void switchTo(View view) {
        if (scene == null) {
            System.out.println("No hay escenas");
            return;
        }
        try {
            Parent root;
            if (cache.containsKey(view)) {
                root = cache.get(view);
            } else {
                root = FXMLLoader.load(Objects.requireNonNull(ViewSwitcher.class.getResource(view.getFileName())));

                cache.put(view, root);
            }
            scene.setRoot(root);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void setScene(Scene scene) {
        ViewSwitcher.scene = scene;
    }
}
