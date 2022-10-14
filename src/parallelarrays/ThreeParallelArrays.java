package parallelarrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ThreeParallelArrays{

	public static void main(String[] args) {
		String states[] = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		String statesAbbreviation[] = {"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		String capitals[] = {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"};
	    int track = 1;
	
	    while(track == 1) {
	        String userState, stateAbb, capital;
	        int index = -1;
	        Scanner userInput = new Scanner(System.in);
	        System.out.println("Please enter state name: ");
	        userState = userInput.next();
	        
	        for (int i = 0; i < states.length; i++ ){
	            if(states[i].equals(userState) == true){
	                index = i;
	                break;
	            }
	            if(states[i].equals(userState) == false){
	                track = 0;
	            }
	        }
	        if(index != -1) {
	            stateAbb = statesAbbreviation[index];
	            capital = capitals[index];
	            System.out.println("The state is "+ stateAbb + ". And the capital is "+ capital+".");
	            System.out.println("Please enter the zipcode for the capital: ");
	            String zipCode = userInput.next();
	            String capzip = capital + " " + zipCode;
	            Array.set(capitals, index, capzip);
	            capital = capitals [index];
	            System.out.println(capital);
	        }
	        
	    }
	    
	    
	}
}
