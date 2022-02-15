import java.util.*;

//composition, memory game has a drawCards - DrawCards will flip the cards and have mouse events
public class DrawCards {

    //each image is assigned to two variables
    int louiseID, louiseID2;
    int lindaID, lindaID2;
    int geneID, geneID2;
    int tinaID, tinaID2;
    int teddyID, teddyID2;
    int zekeID, zekeID2;
    int tammyID, tammyID2;
    int bobID, bobID2;

    //will add all ids (numbers) to an List
    public void initShuffle(){
        int numPosition = 0;

        List<Integer> randomPositions = new ArrayList<>();
        for(int i = 0; i <= 15; i++){
            randomPositions.add(i);
        }

        //will shuffle all ids
        Collections.shuffle(randomPositions);

        //will assign the random num to a image
        louiseID =  randomPositions.get(numPosition);
        numPosition++;
        louiseID2 =  randomPositions.get(numPosition);
        numPosition++;
        lindaID = randomPositions.get(numPosition);
        numPosition++;
        lindaID2 = randomPositions.get(numPosition);
        numPosition++;
        tinaID = randomPositions.get(numPosition);
        numPosition++;
        tinaID2 = randomPositions.get(numPosition);
        numPosition++;
        geneID = randomPositions.get(numPosition);
        numPosition++;
        geneID2 = randomPositions.get(numPosition);
        numPosition++;
        bobID = randomPositions.get(numPosition);
        numPosition++;
        bobID2 = randomPositions.get(numPosition);
        numPosition++;
        tammyID = randomPositions.get(numPosition);
        numPosition++;
        tammyID2 = randomPositions.get(numPosition);
        numPosition++;
        zekeID = randomPositions.get(numPosition);
        numPosition++;
        zekeID2 = randomPositions.get(numPosition);
        numPosition++;
        teddyID = randomPositions.get(numPosition);
        numPosition++;
        teddyID2 = randomPositions.get(numPosition);
        numPosition++;

    }

    //checks which "image" and assign an ID, this corresponds to each image and not each tile
    public int getCardType(int getID){
        int cardType = 100;

        System.out.println("Shape: ");
        if(getID == louiseID || getID == louiseID2){
            cardType = 0;
            System.out.println(cardType + " - Louise Belcher");
        }
        else if(getID == lindaID || getID == lindaID2){
            cardType = 1;
            System.out.println(cardType + " - Linda Belcher");
        }
        else if(getID == tinaID || getID == tinaID2){
            cardType = 2;
            System.out.println(cardType + " - Tina Belcher");
        }
        else if(getID == geneID || getID == geneID2){
            cardType = 3;
            System.out.println(cardType + " - Gene Belcher");
        }
        else if(getID == bobID || getID == bobID2){
            cardType = 4;
            System.out.println(cardType + " - Bob Belcher");
        }
        else if(getID == tammyID || getID == tammyID2){
            cardType = 5;
            System.out.println(cardType + " - Tammy");
        }
        else if(getID == zekeID || getID == zekeID2){
            cardType = 6;
            System.out.println(cardType + " - Zeke");
        }
        else if(getID == teddyID || getID == teddyID2){
            cardType = 7;
            System.out.println(cardType + " - Teddy");
        }
        System.out.println();

        return cardType;
    }
}
