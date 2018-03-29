import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import java.util.Random;

public class SlotLabel extends Label {
    private Timeline timer;
    private boolean isSlotStarted;



    public SlotLabel(){
        this.setPrefSize(50,50);
        Border border = new Border(new BorderStroke(Color.BLACK , BorderStrokeStyle.SOLID,CornerRadii.EMPTY,null));

    }



    SlotLabel(String text){
        super(text);

        isSlotStarted = false;
    }

        public void setSlotStarted(){
            Random rand = new Random();
            timer = new Timeline(new KeyFrame(Duration.millis(100),e->{
                int randomNunmber = rand.nextInt(9)+1;
                this.setText(String.valueOf(randomNunmber));
    })) ;
        }

        public void setStopSlot() {
        timer.stop();



        }

        }