import javax.swing.*;
import java.awt.*;

//information/instructions window

//this class will hold basic setups for the strings
class InfoText extends JLabel {

    public InfoText(String createInstructions){
        setText(createInstructions);
        setFont(VariablesUsed.GAME_FONT);
        setForeground(VariablesUsed.BUTTON_TEXT_COLOR);
    }
}

//Frame class
public class GameInfo extends JFrame {

    //calls previous class to generate each string
    InfoText getEntry = new InfoText(" ");
    InfoText getEntrya = new InfoText("         - This is a memory game.");

    InfoText getEntry1 = new InfoText("         - The objective of this game is to match two cards " +
            "until all the cards on the board are matched.");

    InfoText getEntry2 = new InfoText("         - To play the game you will need to click on the 'Play' " +
            "button on the front page.");

    InfoText getEntry3 = new InfoText("         - You will have to enter a player name. Player names are required.");

    InfoText getEntry4 = new InfoText("         - Once the board open the player needs to click on " +
            "the button that reads 'Star'.\n");

    InfoText getEntry5 = new InfoText("         - Once the start button is clicked, all cards on the " +
            "board will flip and the player will be");
    InfoText getEntry5a = new InfoText("          able to see them for a split of a second.\n");

    InfoText getEntry6 = new InfoText("         - Cards are matched by clicking on two cards.\n");

    InfoText getEntry7 = new InfoText("         - A match will add 5 points to the score.\n");

    InfoText getEntry8 = new InfoText("         - 2 points will be deducted from the score when cards that do not match are selected\n");

    InfoText getEntry9 = new InfoText("         - The player will win the game when all cards are matched");
    InfoText getEntry9a = new InfoText("    AND the final score is a positive number.\n");

    InfoText getEntry10 = new InfoText("        - The Player will lose the game when the final score is negative.\n");

    InfoText getEntry11 = new InfoText("        **** Developed by Patricia Antlitz @paty_bn3 - GitHub ****\n");

    //Creating frame
    public void informationWindow(){

        //will close when X is clickes
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //size and label of the window
        setSize(900, 700);
        setTitle("Game Instructions");

        //will allow 15 rows to space out the entries
        setLayout(new GridLayout(16, 1));

        //adding strings
        this.add(getEntry);
        this.add(getEntrya);
        this.add(getEntry1);
        this.add(getEntry2);
        this.add(getEntry3);
        this.add(getEntry4);
        this.add(getEntry5);
        this.add(getEntry5a);
        this.add(getEntry6);
        this.add(getEntry7);
        this.add(getEntry8);
        this.add(getEntry9);
        this.add(getEntry9a);
        this.add(getEntry10);
        this.add(getEntry11);

        setVisible(true);
    }
}
