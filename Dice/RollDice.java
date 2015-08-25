/*
* NAME:
*
*
* Who did you help?
*
*
* How?
*
*
* Who helped you?
*
*
* How?
*
*
*/

/*
* NOTE:  Only place code in the class constructor and methods:
* RollDice, set, getSum, roll, results
*/
import java.util.*;

public class RollDice{
   
   /*
   * Attribute: An array to hold 
   */
   private Integer[] stats;
   
   /*
   * Attribute to hold an instance of a pair of dice
   */
   private Dice Pair;
   
   //create a private variable to hold the sum for the set method
   private int sum;
   
   /*
   * Constructor:  Initialize the object
   * Specifically initialze the stats and Pair attributes
   */
   
   	
   public RollDice(){

   }
   
   /*
   * Perform the action of rolling a the pair of dice
   */
   public void set(){
	   Random rand = new Random();
	   
	   int die1 = rand.nextInt(6) + 1;
	   int die2 = rand.nextInt(6) + 1;
	   
	   sum = die1+die2;
	   
	   
	   
   }
   
   /*
   * Return the sum of the pair of dice
   */
   public Integer getSum(){

	   return sum; 
   }
   
   /*
   * Rolls the object's pair of dice the prescribed number
   * of times and records the results in the stats array
   */
   public void roll(Integer Num){

      }      
   
   
   /*
   * return the stats array.
   */
   public Integer[] results(){
	return stats;

   }   

}