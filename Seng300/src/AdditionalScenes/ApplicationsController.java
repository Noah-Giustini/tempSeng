/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdditionalScenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import seng300.Seng300;

/**
 * FXML Controller class
 *
 * @author Kaitlin
 */
public class ApplicationsController implements Initializable {

    @FXML
    private Button backFromApplicationWindow;
    @FXML
    private TextArea ApplicationText1;
    @FXML
    private TextArea ApplicationText2;
    @FXML
    private TextArea ApplicationText3;
    @FXML
    private TextArea ApplicationText4;
    @FXML
    private TextArea ApplicationText5;
    @FXML
    private Button view4;
    @FXML
    private Button view3;
    @FXML
    private Button view2;
    @FXML
    private Button view5;
    @FXML
    private Button view1;
    @FXML
    private Button EditAppliicationList;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private RadioButton radioButton3;
    @FXML
    private RadioButton radioButton4;
    @FXML
    private RadioButton radioButton5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backToMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/seng300/adminMainPage.fxml"));
        Scene sc = new Scene(root);
        Stage s = Seng300.mainStage;
        s.setTitle("Home");
        s.setScene(sc);
        s.show();
    }

    @FXML
    private void openViewApplication(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/AdditionalScenes/ApplicationView.fxml"));
        Scene sc = new Scene(root);
        Stage s = Seng300.mainStage;
        s.setTitle("Home");
        s.setScene(sc);
        s.show();
    }

    @FXML
    private void openEditApplication(ActionEvent event) throws IOException {
        if (radioButton1.isSelected()) {
            //Take the text from view1 and show it in the edit pane 

        }
        Parent root = FXMLLoader.load(getClass().getResource("/AdditionalScenes/ApplicationView.fxml"));
        Scene sc = new Scene(root);
        Stage s = Seng300.mainStage;
        s.setTitle("Home");
        s.setScene(sc);
        s.show();
    }

}
