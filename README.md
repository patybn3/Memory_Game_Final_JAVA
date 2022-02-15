Final Project GUI - Memory Game   
CIS-160 NECC   
Professor: Kristen Sparrow   
Developer: Patricia Antlitz

<strong><u>REQUIREMENTS:</u></strong>
********************
OBJECTIVE: To apply object-oriented and basic programing skills to an independent application.

Write a program of your choice that utilizes the following skills:

Inheritance  
method overriding  
explicit constructors  
use of the keyword super  
overloaded methods and constructors  
decision/ looping constructs  
Composition  
contains reference/object variables  
uses polymorphic containers (array, ArrayList, Vector)  
use the keyword this  
overloaded methods and constructors  
decision/ looping constructs  
File/IO  
write to a file and/or read from a file  
take input (command line/ or GUI)  
Swing  
program must include a simple GUI  
Comments - appropriately commented code  

***
<strong><u>USER STORIES:</u></strong>

//An user should be able to start the game from the console and/or IDE  
//An user should be able to access all functionalities from the main page    
//An user should be able to add a player name    
//An user should be able to start and restart a game at any time   
//An user should be able to exit the game at any time    
//An user should be able to go back to the main frame at any time    
//An user should be able to see the program's information.    
//An user should not be allowed to start a game without a player name
***

<strong><u>BREAKDOWN:</u></strong>
***

<b>This project uses Nimbus and UIManager for its looks and feels</b>

This is a Bob's Burger theme memory game. It will trigger 
an initial screen with a start, exit and information
buttons. 

The start button will open another frame that ask the user to enter a player name. This frame contains a
JTextField label and box, it also contains a "Submit" button. The game can only be started if the
user enters a player name. In case the user tries to submit a blank text field, the program will
generate a popup with an error message. This Frame stays open during the duration of the game.
It can only be closed if the close button (X) is clicked or if the game is terminated. 

Once the player enters a name and clicks "submit" a new window opens with the game board.
Initially, the board is inactive. The player must click "Stat" to start the game. When the game starts
all cards a flipped for a split of a second to allow the player to have a peek. The cards on the board are then
flipped upside down, and the player will need to pick two cards at a time to make a match.

The game contains a 4 X 4 board with 8 images. Each image appears
twice in the board and must be matched. A match is worth 5 point.
When the images are not matched the player loses 2 points.

The game is won when all tiles have been matched, and the total score
is higher than 0. Consequently, the game is lost when all tiles
have been matched, but the total score is negative.

Once the game is over, another screen pops up with a winner/loser
message.

The Player can click the "Exit" button on the main frame at anytime to exit the game and terminate the process.
The main frame is always open. The user can individually close all windows before exiting the program.

The main frame has also a button for "Information" with basic instructions and developing information.

***

<strong><u>FUTURE IMPROVEMENTS:</u></strong>

* Boards of different sizes: 4 x 4  -  5 x 5  -  6 x 6
* Display the player's name on the board
* Different themes
* Add an anonymous radio button or check box for players who do not wish to add a name
* Record the user's score into a file
* Allow the player name frame to be closed at submit.

***

<strong><u>TECHNOLOGIES USED:</u></strong>
 * IntelliJ IDEA 15v
 * JAVA 16.0.2v
 * Git
 * GitHub
 * Java Swing
 * Nimbus
 * UIManager
 * Java AWT
 * Java Util
 * Java io
***

<strong><u>FILE BREAKDOWN:</u></strong>

* <i>src/BobsBurger/</i> - Folder:  
Contains all images used on this program 
  
  
* <i>src/userInfo.txt</i> - Text File    
Holds all player's name.
  
  
* <i>Final_PatriciaAntlitz.java</i> - Main
  

* <i>GameImages.java</i> -  
Images are loaded. Cards are enabled / disabled. Contains the calls to start, reset, and end the program.
  

* <i>CardRack.java</i> -  
This file extends <i>GameImages.java</i>. This class holds the setup of the JFrame. 
  It takes all calls, methods and variables from GameImages to load into the frame. All tiles 
  are designed here, the whole game screen.
  

* <i>DrawCards,java</i> -    
This file's class holds the logic that will set the ID of each image (not the squares)
  

* <i>InitialAndExitScreen.java</i> -  
This class extends the file <i>MemoryGame.java</i>    
This file contains the initial (main), and the exit (last) frames. This uses the same frame
  as the main and exit frame. The main frame is the one that first pops up when the game is ran.
  It contains the "Play", "Exit", and "Info" buttons. Each button triggers a method from file
  <i>MemoryGame</i>. "Play" will call the method that triggers the play name frame from <i>Person.java</i>.
  "Info" triggers the frame with the game information and instructions from the file <i>GameInfo.java</i>.
  "Exit" will call the exit method from the same class, to display the exit frame. It hides all
  buttons and changes the frame's picture. This method has a timer that calls the method
  that ends the game from <i>MemoryGame.java</i>.
  This is the file called as an object on the Main file, <i>Final_PatriciaAntlitz.java</i>.
  All other classes and files are connected in one way, or the other to this file.
  

* <i>MemoryGame.java</i> -    
This file contains the calls to trigger the player's name method, the instructions' method,
  and the exit method.   
  This is the only class that contains a main method with the exception to the Main file.
  

* <i>Person.java</i> -    
This file/class is triggered when the user clicks "Play" from the main menu. It will open a screen
  that asks the user to enter their name. The game board will only popup once the name is entered and
  submitted. This class has a method that will write the name entered into a file called <i>userInfo.txt</i>.
  

* <i>GameInfo.java</i> -   
This classes holds the frame that pops up when "Info" is clicked from the main menu.


* <i>VariablesUsed</i> -   
This class holds the most used design calls such as the Font used, and the colors used.
  
***

<strong><u>ORIGINAL UML:</u></strong>

<img width="1134" alt="Screen Shot 2021-12-15 at 1 08 39 AM" src="https://user-images.githubusercontent.com/59259041/146132968-265836c4-6430-40d7-b5ff-178a3bfaa35d.png">

***
<strong><u>ORIGINAL DESIGN/WIREFRAME:</u></strong>

<img width="1117" alt="Screen Shot 2021-12-15 at 1 09 13 AM" src="https://user-images.githubusercontent.com/59259041/146133017-c7ee4aab-4b05-4d9f-9b06-6e4e3bd23084.png">

***
<strong><u>FINAL DESIGN:</u></strong>

<strong>Initial Page:</strong>
<img width="1282" alt="Screen Shot 2021-12-15 at 1 11 59 AM" src="https://user-images.githubusercontent.com/59259041/146133475-9bafd8da-5fd8-49b2-a500-6c366799680d.png">   

***
<strong>Game Board:</strong>
<img width="1318" alt="Screen Shot 2021-12-15 at 1 12 29 AM" src="https://user-images.githubusercontent.com/59259041/146133531-b271705b-e5b6-433a-b5f7-c2edeaada685.png">

***
<strong>Game Over Message:</strong>
<img width="1279" alt="Screen Shot 2021-12-15 at 1 12 49 AM" src="https://user-images.githubusercontent.com/59259041/146133621-c06c5ce6-10ca-4355-8643-e48b0951f18a.png">

***
<strong>Exit Window:</strong>
<img width="472" alt="Screen Shot 2021-12-15 at 1 12 58 AM" src="https://user-images.githubusercontent.com/59259041/146133700-db30bf51-c106-41e6-bed3-4ad7d380aefa.png">

***

<strong><u>SOURCES:</u></strong>

- http://wtkrieger.faculty.noctrl.edu/csc161_spring2015/program1.pdf - memory game planning
- https://stackabuse.com/java-read-a-file-into-a-string/ - file read into string
- https://stackoverflow.com/questions/17059575/how-to-change-the-font-in-joptionpane-showinputdialog-jtextfield - change font on JOptionPane
- https://stackoverflow.com/questions/26913923/how-do-you-change-the-size-and-font-of-a-joptionpane - change font on JOptionPane
- https://www.delftstack.com/howto/java/how-to-check-type-of-a-variable-in-java/ - check variable type
- https://www.javatpoint.com/java-bufferedreader-class - BufferedReader info
- https://stackoverflow.com/questions/29077801/read-last-character-of-a-text-file - Read last line on a file       
- https://www.geeksforgeeks.org/java-swing-simple-user-registration-form/ - user form
- https://www.dreamincode.net/forums/topic/250088-close-jframe-using-a-timer-in-netbeans/ - timer

  
- Nimbus:
- https://stackoverflow.com/questions/7612592/jframe-and-nimbus-look-and-feel
- https://www.jasperpotts.com/blog/2008/08/nimbus-uimanager-uidefaults/
- https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
- https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/nimbus.html
- https://www.nimbusframework.com/docs/Introduction


- Game Examples:
- https://www.javatpoint.com/Puzzle-Game
- http://www.techdive.in/java/card-game-using-java
- https://www.dreamincode.net/forums/topic/195020-memoryconcentration-game/
- https://www.freelancer.com/projects/java/matching-game-via-java-gui/?ngsw-bypass=&w=f
- https://www.experts-exchange.com/questions/21596465/Memory-Game-problem-GUIs-and-user-inputs.html
- https://stackoverflow.com/questions/40187591/simple-java-swing-gui-for-game
- https://stackoverflow.com/questions/23497405/flipping-the-cards-for-memory-card-game-isnt-working-in-java-without-applets
- https://github.com/propol/Memory_Game



<strong>
GitHub @paty_bn3
Patricia Antlitz
</strong>
