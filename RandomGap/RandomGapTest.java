import java.util.*;
/*
Andrew Plaza
Who did you help?


How did you help them?


Who helped you?


How did they help you


*/

public class RandomGapTest {

   private Integer range;

   private Integer[] Uniform;

   
// Add attribute(s) to collect gap test data

   ArrayList<Integer> Gap;
   
   /*
   * RandomGapTest Constructor
   */
   public RandomGapTest(Integer range){
      this.range = range;
      Gap = new ArrayList<Integer>();
      for(int i = 0; i < range; i++){
    	  Gap.add(i, 0);
    	  System.out.println("This is the range" + i);
      }
      
   }

   public void RunTest(Integer Num){
	   
	   
	  /// for (int repeat = 0; repeat < Num; repeat++){
	   
	   ArrayList<Integer> testArray = new ArrayList<Integer>();
	      
	   	  Random rand = new Random();
	      for (int i=0; i< range; i++){
	    	  testArray.add(rand.nextInt(range));
	    	  System.out.println("And this is the testArray" + i);
	      }
	   //this is to loop through range abstractly
	   for (int i = 0; i < Gap.size(); i++){
		   
		   System.out.println("This is gap size" + Gap.size());
		   int gapcount = 0;
		   //this loops through the range to see if any gaps occur. This should measure frequency of gaps
		   for(int j =0; j < testArray.size(); j++ ){
	 		  
	    		  if (testArray.get(i) == j){
	    			  gapcount++;
	    		  }
	    		
	    	  }
		   
		   Gap.add(i, Gap.get(i)+gapcount);
		    
	    	  
	      }
  // }
}
   public ArrayList<Integer> GetGapData(){
      return this.Gap;
   }

   



}
