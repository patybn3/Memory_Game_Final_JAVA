/*
FINAL PROJECT
OBJECTIVE: To apply object oriented and basic programing skills to an independent application.

CIS-160 - Computer Science I - NECC
Professor: Kristen Sparrow
Student: Patricia Antlitz

Project Specification and Requirements - README
Sources - README
 */

/**
 * @author Patricia Antlitz
 * @version 2.0
 */

import javax.swing.*;
import java.io.IOException;
//MAIN FILE
public class Final_PatriciaAntlitz {

    public static void main(String args[]) {

        //using Nimbus and UIManager for the look and feel of the program
        try{
            //selected loop and feel
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if("Nimbus".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    //this changes the colors or the background and controls
                    UIManager.put("nimbusBase", VariablesUsed.YELLOW_COLOR);
                    UIManager.put("nimbusBlueGrey", VariablesUsed.YELLOW_COLOR);
                    //color for the controls (buttons, etc)
                    UIManager.put("control", VariablesUsed.BACKGROUND_COLOR);

                    //setup for OptionPane error/win/lose popups
                    UIManager.put("OptionPane.messageFont", VariablesUsed.GAME_FONT);
                    UIManager.put("OptionPane.buttonFont", VariablesUsed.GAME_FONT);
                    UIManager.put("OptionPane.buttonForeground", VariablesUsed.BUTTON_TEXT_COLOR);
                    UIManager.put("OptionPane.messageForeground", VariablesUsed.BUTTON_TEXT_COLOR);
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardRack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //this file contains all the calls/connection that runs the program
        InitialAndExitScreen getScreen = new InitialAndExitScreen();
        getScreen.setVisible(true);
    }
}
