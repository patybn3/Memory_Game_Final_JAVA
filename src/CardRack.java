import javax.swing.*;
import java.awt.*;

//this panel is the game board will hold all images and methods from GameImages
//This is the actual frame
//inheritance
public class CardRack extends GameImages{
    //explicit constructor
    public CardRack(){
        //keyword super
        super();
        this.initComponents();
    }
//
    public void initComponents() {

        //initiated every button (tile)
        tile1 = new JButton();
        tile2 = new JButton();
        tile3 = new JButton();
        tile4 = new JButton();
        tile5 = new JButton();
        tile6 = new JButton();
        tile7 = new JButton();
        tile8 = new JButton();
        tile9 = new JButton();
        tile10 = new JButton();
        tile11 = new JButton();
        tile12 = new JButton();
        tile13 = new JButton();
        tile14 = new JButton();
        tile15 = new JButton();
        tile16 = new JButton();

        //and the fields/labels/other buttons used
        scoreField = new JTextField();
        screenLabel = new JLabel();
        startGameButton = new JButton();
        quitButton = new JButton();

        //if the game window is closed, it will be disposed
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //window title
        setTitle("Bob's Burger Memory Game Board");
        setResizable(false);

        //Setup for TILE!
        tile1.setEnabled(false);
        tile1.setFocusable(false);
        tile1.setMaximumSize(new Dimension(32, 10));
        tile1.setMinimumSize(new Dimension(32, 10));
        tile1.setPreferredSize(new Dimension(30, 10));
        //this will get the method tile1Action form GameImages
        tile1.addActionListener(this::tile1Action);

        //TILE2
        tile2.setEnabled(false);
        tile2.setFocusable(false);
        tile2.setName(""); // NOI18N
        tile2.addActionListener(this::tile2Action);

        //TILE3
        tile3.setEnabled(false);
        tile3.setFocusable(false);
        tile3.addActionListener(this::tile3Action);

        //TILE4
        tile4.setEnabled(false);
        tile4.setFocusable(false);
        tile4.addActionListener(this::tile4Action);

        //TILE5
        tile5.setEnabled(false);
        tile5.setFocusable(false);
        tile5.addActionListener(this::tile5Action);

        //TILE6
        tile6.setEnabled(false);
        tile6.setFocusable(false);
        tile6.addActionListener(this::tile6Action);

        //TILE7
        tile7.setEnabled(false);
        tile7.setFocusable(false);
        tile7.addActionListener(this::tile7Action);

        //TILE8
        tile8.setEnabled(false);
        tile8.setFocusable(false);
        tile8.addActionListener(this::tile8Action);

        //TILE9
        tile9.setEnabled(false);
        tile9.setFocusable(false);
        tile9.addActionListener(this::tile9Action);

        //TILE10
        tile10.setEnabled(false);
        tile10.setFocusable(false);
        tile10.addActionListener(this::tile10Action);

        //TILE11
        tile11.setEnabled(false);
        tile11.setFocusable(false);
        tile11.addActionListener(this::tile11Action);

        //TILE12
        tile12.setEnabled(false);
        tile12.setFocusable(false);
        tile12.addActionListener(this::tile12Action);

        //TILE13
        tile13.setEnabled(false);
        tile13.setFocusable(false);
        tile13.addActionListener(this::tile13Action);

        ////TILE14
        tile14.setEnabled(false);
        tile14.setFocusable(false);
        tile14.addActionListener(this::tile14Action);

        //TILE15
        tile15.setEnabled(false);
        tile15.setFocusable(false);
        tile15.addActionListener(this::tile15Action);

        //TILE16
        tile16.setEnabled(false);
        tile16.setFocusable(false);
        tile16.addActionListener(this::tile16Action);

        //text field for the score
        scoreField.setEditable(false);
        scoreField.setBackground(VariablesUsed.BACKGROUND_COLOR);
        scoreField.setFont(VariablesUsed.GAME_FONT);
        scoreField.setText("0");
        scoreField.setDisabledTextColor(Color.BLACK);
        scoreField.setEnabled(false);
        scoreField.setFocusable(false);

        //textfield label
        screenLabel.setFont(VariablesUsed.GAME_FONT); // NOI18N
        screenLabel.setForeground(VariablesUsed.RED_COLOR);
        screenLabel.setText("SCORE:");

        //buttons - start game and quit game
        startGameButton.setText("START");
        startGameButton.setToolTipText("");
        //calls the method startGame from GameImages
        startGameButton.addActionListener(this::startGame);
        startGameButton.setFont(VariablesUsed.GAME_FONT);
        startGameButton.setForeground(VariablesUsed.BUTTON_TEXT_COLOR);

        quitButton.setText("QUIT");
        //calls method quitButtonAction from GameImages
        quitButton.addActionListener(this::quitButtonAction);
        quitButton.setFont(VariablesUsed.GAME_FONT);
        quitButton.setForeground(VariablesUsed.BUTTON_TEXT_COLOR);


        //game frame layout for each tile and the frame
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tile5, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tile6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tile7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tile8, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(1, 1, 1))
                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(tile1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tile2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tile3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tile4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(tile13, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addComponent(tile9, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(tile14, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(tile15, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(tile16, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(tile10, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(tile11, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(tile12, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(screenLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(scoreField, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(startGameButton)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(quitButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(135, Short.MAX_VALUE))
//                        .addGap(135, 135, 135)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(tile3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(tile6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(tile11, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile9, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile10, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile12, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(tile13, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile14, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile15, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tile16, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(scoreField, GroupLayout.DEFAULT_SIZE, 45,
                                                Short.MAX_VALUE)
                                        .addComponent(screenLabel, GroupLayout.DEFAULT_SIZE,
                                                45, Short.MAX_VALUE)
                                        .addComponent(startGameButton, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(quitButton, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addContainerGap())
        );

        pack();

        //this will set the window in the center of the monitor
        setLocationRelativeTo(null);
    }
//    }//end inner class
}//end outer class
