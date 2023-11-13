package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static Main.AllCalcMethods.getX;
import static Main.AllCalcMethods.getY;

public class DrawChart {

    double P1;
    double P2;
    double P3;
    double P4;

    double h1;
    double h2;
    double h3;
    double h4;

    public DrawChart(double[][] state){ //read passed P and h states

        P1 = state[0][0];
        P2 = state[1][0];
        P3 = state[2][0];
        P4 = state[3][0];

        h1 = state[0][2];
        h2 = state[1][2];
        h3 = state[2][2];
        h4 = state[3][2];
    }
    double xMax = 572;  // x interval = 0-491
    double xMin = 81;
    double yMax = 19;   // y interval = 0-352
    double yMin = 371;

    int pointSize = 8;
    int lineWidth = 3;

    //double x1 = 491; double x2 = 491; double x3 = 0;   double x4 = 0;
    //double y1 = 0;   double y2 = 352; double y3 = 352; double y4 = 0;

    void drawLines(GraphicsContext gc) {

        gc.setStroke(Color.CORNFLOWERBLUE);
        gc.setLineWidth(lineWidth);
        gc.beginPath();
        gc.moveTo(xMin + getX(h1), yMin - getY(P1));
        gc.lineTo(xMin + getX(h2), yMin - getY(P2));
        gc.lineTo(xMin + getX(h3), yMin - getY(P3));
        gc.lineTo(xMin + getX(h4), yMin - getY(P4));
        gc.lineTo(xMin + getX(h1), yMin - getY(P1));
        gc.stroke();

        gc.setFill(Color.CORNFLOWERBLUE);
        gc.fillOval(xMin + getX(h1) - pointSize/2, yMin - getY(P1) - pointSize/2, pointSize,pointSize);
        gc.fillOval(xMin + getX(h2) - pointSize/2, yMin - getY(P2) - pointSize/2, pointSize,pointSize);
        gc.fillOval(xMin + getX(h3) - pointSize/2, yMin - getY(P3) - pointSize/2, pointSize,pointSize);
        gc.fillOval(xMin + getX(h4) - pointSize/2, yMin - getY(P4) - pointSize/2, pointSize,pointSize);
    }
}
