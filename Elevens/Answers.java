/**
 * Write a description of class Answers here.
 *
 * @author Joshua Hergenroeder
 * @version 1
 */
import java.lang.Math;
public class Answers
{
    /* ACTIVITY 2
     * 1) A deck is a group/list of cards.
     * 2) The deck will contain 6 cards.
     * 3) ranks: Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
     *    suits: spades, hearts, diamonds, clubs
     *    pointValue: 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11
     * 4) The order of ranks and pointValues has to line up to each other so that the correct card will have the correct value. The order of suits does not matter.
     * 
     */
    
    // ACTIVITY 3
    // 1)
    public static String flip(){
        int flip = (int)(Math.random() * 3);
        if (flip < 2){
            return "heads";
        }
        return "tails";
    }
    // 2)
    public static boolean arePermutations(int[] one, int[] two){
        int[] alpha = new int[one.length], bravo = new int[two.length];
        for (int i = 0; i < alpha.length; i++){
            alpha[i] = one[i];
        }
        for (int i = 0; i < bravo.length; i++){
            bravo[i] = two[i];
        }
        alpha = bubbleSort(alpha);
        bravo = bubbleSort(bravo);
        if (alpha.equals(bravo)){
            return true;
        }
        return false;
    }
    // 3) 3,2,1
    
    
    /////////////////////////////////////////////////////////////////////////
    // Misc
    public static void bubbleSort(int[] list){ // Work smarter not harder
        for (int i = list.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (list[j] > list[j + 1]){
                    int holder = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = holder;
                }
            }
        }
    }
}