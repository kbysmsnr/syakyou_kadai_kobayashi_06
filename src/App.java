import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.scene.Node;
import javafx.stage.Modality;


public class App extends Application{
    public static void main (String[]args){
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        ArrayList<SlotLabel> label_array = new ArrayList<>();
        for(int i = 0; i<3 ; i++){
            label_array.add(new SlotLabel("1"));
        }

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(label_array);



        Button start_button = new Button("start");
        start_button.setPrefSize(30,30);
        start_button.setOnAction(event-> {
            for(int i = 0; i<label_array.size() ; i++){
                label_array.get(i).setSlotStarted();
            }
        });

        Button stop_button = new Button("stop");
        stop_button.setPrefSize(30,30);
        stop_button.setOnAction(event->{
            for(int i = 0; i<label_array.size() ; i++){
                label_array.get(i).setStopSlot();
            }
        });

        HBox hhBox = new HBox(20);
        hhBox.setAlignment(Pos.CENTER);
        hhBox.getChildren().add(start_button);
        hhBox.getChildren().add(stop_button);

        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10,10,10,10));
        borderPane.setCenter(hBox);

        Scene scene = new Scene(borderPane,320 ,240);
        stage.setScene(scene);
        stage.show();

    }

}
