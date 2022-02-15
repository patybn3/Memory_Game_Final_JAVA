
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.*;

//All images used and the methods related to the images and the game board are present in this file
//the actual frame and the looks are present in the file called CardRack which extends from this class
public class GameImages extends JFrame {
    //calling file DrawCards, this file contains controls for the tiles
    //object reference
    DrawCards drawingCards = new DrawCards();
    //all variables used throughout the program
    int guessOneNUm, guessTwoNum;
    int typeOne, typeTwo;
    boolean isMatch;
    int gameScore, count;
    String sScore;
    int idOneGuess, idTwoGuess;
    double getPairs, correctPairs;
    String newUser;
    String getNameString;
    String lastWord;

    //JFrame variables
    JTextField scoreField;
    JLabel screenLabel;
    JButton startGameButton, quitButton;

    //Variables used for each of the tiles (squares)
    JButton tile1;
    JButton tile2;
    JButton tile3;
    JButton tile4;
    JButton tile5;
    JButton tile6;
    JButton tile7;
    JButton tile8;
    JButton tile9;
    JButton tile10;
    JButton tile11;
    JButton tile12;
    JButton tile13;
    JButton tile14;
    JButton tile15;
    JButton tile16;

    //each image to a variable ImageIcon
    ImageIcon bobBelcher    = new ImageIcon(getClass().getResource("/BobsBurger/bob.jpeg"));
    ImageIcon lindaBelcher    = new ImageIcon(getClass().getResource("/BobsBurger/linda.jpeg"));
    ImageIcon louiseBelcher   = new ImageIcon(getClass().getResource("/BobsBurger/louise2.jpeg"));
    ImageIcon tinaBelcher     = new ImageIcon(getClass().getResource("/BobsBurger/tina.jpeg"));
    ImageIcon geneBelcher   = new ImageIcon(getClass().getResource("/BobsBurger/gene.jpeg"));
    ImageIcon tammy   = new ImageIcon(getClass().getResource("/BobsBurger/download.jpeg"));
    ImageIcon zeke      = new ImageIcon(getClass().getResource("/BobsBurger/zeek.jpeg"));
    ImageIcon teddy         = new ImageIcon(getClass().getResource("/BobsBurger/teddy.jpeg"));
    ImageIcon backTile     = new ImageIcon(getClass().getResource("/BobsBurger/Screens/back.jpeg"));
    ImageIcon WINNER       = new ImageIcon(getClass().getResource("/BobsBurger/Screens/alright.jpeg"));
    ImageIcon LOSER      = new ImageIcon(getClass().getResource("/BobsBurger/Screens/gale.png"));


    /*
    This method takes the file with all the names entered in the Person.java class
    it adds the last word to a string
    this will allow the program to print the correct user's score
     */
    public String readAString() throws IOException {
        //FILE IO Read
        FileReader getFile;
        lastWord = null;

        try {
            //file reader reads the content in the file
            getFile = new FileReader("userInfo.txt");
            //holds the content temp
            BufferedReader readWord = new BufferedReader(getFile);

            //reads the line
            while((getNameString = readWord.readLine()) != null){
                lastWord = getNameString;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return  lastWord;
    }

    //method overloading
    public void imageShape(ArrayList<ImageIcon> cardImages){
        System.out.println("Get Images");
        //array cardImage received 8 images, images will be placed on the board twice to
        cardImages.add(bobBelcher);
        cardImages.add(lindaBelcher);
        cardImages.add(louiseBelcher);
        cardImages.add(geneBelcher);
        cardImages.add(tinaBelcher);
        cardImages.add(teddy);
        cardImages.add(zeke);
        cardImages.add(tammy);
    }

    //overloading
    //adding each image to an array
    public void imageShape(int getID, int cardType){
        //polymorphic container
        ArrayList<ImageIcon> cardImages = new ArrayList<>();
        imageShape(cardImages);
        //ID will be equal to the ID for each image from 0-15
        //and set the icon to the one it matches.
        switch (getID) {
            case 0 -> tile1.setIcon(cardImages.get(cardType));
            case 1 -> tile2.setIcon(cardImages.get(cardType));
            case 2 -> tile3.setIcon(cardImages.get(cardType));
            case 3 -> tile4.setIcon(cardImages.get(cardType));
            case 4 -> tile5.setIcon(cardImages.get(cardType));
            case 5 -> tile6.setIcon(cardImages.get(cardType));
            case 6 -> tile7.setIcon(cardImages.get(cardType));
            case 7 -> tile8.setIcon(cardImages.get(cardType));
            case 8 -> tile9.setIcon(cardImages.get(cardType));
            case 9 -> tile10.setIcon(cardImages.get(cardType));
            case 10 -> tile11.setIcon(cardImages.get(cardType));
            case 11 -> tile12.setIcon(cardImages.get(cardType));
            case 12 -> tile13.setIcon(cardImages.get(cardType));
            case 13 -> tile14.setIcon(cardImages.get(cardType));
            case 14 -> tile15.setIcon(cardImages.get(cardType));
            case 15 -> tile16.setIcon(cardImages.get(cardType));
        }
    }


    //this method enables and disables the squares
    public void enableSwitch(boolean cardState, int getID){

        switch(getID){
            case 0:
                tile1.setEnabled(cardState);
                System.out.println("Draw Card " + getID); //gives the id on the terminal
                break;
            case 1:
                tile2.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 2:
                tile3.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 3:
                tile4.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 4:
                tile5.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 5:
                tile6.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 6:
                tile7.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 7:
                tile8.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 8: tile9.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 9: tile10.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 10: tile11.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 11: tile12.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 12: tile13.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 13:
                tile14.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 14: tile15.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            case 15:
                tile16.setEnabled(cardState);
                System.out.println("Draw Card " + getID);
                break;
            default:
                break;
        }
    }

    //this sets all the tiles, this will be used to start the game and reset
    public void enableTiles(){
        System.out.println("Resetting tiles");

        tile1.setEnabled(true);
        tile2.setEnabled(true);
        tile3.setEnabled(true);
        tile4.setEnabled(true);
        tile5.setEnabled(true);
        tile6.setEnabled(true);
        tile7.setEnabled(true);
        tile8.setEnabled(true);
        tile9.setEnabled(true);
        tile10.setEnabled(true);
        tile11.setEnabled(true);
        tile12.setEnabled(true);
        tile13.setEnabled(true);
        tile14.setEnabled(true);
        tile15.setEnabled(true);
        tile16.setEnabled(true);
    }


    //similar to the previous one, but it hides the tiles by setting the image as the back of the card
    public void wipeCards(){
        System.out.println("Clear all tiles");

        tile1.setIcon(backTile);
        tile2.setIcon(backTile);
        tile3.setIcon(backTile);
        tile4.setIcon(backTile);
        tile5.setIcon(backTile);
        tile6.setIcon(backTile);
        tile7.setIcon(backTile);
        tile8.setIcon(backTile);
        tile9.setIcon(backTile);
        tile10.setIcon(backTile);
        tile11.setIcon(backTile);
        tile12.setIcon(backTile);
        tile13.setIcon(backTile);
        tile14.setIcon(backTile);
        tile15.setIcon(backTile);
        tile16.setIcon(backTile);
    }

    //the purpose of this method (differently to the previous one) is to hide a tile based on their ID only
    public void hideTile(int getID){
        System.out.println("Hide Cards ");
        switch (getID){
            case 0 -> tile1.setIcon(backTile);
            case 1 -> tile2.setIcon(backTile);
            case 2 -> tile3.setIcon(backTile);
            case 3 -> tile4.setIcon(backTile);
            case 4 -> tile5.setIcon(backTile);
            case 5 -> tile6.setIcon(backTile);
            case 6 -> tile7.setIcon(backTile);
            case 7 -> tile8.setIcon(backTile);
            case 8 -> tile9.setIcon(backTile);
            case 9 -> tile10.setIcon(backTile);
            case 10 -> tile11.setIcon(backTile);
            case 11 -> tile12.setIcon(backTile);
            case 12 -> tile13.setIcon(backTile);
            case 13 -> tile14.setIcon(backTile);
            case 14 -> tile15.setIcon(backTile);
            case 15 -> tile16.setIcon(backTile);
        }
    }


    //this does not quit the game, but checks the the game ended to give the user an score
    public void endTheGame(double gameTotals, double correctPairs, int gameScore){
        System.out.println("Play until end.");

        if(!tile1.isEnabled() && !tile2.isEnabled() && !tile3.isEnabled() &&
                !tile4.isEnabled() && !tile5.isEnabled() && !tile6.isEnabled() &&
                !tile7.isEnabled() && !tile8.isEnabled() && !tile9.isEnabled() &&
                !tile10.isEnabled() && !tile11.isEnabled() && !tile12.isEnabled() &&
                !tile13.isEnabled() && !tile14.isEnabled() && !tile15.isEnabled() &&
                !tile16.isEnabled()){

            System.out.println("******** GAME OVER ********\n"+
                    "Guesses Total = " + gameTotals + " Correct Guesses = " + correctPairs +
                    " Score = " + gameScore);

            //as long as the end score is positive, the player wins
            if(gameScore > 0){

                System.out.println("WINNER.");
                JOptionPane.showMessageDialog(rootPane,
                        "\nLinda: \n    - Alrighttttttt!!!\n" +
                                lastWord + "'s Score is: " + gameScore + "\n" +
                                "\nGene: \n    - Was it obvious I don't care?",
                        "GAME OVER - WINNER",
                        JOptionPane.INFORMATION_MESSAGE, WINNER);
            }//if the score is negative, the player loses
            else {
                System.out.println("LOSER.");
                JOptionPane.showMessageDialog(rootPane,
                        "\nShame on you!!!\n"+
                                lastWord + "'s Score is: " + gameScore + "\n" +
                                "Linda: \n    - All the losers get stickers! \nStickers of shame! ****.\n" +
                        "\nBob: \n    - Now, let me see your \n'everything is okay' face",
                        "GAME OVER - LOSER",
                        JOptionPane.INFORMATION_MESSAGE, LOSER);
            }
        }

    }

    //matches one tile to the other
    public boolean checkIfMatch(int cardType1, int cardType2){
        System.out.println("Is this a match?");
        boolean isMatch = false;

        if(cardType1 == cardType2){
            isMatch = true;
        }
        return isMatch;
    }

    //thi following methods are the events for each of the tiles, it sets their IDs and gets the method
    //from DrawCards that will check if the images match giving them a id
    public void tile1Action(ActionEvent event) {
        int getID = 0;
        int cardType;

        System.out.print("Position: 1 x 1 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile2Action(ActionEvent event) {
        int getID = 1;
        int cardType;

        System.out.print("Position: 1 x 2 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile3Action(ActionEvent event) {
        int getID = 2;
        int cardType;

        System.out.print("Position: 1 x 3 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile4Action(ActionEvent event) {
        int getID = 3;
        int cardType;

        System.out.print("Position: 1 x 4 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile5Action(ActionEvent event) {
        int getID = 4;
        int cardType;

        System.out.print("Position: 2 x 1 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile6Action(ActionEvent event) {
        int getID = 5;
        int cardType;

        System.out.print("Position: 2 x 2 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile7Action(ActionEvent event) {
        int getID = 6;
        int cardType;

        System.out.print("Position: 2 x 3 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile8Action(ActionEvent event) {
        int getID = 7;
        int cardType;

        System.out.print("Position: 2 x 4 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile9Action(ActionEvent event) {
        int getID = 8;
        int cardType;

        System.out.print("Position: 3 x 1 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile10Action(ActionEvent event) {
        int getID = 9;
        int cardType;

        System.out.print("Position: 3 x 2 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile11Action(ActionEvent event) {
        int getID = 10;
        int cardType;

        System.out.print("Position: 3 x 3 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile12Action(ActionEvent event) {
        int getID = 11;
        int cardType;

        System.out.print("Position: 3 x 4 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile13Action(ActionEvent event) {
        int getID = 12;
        int cardType;

        System.out.print("Position: 4 x 1 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile14Action(ActionEvent event) {
        int getID = 13;
        int cardType;

        System.out.print("Position: 4 x 2 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile15Action(ActionEvent event) {
        int getID = 14;
        int cardType;

        System.out.print("Position: 4 x 3 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }

    public void tile16Action(ActionEvent event) {
        int getID = 15;
        int cardType;

        System.out.print("Position: 4 x 4 - ");
        cardType = drawingCards.getCardType(getID);
        pressingTiles(getID, cardType);
    }//end of tiles


    public void timeLapse(){
        Thread thread = new Thread(() -> {
            try{
                for(int i = 0; i <= 15; i++){
                    int tileType = drawingCards.getCardType(i);
                    imageShape(i, tileType);
                }
                Thread.sleep(800);
                wipeCards();
            }
            catch(InterruptedException ex){
                Logger.getLogger(CardRack.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        thread.start();
    }

    //actions when a tiles is pressed
    public void pressingTiles(int getID, int cardType){
        //first click
        if(count == 0){
            System.out.println("Count 0: " + count);
            //gets the image
            imageShape(getID, cardType);
            guessOneNUm = getID;
            typeOne = cardType;

            System.out.println("Guess 1** Location 1: " + getID + ". Shape: " + cardType);
            //will increment
            count++;

            //if its not a match the cards a reset by "flipping" them
            if(!isMatch){
                hideTile(idOneGuess);
                hideTile(idTwoGuess);
            }
        } //the second tile picked
        else if(count == 1){
            System.out.println("Count 1: " + count);
            imageShape(getID, cardType);
            guessTwoNum = getID;
            typeTwo = cardType;
            idOneGuess = guessOneNUm;
            idTwoGuess = guessTwoNum;

            System.out.println("Guess 2** Location 2: " + getID + ". Shape: " + cardType);

            //this is an error message, it pops up when the user picks the same card twice
            if(guessOneNUm == guessTwoNum){
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Rule: Pick different tiles each time.\n" +
                                "Squares cannot be picked twice.",
                        "Invalid", WIDTH, null
                );

                hideTile(guessOneNUm);

                guessOneNUm = 100;
                guessTwoNum = 100;
                idOneGuess = 100;
                idTwoGuess = 100;

                enableSwitch(true, guessOneNUm);
            }//when there is a match
            else{
                //will check if there is a math
                isMatch = checkIfMatch(typeOne, typeTwo);

                //if not, it takes 2 points from the total
                if(!isMatch){
                    System.out.println("No Match.");
                    gameScore = gameScore - 3;
                    sScore = Integer.toString(gameScore);
                    scoreField.setText(sScore);

                    getPairs++;
                }//if there is a match
                else{
                    System.out.println("MATCH");
                    //the user gains 5 points
                    gameScore = gameScore + 4;
                    sScore = Integer.toString(gameScore);
                    scoreField.setText(sScore);

                    enableSwitch(false, guessOneNUm);
                    enableSwitch(false, guessTwoNum);

                    correctPairs++;
                    getPairs++;

                    endTheGame(getPairs, correctPairs, gameScore);
                }
            }
            count = 0;
        }
    }

    //this will reset the board by disabling and hiding the tiles
    public void resetTheBoard(ActionEvent event){
        System.out.println("Bord Reset");
        wipeCards();

        idOneGuess = 100;
        idTwoGuess = 100;
        guessOneNUm = 100;
        guessTwoNum = 100;
        isMatch = false;
        count = 0;
        gameScore = 0;
        sScore = "0";
        scoreField.setText(sScore);
        correctPairs = 0;
        getPairs = 0;

        enableSwitch(false, 0);
        enableSwitch(false, 1);
        enableSwitch(false, 2);
        enableSwitch(false, 3);
        enableSwitch(false, 4);
        enableSwitch(false, 5);
        enableSwitch(false, 6);
        enableSwitch(false, 7);
        enableSwitch(false, 8);
        enableSwitch(false, 9);
        enableSwitch(false, 10);
        enableSwitch(false, 11);
        enableSwitch(false, 12);
        enableSwitch(false, 13);
        enableSwitch(false, 14);
        enableSwitch(false, 15);

    }

    //the previous method is used here,
    public void menuQuit(ActionEvent event){
        System.out.println("Quitting.");


        resetTheBoard(event);
        enableTiles();
        dispose();
    }

    //will closed the board
    public void quitButtonAction(ActionEvent event){
        menuQuit(event);
    }

    /*this method starts the game. The tiles are "inactive" when the board is first opened
    you cannot click on then without clicking on the "start" button.
     */
    public void startGame(ActionEvent event){
        System.out.println(newUser);
        System.out.println("PLAY");
        idOneGuess = 100;
        idTwoGuess = 100;
        guessOneNUm = 100;
        guessTwoNum = 100;
        isMatch = false;
        count = 0;
        gameScore = 0;
        getPairs = 0;
        correctPairs = 0;

        scoreField.setText(Integer.toString(gameScore));

        enableTiles();
        wipeCards();

        drawingCards.initShuffle();
        for(int i = 0; i <= 15; i++){
            System.out.println(i + ": ");
             drawingCards.getCardType(i);
        }

        System.out.println();
        timeLapse();
    }

}
