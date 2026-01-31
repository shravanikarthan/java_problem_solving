package ps;

public class BusPassEligibility {
	    // Non-static method
	    boolean isEligible(boolean Female ) {
	        if (Female) {
	            return true;
	        }  
	        else {
	        return false;
	        }
	    }

	    public static void main(String[] args) {

	        // Creating object to call non-static method
	        BusPassEligibility obj = new BusPassEligibility();
	        boolean isFemale = true;

	        boolean result = obj.isEligible(isFemale);

	        if (result) {
	            System.out.println("Eligible  free bus "
	            		+ "pass for Female");
	        } else {
	            System.out.println("Not eligible  free bus"
	            		+ " pass for Male");
	        }
	    }
	}
