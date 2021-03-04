package gui_btn_txt_grphcs;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class GUI_Btn_Txt_Grphcs extends Application {
    int count=0;
    
    public static void main(String[] args) {
        launch (args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Text txt = new Text("My label");
            txt.setLayoutX(10);txt.setLayoutY(10);
        Button btn1= new Button("1");
        btn1.setLayoutX(100);btn1.setLayoutY(100);
        
        Button btn2= new Button("2");
        btn2.setLayoutX(300);btn2.setLayoutY(100);
        Line ln1 = new Line(20, 20, 100, 100);
        Rectangle rct = new Rectangle (200,200,80,30);
        
        btn2.setOnAction(e->{ txt.setText("My Count "+ count++);});
        
        
            
        
        Group gp1= new Group(txt, btn2, btn1,ln1,rct);
        
        
        
        Scene sn = new Scene(gp1, 500, 300);
        stage.setTitle("Peter Schellhorn");
        stage.setScene(sn);
        stage.show();
        
        
        
        
    }
    
}
