import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//panel welcome image, play game, exit game and info buttons, trigger game
//extends MemoryGame by adding a panel to the frame with the functionalities
//inheritance
public class InitialAndExitScreen extends MemoryGame{

    //explicit constructor
    public InitialAndExitScreen(){
        //keyword super
        super();
        this.createFrame();
    }

    //final screen
    public void exitGameAction(ActionEvent event) {

        //this will hide the buttons from the entry page since this is using the same frame
        playGame.setVisible(false);
        exitGame.setVisible(false);
        gameInfo.setVisible(false);

        //will close/terminate when the window is closed
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //frame used, sets the image
        frameLabel.setIcon(new ImageIcon(getClass().getResource("/BobsBurger/Screens/goodbye.png")));

        //layout for the final window
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(frameLabel, GroupLayout.DEFAULT_SIZE,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(frameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
        //places it in the middle
        setLocationRelativeTo(null);

        //this window has not exit button, it will quit on a timer
        Timer closeTimer = new Timer(1000, this::finalExit);
        closeTimer.start();

    }//end

    //first window when the program is ran
    public void createFrame() {

        frameLabel = new JLabel();
        playGame = new JButton("Play");
        exitGame = new JButton("Exit");
        gameInfo = new JButton("Info");
        newFont = (VariablesUsed.BUTTON_FONT);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bob's Burgers Memory Game");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        //same frame with a different image
        frameLabel.setIcon(new ImageIcon(getClass().getResource("/BobsBurger/Screens/gameentry2.png")));

        //calls the methods in MemoryGame.java
        //startGame button
        playGame.addActionListener(this::playGameAction);

        //exit the game/terminate the program
        exitGame.addActionListener(this::exitGameAction);

        //game info
        gameInfo.addActionListener(this::infoButtonAction);

        //sets the size and position of the buttons
        playGame.setBounds(130, 300, 150, 40);
        gameInfo.setBounds(130, 340, 150, 40);
        exitGame.setBounds(130, 380, 150, 40);

        //sets the font and size
        playGame.setFont(newFont);
        gameInfo.setFont(newFont);
        exitGame.setFont(newFont);

        //changes the button color
        playGame.setForeground(VariablesUsed.BUTTON_TEXT_COLOR);
        gameInfo.setForeground(VariablesUsed.BUTTON_TEXT_COLOR);
        exitGame.setForeground(VariablesUsed.BUTTON_TEXT_COLOR);

        //will add the buttons to the screen
        frameLabel.add(playGame);
        frameLabel.add(gameInfo);
        frameLabel.add(exitGame);

        //layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(frameLabel, GroupLayout.DEFAULT_SIZE, 880,
                                        GroupLayout.DEFAULT_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15 , 15, 15)
                                .addGap(60, 60, 60))
                        .addComponent(frameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
        //places it in the middle
        setLocationRelativeTo(null);

    }
}


