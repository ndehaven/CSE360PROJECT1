import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class ChefDisplay {  

    @FXML
    void cookingStatus(ActionEvent event) {
        PizzaOrder.setStatus("Ready to Cook");
    }

    @FXML
    void finishStatus(ActionEvent event) {

    }

    @FXML
    void readyStatus(ActionEvent event) {

    }

}
