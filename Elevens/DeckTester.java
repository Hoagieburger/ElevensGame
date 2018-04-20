/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main() {
        String[] standardRanks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] standardSuits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int[] standardPointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] halfRanks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven"};
        String[] halfSuits = {"Hearts", "Spades"};
        int[] halfPointValue = {1, 2, 3, 4, 5, 6, 7};
        Deck standard = new Deck(standardRanks, standardSuits, standardPointValue);
        Deck half = new Deck(halfRanks, halfSuits, halfPointValue);
        Deck mixed = new Deck(standardRanks, halfSuits, standardPointValue);
        System.out.println("STANDARD 52 PLAYING CARD DECK:\n    isEmpty():\n        Expected: false\n        Returned: " + standard.isEmpty() + "\n    size():\n        Expected: 52\n        Returned: " + standard.size() + "\n    deal():\n        Expected: ");
    }
}