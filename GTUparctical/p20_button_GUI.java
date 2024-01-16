import org.w3c.dom.Text;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class p20_button_GUI extends Application {
    protected Text text = new Text(50, 50, "hollo");

    @Override
    public void start(Stage primaryStage) {
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        HBox paneForRadioButtons = new HBox(20);
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Blue");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbGreen = new RadioButton("Green");
        paneForRadioButtons.getChildren().addAll(rbRed, rbYellow,
                rbBlack, rbOrange, rbGreen);

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbBlack.setToggleGroup(group);
        rbOrange.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        Pane paneForText = new Pane();
        paneForText.setStyle("-fx-border-color: black");
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);
        pane.setTop(paneForRadioButtons);
        btLeft.setOnAction(e -> text.setX(text.getId() - 10));
        btRight.setOnAction(e -> text.setX(text.getId() + 10));

        rbRed.setOnAction(e -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });
    }
}
