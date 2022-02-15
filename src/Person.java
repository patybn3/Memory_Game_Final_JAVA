import javax.print.CancelablePrintJob;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

//this class created a user
//generated a window that will ask the user for their user name
public class Person extends JFrame {

    //Composition
    private CardRack gameBoard;
    public Person(CardRack gameBoard){
        this.gameBoard = gameBoard;
    }

    JLabel newLabel;
    JTextField userEntry;
    JLabel entryLabel;
    JButton saveInfo;
    JButton exitFrame;

    public void generateFile(){
        try {
            //writer, allows appending, that will avoid having all other entries erased
            FileWriter getFile = new FileWriter("userInfo.txt", true);
            //holds entry temp.
            BufferedWriter writeFile = new BufferedWriter(getFile);
            //will print the word into the file
            PrintWriter writeWord = new PrintWriter(writeFile);

            writeWord.println(userEntry.getText());

            writeWord.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //ths methods adds the entries to a file
    public void setNameButton(ActionEvent event){

        System.out.println("Screen Starts!");
        //FILE IO - write to
        generateFile();
        //file name userInfo.txt under src
        //will reset the JTextField (make it blank)
        gameBoard.setVisible(true);
        userEntry.setText("");
        //this is just for testing / console
        try {
            //calls method readString() from CardRack
            //This methods gets the last word on the file, to print as the current player
            System.out.println(gameBoard.readAString());
            //this checks if the new string is of type String
            String check = "welcome, " + gameBoard.lastWord;
            System.out.println(check.getClass().getSimpleName());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void exitButtonAction(ActionEvent event){
        System.exit(0);
    }

    public void userNameAction(ActionEvent event) {

        //creates the frame
        newLabel = new JLabel();
        entryLabel = new JLabel("Enter Player Name:");
        userEntry = new JTextField();
        saveInfo = new JButton("Submit");
        exitFrame = new JButton("Exit");

        //will close/terminate when the window is closed

        setTitle("Player Information");
        //image used
        newLabel.setIcon(new ImageIcon(getClass().getResource("/BobsBurger/getUserName.png")));

        //button
        saveInfo.setBounds(200, 220, 150, 40);
        saveInfo.setFont(VariablesUsed.GAME_FONT);
        saveInfo.setForeground(VariablesUsed.BUTTON_TEXT_COLOR);
        newLabel.add(saveInfo);

        exitFrame.setBounds(300, 320, 65, 35);
        exitFrame.setFont(VariablesUsed.GAME_FONT);
        exitFrame.setForeground(VariablesUsed.BUTTON_TEXT_COLOR);
        newLabel.add(exitFrame);


        //button action
        saveInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //when the jTextField is empty
                if(userEntry.getText().isEmpty()) {
                    //the user will get an popup error
                    //JTextField cannot be empty
                    JOptionPane.showMessageDialog(
                            rootPane,
                            "Player's Name Cannot Be Empty\n" +
                                    "Please Try Again!",
                            "Invalid", WIDTH, null
                    );
                }
                else {
                    //if its not empty it will run the method that writes into the file
                    setNameButton(e);
                }
//
            }
        });

        exitFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitButtonAction(e);
            }
        });


        //Text Field
        //INPUT
        userEntry.setBounds(175, 160, 200, 40);
        newLabel.add(userEntry);

        //this is the label on top of the Text Field
        entryLabel.setFont(VariablesUsed.GAME_FONT);
        entryLabel.setForeground(VariablesUsed.BUTTON_TEXT_COLOR);
        entryLabel.setBounds(175, 125, 200, 40);
        newLabel.add(entryLabel, BorderLayout.WEST);

        setVisible(true);

        //layout setup
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(newLabel, GroupLayout.DEFAULT_SIZE, 300,
                                        GroupLayout.DEFAULT_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())));
        pack();

//        setLocationRelativeTo(null);

    }//end
}
