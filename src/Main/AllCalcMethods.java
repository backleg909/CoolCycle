package Main;

import javafx.scene.canvas.GraphicsContext;

public class AllCalcMethods {

    public static GraphicsContext gc;  //to be able to reach gc to the catch exception in the MainWindowController class

    public static double getPressFromTemp(double temperature){

        double pressure;
        double givenTemp = temperature;

        DataTables Temperature = new DataTables();

        double currentDifference;
        double difference = Math.abs(Temperature.saturatedStateR1234YF[0][1] -
                Temperature.saturatedStateR1234YF[Temperature.saturatedStateR1234YF.length - 1][1]); //Difference between 1st and last Temp
        int tempRowIndex = 0;
        int[] nearestTempIntervalIndex;

        //get the nearest temperature in the table and its index
        for (int i = 0; i < Temperature.saturatedStateR1234YF.length; i++){

            currentDifference = Math.abs(givenTemp - Temperature.saturatedStateR1234YF[i][1]);

            if (currentDifference < difference) {

                difference = currentDifference;
                tempRowIndex = i;
            }
        }
        nearestTempIntervalIndex = new int[]{tempRowIndex, tempRowIndex+1};

        // Interpolate pressure from the given temperature
        double p0 = Temperature.saturatedStateR1234YF[nearestTempIntervalIndex[0]][0];
        double T0 = Temperature.saturatedStateR1234YF[nearestTempIntervalIndex[0]][1];
        double p1 = Temperature.saturatedStateR1234YF[nearestTempIntervalIndex[1]][0];
        double T1 = Temperature.saturatedStateR1234YF[nearestTempIntervalIndex[1]][1];

        pressure = p0 + ((p1 - p0)/(T1 - T0)) * (temperature - T0);

        return pressure;
    }

    public static double getTempFromPress(double pressure){

        double temperature;
        double givenPress = pressure;

        DataTables PressureObj = new DataTables();

        double currentDifference;
        double difference = Math.abs(PressureObj.saturatedStateR1234YF[0][0] -
                PressureObj.saturatedStateR1234YF[PressureObj.saturatedStateR1234YF.length - 1][0]); //Difference between 1st and last pressure
        int pressRowIndex = 0;
        int[] nearestPressIntervalIndex;

        //get the nearest pressure in the table and its index
        for (int i = 0; i < PressureObj.saturatedStateR1234YF.length ; i++){

            currentDifference = Math.abs(givenPress - PressureObj.saturatedStateR1234YF[i][0]);

            if (currentDifference < difference) {

                difference = currentDifference;
                pressRowIndex = i;
            }
        }
        nearestPressIntervalIndex = new int[]{pressRowIndex, pressRowIndex + 1};

        // Interpolate pressure from the given temperature
        double p0 = PressureObj.saturatedStateR1234YF[nearestPressIntervalIndex[0]][0];
        double T0 = PressureObj.saturatedStateR1234YF[nearestPressIntervalIndex[0]][1];
        double p1 = PressureObj.saturatedStateR1234YF[nearestPressIntervalIndex[1]][0];
        double T1 = PressureObj.saturatedStateR1234YF[nearestPressIntervalIndex[1]][1];

        temperature = T0 + ((T1 - T0)/(p1 - p0)) * (givenPress - p0);

        return temperature;
    }
    public static int[] getPressureInterval(double pressure){

        double givenPress = pressure;

        DataTables PressureObj = new DataTables();

        int pressRowIndex = 0;
        double currentPressDifference;
        double pressDifference = 50;
        int[] nearestPressIntervalIndex;

        for (int i = 1; i < PressureObj.superheatedVaporR1234YF_enthalpy.length; i++){

            currentPressDifference = givenPress - PressureObj.superheatedVaporR1234YF_enthalpy[i][0];

            if (currentPressDifference < pressDifference) {

                if (currentPressDifference < 0){
                    break;
                }
                else;

                pressDifference = currentPressDifference;
                pressRowIndex = i;
            }
        }
        nearestPressIntervalIndex = new int[]{pressRowIndex - 1, pressRowIndex, pressRowIndex + 1}; //Array with interpolation interval

        return nearestPressIntervalIndex;
    }
    public static double getEnthalpyVapor (double pressure, int[] pressureInterval, double superheat){

    double enthalpy = 0;

        ////2-D interpolation to get enthalpy based on pressure and superheat from the table////
        double H1;
        double H2;
        double H3;
        double X = superheat;
        double Y = pressure;
        double[][] pressArraySection = new double[3][8];    //Read just the needed section of the data array

        DataTables dataArray = new DataTables();

        pressArraySection[0] = dataArray.superheatedVaporR1234YF_enthalpy[0];
        pressArraySection[1] = dataArray.superheatedVaporR1234YF_enthalpy[pressureInterval[1]];

        if(pressureInterval[2] >= dataArray.superheatedVaporR1234YF_enthalpy.length){

            pressArraySection[2] = new double[8];
        }
        else{

            pressArraySection[2] = dataArray.superheatedVaporR1234YF_enthalpy[pressureInterval[2]];
        }

        H1 = pressArraySection[1][1] + (Y - pressArraySection[1][0]) * ((pressArraySection[2][1]-pressArraySection[1][1])/(pressArraySection[2][0]-pressArraySection[1][0]));

        H2 = pressArraySection[1][2] + (Y - pressArraySection[1][0]) * ((pressArraySection[2][2]-pressArraySection[1][2])/(pressArraySection[2][0]-pressArraySection[1][0]));

        H3 = H1 + (X - pressArraySection[0][1]) * ((H2-H1)/(pressArraySection[0][2]-pressArraySection[0][1]));

        enthalpy = H3;

        //////////////////////Simplified algorithm for reference//////////////////////////////////////////
        ////H1 = array[1][1] + (Y - array[1][0]) * ((array[2][1]-array[1][1])/(array[2][0]-array[1][0]));
        ////H2 = array[1][2] + (Y - array[1][0]) * ((array[2][2]-array[1][2])/(array[2][0]-array[1][0]));
        ////H3 = H1 + (X - array[0][1]) * ((H2-H1)/(array[0][2]-array[0][1]));
        //////////////////////////////////////////////////////////////////////////////////////////////////

        return enthalpy;
    }
    public static double getEnthalpySaturatedVapor(double pressure, double subcool, boolean liquid){

        double enthalpySaturatedVapor = 0;
        double saturatedTemp;
        int state;

        if(liquid == true){

            state = 3;
        }
        else{

            state = 5;
        }
        saturatedTemp = getTempFromPress(pressure) - subcool;

        DataTables TemperatureObj = new DataTables();

        double currentDifference;
        double difference = Math.abs(TemperatureObj.saturatedStateR1234YF[0][1] -
                TemperatureObj.saturatedStateR1234YF[TemperatureObj.saturatedStateR1234YF.length - 1][1]); //Difference between 1st and last Temp
        int tempRowIndex = 0;
        int[] nearestTempIntervalIndex;

        //get the nearest temperature in the table and its index
        for (int i = 0; i < TemperatureObj.saturatedStateR1234YF.length; i++){

            currentDifference = Math.abs(saturatedTemp - TemperatureObj.saturatedStateR1234YF[i][1]);

            if (currentDifference < difference) {

                difference = currentDifference;
                tempRowIndex = i;
            }
        }
        nearestTempIntervalIndex = new int[]{tempRowIndex, tempRowIndex + 1};

        // Interpolate enthalpy from the given temperature
        double h0 = TemperatureObj.saturatedStateR1234YF[nearestTempIntervalIndex[0]][state];
        double T0 = TemperatureObj.saturatedStateR1234YF[nearestTempIntervalIndex[0]][1];
        double h1 = TemperatureObj.saturatedStateR1234YF[nearestTempIntervalIndex[1]][state];
        double T1 = TemperatureObj.saturatedStateR1234YF[nearestTempIntervalIndex[1]][1];

        enthalpySaturatedVapor = h0 + ((h1 - h0)/(T1 - T0)) * (saturatedTemp - T0);

        return enthalpySaturatedVapor;
    }
    public static double getX(double enthalpy){

        double x;
        double xMax = 491;  // x interval = 0-491
        double xMin = 0;
        double hMin = 150;
        double hMax = 450;

        x = xMin + ((enthalpy - hMin)/(hMax - hMin))*(xMax - xMin);

        //System.out.println(x);

        return x;
    }
    public static double getY(double pressure){

        double y;
        double yMax = 352;
        double yMin = 0;
        double pMin = 0.6;
        double pMax = 80;

        y = yMin + ((yMax - yMin)/(Math.log10(pMax/pMin))*(Math.log10(pressure/pMin)));
        //System.out.println("y="+y);

        return y;
    }
}


