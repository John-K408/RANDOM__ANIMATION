public class CardTest {
    public static void main(String[] args) {
        Card a = new Card((int) (Math.random() * 4), (int) (Math.random() * 13));
        System.out.println("a: " + a);

        Card b = new Card(a.getSuit(), a.getRank());

        System.out.print("a is ");
        if ( a != b)
            System.out.print("not ");
        System.out.println("the same as b.");

        // STOP READING HERE (ONLY FOR A BIT)

        Card c;
        c = new Card((int) (Math.random() * 4), (int) (Math.random() * 13));
        System.out.println("c: " + c);

        System.out.print("a is ");
        if (! a.equals(c))
            System.out.print("not ");
        System.out.println("the same as c.");

        System.out.print("a is ");
        int comparison = a.compareTo(c);
        if (comparison == -1) {
            System.out.print("less than ");
        } else if (comparison == 1) {
            System.out.print("greater than ");
        } else {
            System.out.print("the same as ");
        }
        System.out.println("c.");
    }
}
