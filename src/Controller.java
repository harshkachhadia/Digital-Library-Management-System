import javafx.fxml.*;
import javafx.event.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.*;

import java.io.IOException;

public class Controller {
    static Stage temporary=null;
    void gotodashboard(ActionEvent event) throws IOException{
        Parent dashboard= FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Stage s=(Stage) ((Node) event.getSource()).getScene().getWindow();
        s.setScene(new Scene(dashboard));
        s.show();
    }
    void gotoforgotpassword(ActionEvent event) {
         System.out.print("hello");
    }
    void cancel(ActionEvent event) {
        Stage temp=(Stage) ((Node) event.getSource()).getScene().getWindow();
        temp.close();
    }
    void gotonewuser(ActionEvent event) {
        System.out.print("hello");
    }

    @FXML
    void logout(ActionEvent event) throws IOException{
        Parent login= FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage s=(Stage) ((Node) event.getSource()).getScene().getWindow();
        s.setScene(new Scene(login));
        s.show();
    }

    @FXML
    void reviewbooks(ActionEvent event) throws IOException{
        Parent review= FXMLLoader.load(getClass().getResource("reviews.fxml"));
        Stage s=(Stage) ((Node) event.getSource()).getScene().getWindow();
        s.setScene(new Scene(review));
        s.show();
    }

    @FXML
    void searchbooks(ActionEvent event) throws IOException{

        Parent search= FXMLLoader.load(getClass().getResource("searchbooks.fxml"));
        temporary=(Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage s=new Stage();
        s.setScene(new Scene(search));
        s.show();
    }

    @FXML
    void showdigitalresources(ActionEvent event) throws IOException{
        Parent digital= FXMLLoader.load(getClass().getResource("digitalresources.fxml"));
        Stage s=(Stage) ((Node) event.getSource()).getScene().getWindow();
        s.setScene(new Scene(digital));
        s.show();
    }
    void search(ActionEvent event) throws IOException{
        Parent search= FXMLLoader.load(getClass().getResource("viewbooks.fxml"));
        Stage s=(Stage) ((Node) event.getSource()).getScene().getWindow();
        s.close();
        temporary.setScene(new Scene(search));
    }
    @FXML
    void suggestbooks(ActionEvent event) throws IOException,NullPointerException {
        Parent suggest= FXMLLoader.load(getClass().getResource("suggestbooks.fxml"));
        Stage s=new Stage();
        s.setScene(new Scene(suggest));
        s.show();
    }

    @FXML
    void viewbooks(ActionEvent event) {

    }


    void searchdigitalresorces(ActionEvent event) {

    }

}
