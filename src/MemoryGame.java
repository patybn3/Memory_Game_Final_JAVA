import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//this class will hold the calls for the initial window
public class MemoryGame extends JFrame {

    CardRack gameBoard = new CardRack();
    Person getUserFrame = new Person(gameBoard);
    GameInfo getInfo = new GameInfo();

    JLabel frameLabel;
    JButton playGame;
    JButton exitGame;
    JButton gameInfo;
    Font newFont;

    //method to trigger the player's name frame
    public void playGameAction(ActionEvent event) {
       getUserFrame.userNameAction(event);
    }//end

    //quit the game and terminated the process
    public void finalExit(ActionEvent event){
        System.out.println("Goodbye!");
        //keyword this
        this.dispose();
        System.exit(0);
    }

    //will open an information window
    public void infoButtonAction(ActionEvent event) {
        System.out.println("Information");
        getInfo.informationWindow();
    }

    //runs the calls
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> new MemoryGame().setVisible(true));

    }
}

