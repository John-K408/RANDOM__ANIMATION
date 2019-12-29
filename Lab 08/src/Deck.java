public class Deck {
   public Card[] deckElements = new Card[52];
   int topOfDeck = 0;

   public Deck(){
       int Index = 0;
       for(int suit = 0; suit < 4; suit++)
           for(int rank = 0; rank < 13; rank++){
               deckElements[Index]= new Card(suit,rank);
               Index++;
           }

   }

   public void shuffle(){
       for (int i = 51; i > 0 ; i --){
           int j = (int)(Math.random()*(i+1));
           Card a = deckElements[i];
           deckElements[i] =deckElements[j];
           deckElements[j] = a;

       }
   }
   public Hand getHand(int n){
       // n is the number of cards to get from the deck and give to each hand.
     Hand toReturn = new Hand(n);
     for(int i = 0; i < n; i ++){
         toReturn.addCard(deckElements[i+topOfDeck]);
     }
     topOfDeck = topOfDeck + n;
     return toReturn;
   }
   public int size(){
     return 52 - topOfDeck;

   }

}


