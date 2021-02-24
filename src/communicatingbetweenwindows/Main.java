package communicatingbetweenwindows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("the new boston");

        button = new Button("Click me");
        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Pop up window title", "Are you sure you want to send naked pictures to your ex girlfrend ?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 500, 400);
        window.setScene(scene);
        window.show();
    }
}
