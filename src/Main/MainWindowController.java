package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

import static Main.AllCalcMethods.*;

public class MainWindowController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //As pressure selection is selected when opening the program
        evapTempText.setOpacity(0.5);
        evapTempUnit.setOpacity(0.5);
        evapTempField.setDisable(true);
        T1field.setOpacity(0.5);
        T1text.setOpacity(0.5);
        T1unit.setOpacity(0.5);
        T1field.setDisable(true);

        condensTempText.setOpacity(0.5);
        condensTempUnit.setOpacity(0.5);
        condensTempField.setDisable(true);
        T2field.setOpacity(0.5);
        T2text.setOpacity(0.5);
        T2unit.setOpacity(0.5);
        T2field.setDisable(true);
    }

    @FXML
    private TextField SuperheatField;
    @FXML
    private TextField condensTempField;
    @FXML
    private TextField condensPressureField;
    @FXML
    private TextField ComprPowerDrawn;
    @FXML
    private Text condensTempUnit;
    @FXML
    private Text evapPressureText;

    @FXML
    private Text evapTempText;
    @FXML
    private Text condensTempText;
    @FXML
    private TextField evapPressureField;
    @FXML
    private Text condensPressureText;
    @FXML
    private ToggleGroup pressTempToggle;
    @FXML
    private RadioButton temperatureToggle;
    @FXML
    private RadioButton pressureToggle;
    @FXML
    private Text evapPressureUnit;
    @FXML
    private Text evapTempUnit;
    @FXML
    private TextField SubcoolUnit;
    @FXML
    private Text condensPressureUnit;
    @FXML
    private TextField evapTempField;
    @FXML
    private Button calcButton;
    @FXML
    private TextField subcoolField;
    @FXML
    private TextField superheatField;
    @FXML
    private TextField comprPowerDrawnField;
    @FXML
    private TextField refFlowField;
    @FXML
    private TextField coolCapacityField;
    @FXML
    private TextField COPelField;
    @FXML
    private TextField COPfield;
    @FXML
    private TextField rejHeatField;
    @FXML
    private TextField comprHeatField;
    @FXML
    private TextArea commentsArea;
    @FXML
    private Canvas phChart;
    @FXML
    private ToggleButton holdButton;
    @FXML
    private TextField mField;
    @FXML
    private Text P1unit;
    @FXML
    private TextField T4field;
    @FXML
    private TextField T3field;
    @FXML
    private Text P2unit;
    @FXML
    private Text T1unit;
    @FXML
    private TextField T6field;
    @FXML
    private TextField T9field;
    @FXML
    private Text T2unit;
    @FXML
    private Text T1text;
    @FXML
    private TextField T7field;
    @FXML
    private Text T2text;
    @FXML
    private TextField T1field;
    @FXML
    private TextField P2field;
    @FXML
    private Text evapPressureText112;
    @FXML
    private Text P1text;
    @FXML
    private TextField P1field;
    @FXML
    private TextField T2field;
    @FXML
    private TextField T5field;
    @FXML
    private Text P2text;
    @FXML
    private TextField T8field;
    @FXML
    private Button resetButton;
    @FXML
    private TextField deltaT1field;
    @FXML
    private TextField deltaT2field;
    @FXML
    private TextField compRatioField;

    @FXML
    void pressureSelected(ActionEvent event) {

        evapTempText.setOpacity(0.5);
        evapTempUnit.setOpacity(0.5);
        evapTempField.setDisable(true);
        condensTempText.setOpacity(0.5);
        condensTempUnit.setOpacity(0.5);
        condensTempField.setDisable(true);
        T1field.setOpacity(0.5);
        T2field.setOpacity(0.5);
        T1field.setDisable(true);
        T2field.setDisable(true);
        T1unit.setOpacity(0.5);
        T1text.setOpacity(0.5);
        T2unit.setOpacity(0.5);;
        T2text.setOpacity(0.5);

        evapPressureText.setOpacity(1);
        evapPressureUnit.setOpacity(1);
        evapPressureField.setDisable(false);
        condensPressureText.setOpacity(1);
        condensPressureUnit.setOpacity(1);
        condensPressureField.setDisable(false);
        P1field.setOpacity(1);
        P2field.setOpacity(1);
        P1field.setDisable(false);
        P2field.setDisable(false);
        P1unit.setOpacity(1);
        P1text.setOpacity(1);
        P2unit.setOpacity(1);;
        P2text.setOpacity(1);
    }

    @FXML
    void tempSelected(ActionEvent event) {

        evapTempText.setOpacity(1);
        evapTempUnit.setOpacity(1);
        evapTempField.setDisable(false);
        condensTempText.setOpacity(1);
        condensTempUnit.setOpacity(1);
        condensTempField.setDisable(false);
        T1field.setDisable(false);
        T1field.setOpacity(1);
        T1unit.setOpacity(1);
        T1text.setOpacity(1);
        T2field.setDisable(false);
        T2field.setOpacity(1);
        T2unit.setOpacity(1);
        T2text.setOpacity(1);

        evapPressureText.setOpacity(0.5);
        evapPressureUnit.setOpacity(0.5);
        evapPressureField.setDisable(true);
        condensPressureText.setOpacity(0.5);
        condensPressureUnit.setOpacity(0.5);
        condensPressureField.setDisable(true);
        P1field.setDisable(true);
        P1field.setOpacity(0.5);
        P1text.setOpacity(0.5);
        P1unit.setOpacity(0.5);
        P2field.setDisable(true);
        P2field.setOpacity(0.5);
        P2text.setOpacity(0.5);
        P2unit.setOpacity(0.5);
    }

    @FXML
    void resetSketch(ActionEvent event) {

        P1field.setText("");
        T1field.setText("");
        P2field.setText("");
        T2field.setText("");
        T3field.setText("");
        T4field.setText("");
        T5field.setText("");
        T6field.setText("");
        T7field.setText("");
        T8field.setText("");
        T9field.setText("");
        mField.setText("");
    }

    @FXML
    void runCalculation(ActionEvent event) {

        ///////Input data//////
        double evapTemp = 0;
        double condensTemp = 0;
        double evapPress = 0;
        double condensPress = 0;
        int[] evapPressureInterval = new int[0];
        int[] condensPressureInterval = new int[0];
        double superheat = 0;
        double subcool;
        double massFlow = 0;
        double compressorPowerDrawn;

        ///////Calculated data///////
        //Data from the tables: 0.pressure 1,  1.temperature 1,  2.enthalpy 1
        //                      1.pressure 2,  1.temperature 2,  2.enthalpy 2
        //                      2.pressure 3,  1.temperature 3,  2.enthalpy 3
        //                      3.pressure 4,  1.temperature 4,  2.enthalpy 4
        double state[][] = new double[4][3];
        double coolingCapacity;
        double rejectedHeat;
        double compressorHeat;
        double COP;
        double COPel;
        boolean override = false;
        String overrideText = "Some values are overridden\nby the values on the sketch\non the right side.";
        boolean deleteResults = false;
        boolean draw = true;
        double T3 = 0;
        double T4 = 0;
        double T5 = 0;
        double T6 = 0;
        double T7 = 0;
        double T8 = 0;
        double T9 = 0;
        double deltaT1;
        double deltaT2;
        double compRatio;

        try {
            ////Read input data - dependent on if the input is pressure or temperature. Calculation is done using pressure afterwards////
            if (temperatureToggle.isSelected()) {

                if(T1field.getText().isEmpty() && T2field.getText().isEmpty()) {

                    evapTemp = Double.parseDouble(evapTempField.getText());
                    condensTemp = Double.parseDouble(condensTempField.getText());

                    override = false;
                }
                else{
                    evapTemp = Double.parseDouble(T1field.getText());
                    condensTemp = Double.parseDouble(T2field.getText());

                    evapPress = getPressFromTemp(evapTemp);
                    condensPress = getPressFromTemp(condensTemp);

                    P1field.setText(String.format(Locale.ROOT, "%.2f", evapPress));
                    P2field.setText(String.format(Locale.ROOT, "%.2f", condensPress));

                    evapTempField.setText(String.format(Locale.ROOT, "%.2f", evapTemp));
                    condensTempField.setText(String.format(Locale.ROOT, "%.2f", condensTemp));

                    override = true;
                }

                if (condensTemp <= evapTemp) {

                    commentsArea.setText("Evaporation temperature\nshould be lower than\ncondensation temperature!");
                    commentsArea.setStyle("-fx-background-color: red");

                    draw = false;
                }
                else if (evapTemp < -50 || evapTemp > 92.3 || condensTemp < -50 || condensTemp > 92.3) {

                    commentsArea.setText("Please enter temperature\nvalue between -50 and 92.3.");
                    commentsArea.setStyle("-fx-background-color: red");

                    draw = false;
                    deleteResults = true;
                }
                else {
                    evapPress = getPressFromTemp(evapTemp);
                    condensPress = getPressFromTemp(condensTemp);

                    evapPressureField.setText(String.format(Locale.ROOT, "%.2f", evapPress));
                    condensPressureField.setText(String.format(Locale.ROOT, "%.2f", condensPress));

                    commentsArea.setText("");
                    commentsArea.setStyle("-fx-background-color: silver");
                }
                if(T9field.getText().isEmpty() || T1field.getText().isEmpty()){

                    superheat = Double.parseDouble(superheatField.getText());
                }
                else{

                    T9 = Double.parseDouble(T9field.getText());

                    superheat = T9 - evapTemp;
                    superheatField.setText(String.format(Locale.ROOT, "%.2f", superheat));
                }
                if (superheat > 30 || superheat < 0) {

                    commentsArea.setText("Please enter superheat value\nbetween 0 to 30.");
                    commentsArea.setStyle("-fx-background-color: red");

                    draw = false;
                    deleteResults = true;
                }
            }
            /////////////////////////////////////////////////////////////////////////////
            else {    /////////if pressure toggle is selected//////////////////////////

                if(P1field.getText().isEmpty() && P2field.getText().isEmpty()){

                    evapPress = Double.parseDouble(evapPressureField.getText());
                    condensPress = Double.parseDouble(condensPressureField.getText());
                }
                else {

                    evapPress = Double.parseDouble(P1field.getText());
                    condensPress = Double.parseDouble(P2field.getText());

                    evapPressureField.setText(String.format(Locale.ROOT, "%.2f", evapPress));
                    condensPressureField.setText(String.format(Locale.ROOT, "%.2f", condensPress));

                    evapTemp = getTempFromPress(evapPress);
                    condensTemp = getTempFromPress(condensPress);

                    T1field.setText(String.format(Locale.ROOT, "%.2f", evapTemp));
                    T2field.setText(String.format(Locale.ROOT, "%.2f", condensTemp));

                    override = true;
                }
                if (evapPress < 0.37 || evapPress > 32.2 || condensPress < 0.37 || condensPress > 32.2) {

                        commentsArea.setText("Please enter a value\nbetween 0.37 and 32.2.");
                        commentsArea.setStyle("-fx-background-color: red");

                        draw = false;
                        deleteResults = true;
                    }
                    else if (superheat > 30 || superheat < 0) {

                        commentsArea.setText("Please enter a value\nbetween 0 to 30.");
                        commentsArea.setStyle("-fx-background-color: red");

                        draw = false;
                        deleteResults = true;
                }
                    else if(evapPress > condensPress){

                        commentsArea.setText("Evaporation pressure should\nbe lower than condensation\npressure!");
                        commentsArea.setStyle("-fx-background-color: red");

                        draw = false;
                        deleteResults = true;
                }
                    else {
                        commentsArea.setText("");
                        commentsArea.setStyle("-fx-background-color: silver");
                    }

                evapTemp = getTempFromPress(evapPress);
                condensTemp = getTempFromPress(condensPress);


                evapTempField.setText(String.format(Locale.ROOT, "%.2f", evapTemp));
                condensTempField.setText(String.format(Locale.ROOT, "%.2f", condensTemp));

                }
            /////////////////////////////////////////////////////////////////////////////////////////////
            if(T9field.getText().isEmpty()){

                superheat = Double.parseDouble(superheatField.getText());
            }
            else{

                T9 = Double.parseDouble(T9field.getText());

                superheat = T9 - evapTemp;
                superheatField.setText(String.format(Locale.ROOT, "%.2f", superheat));

                override = true;
            }
            if(T6field.getText().isEmpty()){

                subcool = Double.parseDouble(subcoolField.getText());
            }
            else{

                T6 = Double.parseDouble(T6field.getText());

                subcool = condensTemp - T6;
                subcoolField.setText(String.format(Locale.ROOT, "%.2f", subcool));

                override = true;
            }
            if(mField.getText().isEmpty()){

                massFlow = Math.abs(Double.parseDouble((refFlowField.getText())));
            }
            else{

                massFlow = Math.abs(Double.parseDouble(mField.getText()));
                refFlowField.setText(String.format(Locale.ROOT, "%.2f", massFlow));

                override = true;
            }
            if(override == true){

                commentsArea.setText(overrideText);
            }
            //Calculate and print delta T and compression ratio//
            if(!T4field.getText().isEmpty()){

                T4 = Double.parseDouble(T4field.getText());
                deltaT1 = condensTemp - T4;
                deltaT1field.setText(String.format(Locale.ROOT, "%.2f", deltaT1));
            }

            if(!T7field.getText().isEmpty()){

                T7 = Double.parseDouble(T7field.getText());
                deltaT2 = T7 - evapTemp;
                deltaT2field.setText(String.format(Locale.ROOT, "%.2f", deltaT2));
            }
            compRatio = (condensPress + 1)/(evapPress + 1);
            compRatioField.setText(String.format(Locale.ROOT, "%.2f", compRatio));
            //////////////////////////////////////////////////////////////////////////////////

                //Get the nearest pressure interval to interpolate from
                evapPressureInterval = getPressureInterval(evapPress);
                condensPressureInterval = getPressureInterval(condensPress);
                //enthalpy = getEnthalpyVapor(evapPress, pressureInterval,superheat);

                state[0] = new double[]{evapPress, getTempFromPress(evapPress) + superheat, getEnthalpyVapor(evapPress, evapPressureInterval, superheat)};
                state[1] = new double[]{condensPress, getTempFromPress(condensPress) + superheat, getEnthalpyVapor(condensPress, condensPressureInterval, superheat)};
                state[2] = new double[]{condensPress, getTempFromPress(condensPress) - subcool, getEnthalpySaturatedVapor(condensPress, subcool, true)};
                state[3] = new double[]{evapPress, getTempFromPress(evapPress), getEnthalpySaturatedVapor(condensPress, subcool, true)};

                System.out.println("State data points: Pressure, Temperature, Enthalpy");
                for (int i = 0; i < 4; i++) {
                    System.out.println(Arrays.toString(state[i]));
                }
                ////////////////// Calculate final results///////////////////////////////////
                compressorPowerDrawn = Double.parseDouble(comprPowerDrawnField.getText());

                coolingCapacity = massFlow * (state[0][2] - state[3][2]);
                rejectedHeat = massFlow * (state[1][2] - state[2][2]);
                compressorHeat = massFlow * (state[1][2] - state[0][2]);
                COP = coolingCapacity / compressorHeat;
                COPel = coolingCapacity / compressorPowerDrawn;

                System.out.println("Cooling capacity = " + coolingCapacity);
                System.out.println("Rejected heat = " + rejectedHeat);
                System.out.println("Compressor added heat = " + compressorHeat);
                System.out.println("COP = " + COP);
                System.out.println("COPel = " + COPel);

                //Print the results
                comprHeatField.setText(String.format(Locale.ROOT, "%.2f", compressorHeat));
                coolCapacityField.setText(String.format(Locale.ROOT, "%.2f", coolingCapacity));
                rejHeatField.setText(String.format(Locale.ROOT, "%.2f", rejectedHeat));
                COPfield.setText(String.format(Locale.ROOT, "%.2f", COP));
                COPelField.setText(String.format(Locale.ROOT, "%.2f", COPel));

                //////////////////////////Draw the ph chart////////////////////////////////////
                var gc = phChart.getGraphicsContext2D();

                if (!holdButton.isSelected()){

                    gc.clearRect(0, 0, phChart.getWidth(), phChart.getHeight());    // Clear previous chart
                }
                DrawChart phChart = new DrawChart(state);   //pass the state data to the DrawChart class

                if(draw == true){

                    phChart.drawLines(gc);
                }
                /////////////////////////////////////////////////////////////////////////////////////
            if(deleteResults == true){  //Delete results if invalid

                    coolCapacityField.setText("");
                    rejHeatField.setText("");
                    comprHeatField.setText("");
                    COPfield.setText("");
                    COPelField.setText("");
                }
        }
        catch (Exception e) {
            e.printStackTrace();
            commentsArea.setText(e.toString());
            commentsArea.setStyle("-fx-background-color: red");
            gc.clearRect(0, 0, phChart.getWidth(), phChart.getHeight());    // Clear previous chart

        }
    }
}