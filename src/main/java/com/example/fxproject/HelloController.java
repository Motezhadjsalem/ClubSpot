package com.example.fxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {




    }

    @FXML
    private void navigateToAddEvent() {navigate("/AddEvent.fxml");
    }


    public void navigateToUpdateEvent() {navigate("/UpdateEvent.fxml");
    }

    public void navigateToDeleteEvent() {navigate("/DeleteEvent.fxml");
    }

    public void navigateToAddParticipation() {navigate("/AddParticipation.fxml");
    }

    public void navigateToUpdateParticipation () {navigate("/UpdateParticipation.fxml");
    }

    public void navigateToDeleteParticipation (){navigate("/DeleteParticipation.fxml");
    }

    public void navigateToConsulterListeevent (){navigate("/ConsulterListeevent.fxml");
    }

    public void navigateToConsulterListepart(){navigate("/ConsulterListepart.fxml");
    }
    private void navigate(String fxmlPath) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();


            Stage stage = new Stage();


            stage.setScene(new Scene(root));


            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}