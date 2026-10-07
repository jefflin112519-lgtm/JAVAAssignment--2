package sdgposter;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SDGPoster extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("SDG GOAL 6");
        title.setStyle("-fx-font-size: 32px; -fx-font-weight: bold;");

        Label subtitle = new Label("CLEAN WATER AND SANITATION");
        subtitle.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");

        Label message = new Label("Ensure availability and sustainable management\n"+ "of water and sanitation for all.");
        message.setStyle("-fx-font-size: 18px;");

        Label points = new Label(
                "• Save Water\n"
                + "• Keep Water Sources Clean\n"
                + "• Avoid Water Pollution\n"
                + "• Use Water Wisely"
        );
        points.setStyle("-fx-font-size: 16px;");
        
        Button button = new Button("SAVE WATER • SAVE LIFE");
        button.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: lightblue; -fx-padding: 30px;");

        root.getChildren().addAll(
                title,
                subtitle,
                message,
                points,
                button
        );
        Scene scene = new Scene(root, 700, 500);

        stage.setTitle("SDG Goal 6 - Clean Water and Sanitation");
        stage.setScene(scene);
        stage.show();

        
    }

    public static void main(String[] args) {
        launch(args);
    }
}