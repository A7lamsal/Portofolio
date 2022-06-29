
import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Functioning extends Application {

    FlowPane flow = new FlowPane();

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(flow, 700, 500);
        Testing.Courses();
        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
        mainPage();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void mainPage() {
        flow.getChildren().clear();
        flow.setPadding(new Insets(20, 20, 20, 20));
        Button add = new Button("ADD");
        Button remove = new Button("REMOVE");
        Button clear = new Button("CLEAR");
        Button display = new Button("DISPLAY");

        for (String key : Testing.courses.keySet()) {
            flow.getChildren().add(new Label(key));

        }
        flow.setVgap(10);
        flow.setHgap(10);
        flow.setOrientation(Orientation.VERTICAL);

        FlowPane collects = new FlowPane();
        collects.getChildren().addAll(add, remove, clear, display);
        collects.setHgap(10);
        collects.setAlignment(Pos.CENTER);
        flow.getChildren().add(collects);

        add.setOnAction(e -> {
            addPage();
        });
        remove.setOnAction(e -> {
            removePage();
        });
        display.setOnAction(e -> {
            flow.getChildren().clear();
            display();
            flow.getChildren().add(collects);
        });
        clear.setOnAction(e -> {
            clearPage();
        });

        // display.setOnAction(e->{
        //
        // });
    }

    public void display() {
        Label displayLabel = new Label("");
        String allCourese = "";
        for (String key : Testing.courses.keySet()) {
            allCourese += key;
            for (int i = 0; i < Testing.courses.get(key).size(); i++) {
                allCourese += "\n" + Testing.courses.get(key).get(i);
            }
            if (Testing.courses.get(key).size() == 0)
                allCourese += "\nThere no Trainees";
            allCourese += "\n\n";
        }
        displayLabel.setText(allCourese);

        flow.getChildren().add(displayLabel);
    }

    /*
     * In the method below, there are
     * 2 button which are Add and back button.
     * The buttons are used to add the trainee
     * and back is used to go the main page.
     */
    public void addPage() {
        TextField courseName = new TextField();
        TextField name = new TextField();
        TextField branch = new TextField();
        TextField email = new TextField();
        TextField nationalId = new TextField();
        CheckBox isFeamle = new CheckBox();
        Label courseName1 = new Label("CourseName");
        Label name1 = new Label("Name");
        Label branch1 = new Label("Branch");
        Label email1 = new Label("Email");
        Label nationalId1 = new Label("National ID");
        Label result = new Label("Result");
        flow.getChildren().clear();
        flow.getChildren().addAll(name1, name, branch1, branch, email1, email, nationalId1, nationalId, courseName1,
                courseName, result);
        Button add = new Button("ADD");
        Button back = new Button("BACK");
        FlowPane buttons = new FlowPane(20, 20);
        buttons.getChildren().addAll(add, back);
        flow.getChildren().addAll(buttons);
        add.setOnAction(e -> {
            Trainee trainee = new Trainee();
            trainee.setName(name.getText());
            trainee.setNationalID(Integer.parseInt(nationalId.getText()));
            trainee.setBranch(branch.getText());
            trainee.setEmail(email.getText());
            result.setText(Course.addTrainee(trainee, courseName.getText(), Testing.courses));
        });
        back.setOnAction(e -> {
            mainPage();
        });

    }

    /*
     * In the method below, there are
     * 2 button which are Remove and back button.
     * The buttons are used to remove the trainee
     * and back is used to go the main page.
     */
    public void removePage() {
        TextField courseName = new TextField();
        TextField nationalId = new TextField();
        Label courseName1 = new Label("CourseName");
        Label nationalId1 = new Label("National ID");
        Label result = new Label("Result");
        flow.getChildren().clear();
        flow.getChildren().addAll(nationalId1, nationalId, courseName1, courseName, result);
        FlowPane buttons = new FlowPane(20, 20);
        Button remove = new Button("REMOVE");
        Button back = new Button("BACK");
        buttons.getChildren().addAll(remove, back);
        flow.getChildren().addAll(buttons);
        remove.setOnAction(e -> {
            Trainee trainee = new Trainee();
            trainee.setNationalID(Integer.parseInt(nationalId.getText()));
            result.setText(Course.removeTrainee(trainee, courseName.getText(), Testing.courses));
        });
        back.setOnAction(e -> {
            mainPage();
        });
    }

    /*
     * In the method below, there are
     * 2 button which are clear and back button.
     * The buttons are used to clear the page
     * and back is used to go the main page.
     */
    public void clearPage() {
        Button clear = new Button("ClearPage");
        Button cancel = new Button("Cancel");
        flow.setHgap(20);
        flow.getChildren().addAll(clear, cancel);
        flow.setPadding(new Insets(20, 20, 20, 20));
        // flow.setAlignment(Pos.CENTER);
        clear.setOnAction(e -> {
            flow.getChildren().clear();
        });
        cancel.setOnAction(e -> {
            mainPage();
        });
    }

}
