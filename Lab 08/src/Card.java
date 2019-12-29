public class Card {
    public static final String[] suits = {"clubs", "diamonds", "spades", "hearts"};
    public static final String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    private final int suit;
    private final int rank;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int compareTo(Card other) {
        if (suit < other.suit)
            return -1;
        if (suit > other.suit)
            return 1;
        if (rank < other.rank)
            return -1;
        if (rank > other.rank)
            return 1;
        return 0;
    }

    public boolean equals(Card other) {
        return suit == other.suit && rank == other.rank;
    }

    public String toString() {
        return ranks[rank] + " of " + suits[suit];
    }
}
