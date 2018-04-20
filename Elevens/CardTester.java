/**
 * This is a class that tests the Card class.
 */
public class CardTester {
    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main() {
        Card AceOfSpades = new Card("Ace", "Spades", 1);
        Card KingOfClubs = new Card("King", "Clubs", 13);
        Card AceOfSpades2 = new Card("Ace", "Spades", 1);
        System.out.println("ACE OF SPADES:\n    rank():\n        Expected: Ace\n        Returned: " + AceOfSpades.rank() + "\n    suit():\n        Expected: Spades\n        Returned: " + AceOfSpades.suit() + "\n    pointValue():\n        Expected: 1\n        Returned: " + AceOfSpades.pointValue() + "\n    matches(KingOfClubs):\n        Expected: false\n        Returned: " + AceOfSpades.matches(KingOfClubs) + "\n    matches(AceOfSpades2):\n        Expected: true\n        Returned: " + AceOfSpades.matches(AceOfSpades2));
        System.out.println("KING OF CLUBS:\n    rank():\n        Expected: King\n        Returned: " + KingOfClubs.rank() + "\n    suit():\n        Expected: Clubs\n        Returned: " + KingOfClubs.suit() + "\n    pointValue():\n        Expected: 13\n        Returned: " + KingOfClubs.pointValue() + "\n    matches(AceOfSpades):\n        Expected: false\n        Returned: " + KingOfClubs.matches(AceOfSpades) + "\n    matches(AceOfSpades2):\n        Expected: false\n        Returned: " + AceOfSpades.matches(AceOfSpades2));
        System.out.println("ACE OF SPADES 2:\n    rank():\n        Expected: Ace\n        Returned: " + AceOfSpades2.rank() + "\n    suit():\n        Expected: Spades\n        Returned: " + AceOfSpades2.suit() + "\n    pointValue():\n        Expected: 1\n        Returned: " + AceOfSpades2.pointValue() + "\n    matches(KingOfClubs):\n        Expected: false\n        Returned: " + AceOfSpades2.matches(KingOfClubs) + "\n    matches(AceOfSpades):\n        Expected: true\n        Returned: " + AceOfSpades2.matches(AceOfSpades2));
    }
}