package processing.test.resultscreen;

import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class resultScreen extends PApplet {

    String choice;
    String rivalChoice;
    String result;
    String symbol;

    public void setup() {
        background(0);
        choice = getIntent().getExtras().getString("Choice");
        rivalChoice = getIntent().getExtras().getString("RivalChoice");
        result = getIntent().getExtras().getString("Result");
        symbol = getIntent().getExtras().getString("Symbol");
    }

    public void draw() {
        choice = getIntent().getExtras().getString("Choice");
        rivalChoice = getIntent().getExtras().getString("RivalChoice");
        result = getIntent().getExtras().getString("Result");
        symbol = getIntent().getExtras().getString("Symbol");
        String text;
        textSize(300);
        text(result + '!', 240, 300);

        textSize(100);
        text("You:", 150, 730);
        image(loadImage(choice + ".png"), 50, 800, 400, 400);
        text("Opponent:", 700, 730);
        image(loadImage(rivalChoice + ".png"), 750, 800, 400, 400);

        textSize(500);
        text(symbol, 465, 1175);

        textSize(100);
        text("Click anywhere to return \n     to the main menu!", 70, 1400);
    }

    public void mousePressed() {
        exit();
    }

}
