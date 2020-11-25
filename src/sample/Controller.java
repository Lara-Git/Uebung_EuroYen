package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML private Button btn_Convert;
    @FXML private TextField txt_Euro;
    @FXML private TextField txt_Convert;
    @FXML CurrencyConverter Converter;
    @FXML private ChoiceBox<String> cb_Convert;
    @FXML private Text txt_error;

    @FXML
    void handle_convert(MouseEvent event) {
        if (!txt_Euro.getText().equals(""))
        {
            try
            {
                txt_Convert.setText(String.format("%.4f", Converter.converter(Double.parseDouble(txt_Euro.getText()),
                        cb_Convert.getValue())));

            }
            catch (Exception e){
                txt_error.setVisible(true);
                //ERROR Msg becomes visible
                txt_error.setText("Es ist ein Fehler beim Convertieren aufgetreten.");
            }
        }
    }

    @FXML
    public void initialize()
    {
        Converter = new CurrencyConverter();
        cb_Convert.getItems().add("Yen");
        cb_Convert.getItems().add("US Dollar");
    }

}