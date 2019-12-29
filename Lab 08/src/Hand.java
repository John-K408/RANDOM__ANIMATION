public class Hand {
    private Card[] HandCards;
    int cTracker;

    public Hand(int n) {
        //n is the number of cards in each  hand.
        HandCards = new Card[n];
        cTracker = 0;
    }

    public void addCard(Card c){
       if(cTracker < HandCards.length){
           HandCards[cTracker] = c;
       }
       else{
           System.err.print("The Hand Is Full.");
           System.exit(1);
       }
        cTracker++;
        }
        public int Size(){
        return cTracker;
        }
        public int Capacity(){
        return (6 - cTracker);
        }
    public String toString(){
        String a = "";
        for(int i = 0; i < HandCards.length; i++){
            a = a + HandCards[i].toString()+", ";
        }
        return a;

    }
    public Card getCard(int i){
        return HandCards[i];
    }

}
