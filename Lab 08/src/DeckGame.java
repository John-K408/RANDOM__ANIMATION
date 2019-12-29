public class DeckGame {
    public static void main(String[] args) {
        //In this game, you can input the number of players which should be between 2 and 8 inclusive.
        //Each player receive can receive any number of cards as long as there are enough cards for each of them.
        //There are no community cards in this game.
        /*RULES OF THE GAME
        -In this game, we assume that the higher the index of a suit, the higher the value of the suit(The value starts
        from 1).
        - The same can be said of the rank.
        - However, the value of a suit is 5 times as much as the value of a rank in the same index.
        -The value of a card is determined by adding the value of the rank and suit.
        -Egs: If you get the rules stated above, then you'll realize that a 2 of diamonds has a value of 12 whereas a 3 of clubs
         has a value of 8.
        - The sum of the values of the  cards in a hand determines the value of the hand.
        - The hand with the highest value wins the game.
        - If two hands end up having the same value, the card with the highest suit score wins.
         */
        if (args.length != 2) {
            System.err.println("Please input only two arguments.");
            System.exit(1);
        }

        int numPlayers = Integer.parseInt(args[0]);
        int numCards = Integer.parseInt(args[1]);

        if (numPlayers < 2 || numPlayers > 8) {
            System.err.print("Invalid number of players. Number of Players should be from 2 to 8.");
            System.exit(1);
        }
        if (numCards * numPlayers > 52) {
            System.err.println("Not enough cards for each Player. Reduce number of players or the number of cards per player");
            System.exit(1);
        } else {
            //Create deck
            Deck A = new Deck();
            //Shuffle deck
            A.shuffle();
            //Create an array called numHands that stores each of the hands and make them take 6 cards each from the deck except the last which takes in 4 cards.
            Hand[] numHands = new Hand[numPlayers];
            for (int hIndex = 0; hIndex < numPlayers; hIndex++) {
                numHands[hIndex] = A.getHand(numCards);
            }
            //Print all Hands
            for (int a = 0; a < numHands.length; a++) {
                System.out.println("Player" + (a + 1) + ": " + numHands[a]);
            }


        /*RULES FOR WINNER:
        As you are running through one hand, add the rank and suit index of each card and store the result as the value of the card.
        Do this for all hands and store the value of the hands in an array.
        Now compare the values in the array and bring out the highest value.
         */


            // Player Winner = highestIndex + 1.
            int highestIndex = getWinner(numCards, numPlayers, numHands);
            int Winner = highestIndex + 1;
            System.out.print("Player " + Winner + " wins.");


        }


    }


    public static int getWinner(int numCards, int numPlayers, Hand[] numHands) {
        //Computes scores of each and puts in an array.
        //Sum of ranks and suits in hand all hands stored in an array.
        int[] finArray = new int[numPlayers];
        // k is the number of hands as n is the number of cards.
        for (int k = 0; k < numPlayers; k++) {
            int InVal = 0;
            for (int n = 0; n < numCards; n++) {
                //Sum of suits and ranks of the cards on each hand.
                InVal = InVal + 5 * ((numHands[k].getCard(n).getSuit()) + 1) + (numHands[k].getCard(n).getRank() + 1);
                //Sum of suits of the cards on each hand.


            }
            System.out.println("Player " + (k + 1) + " :" + InVal);
            finArray[k] = InVal;
        }
        //Code that identifies the index of the hand with the highest value.
        int highestIndex = 0;
        for (int NextIndex = 1; NextIndex < numPlayers; NextIndex++) {
            if (finArray[highestIndex] > finArray[NextIndex]) {
                highestIndex = highestIndex;
            }
            else if (finArray[highestIndex] < finArray[NextIndex]) {
                highestIndex = NextIndex;
            }
            else if (finArray[highestIndex] == finArray[NextIndex]) {
                int[] eqArray = new int[2];
                for (int k = highestIndex; k < highestIndex + 2; k++) {
                    int InVal = 0;
                    for (int n = 0; n < numCards; n++) {
                        //Sum of suits and ranks of the cards on each hand.
                        InVal = InVal + 5 * ((numHands[k].getCard(n).getSuit()) + 1);

                    }
                    eqArray[k- highestIndex] = InVal;
                }
                if (eqArray[0] > eqArray[1]) {
                    highestIndex = highestIndex;
                }
                else if (eqArray[0] < eqArray[1]) {
                    highestIndex = NextIndex;
                }
            }


        }
        return highestIndex;

    }
}
