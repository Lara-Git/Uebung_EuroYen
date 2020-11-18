package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML private Button btn_Convert;
    @FXML private TextField txt_Euro;
    @FXML private TextField txt_Yen;
    @FXML private Text txt_error;

    @FXML
    public void convert()
    {
        CurrencyConverter cu = new CurrencyConverter();
        try {
            txt_error.setVisible(false);
            txt_Yen.setText(String.valueOf(cu.toYen(Double.parseDouble(txt_Euro.getText()))));
        }
        catch (Exception ex)
        {
            try
            {
                txt_Euro.setText(String.valueOf(cu.toEuro(Double.parseDouble(txt_Yen.getText()))));
            }

            catch (Exception e){
                txt_error.setVisible(true);
                //ERROR Msg becomes visible
                txt_error.setText("Es ist ein Fehler beim Convertieren aufgetreten.");
            }
        }
    }
}