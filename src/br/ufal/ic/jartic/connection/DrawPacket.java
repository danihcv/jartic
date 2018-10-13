package br.ufal.ic.jartic.connection;

import javafx.scene.paint.Color;

public class DrawPacket extends Packet {
    public double x, y, brushSize, colorRed, colorGreen, colorBlue, colorOpacity;

    public DrawPacket(double x, double y, double brushSize, double colorRed, double colorGreen, double colorBlue,
                      double colorOpacity) {
        this.type = "DRAW";
        this.x = x;
        this.y = y;
        this.brushSize = brushSize;
        this.colorRed = colorRed;
        this.colorGreen = colorGreen;
        this.colorBlue = colorBlue;
        this.colorOpacity = colorOpacity;
    }
}
