import java.util.ArrayList;
import java.util.Comparator;

public class FSJSGOrder implements Comparator<Student> {


	
	public int compare(Student left, Student right){
		
	   ArrayList<String> classOrder = new ArrayList();
		
		classOrder.add("Freshman");
		classOrder.add("Sophomore");
		classOrder.add("Junior");
		classOrder.add("Senior");
		classOrder.add("Graduate");
		
		
		if (left.getUnivClass().equals(right.getUnivClass())) return 0;
		
		else{
		for (int i = 0; i < 4; i++){
			if(left.getUnivClass().equals(classOrder.get(i))) return -1;
			else if (right.getUnivClass().equals(classOrder.get(i))) return +1;			
		  }
			assert false: "error occured("+ left.getUnivClass() +","+right.getUnivClass() +")";
		    return +1;
		}
		
		
		
	}
}
