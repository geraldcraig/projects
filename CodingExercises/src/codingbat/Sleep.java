/**
 * 
 */
package codingbat;

/*The parameter weekday is true if it is a weekday,
 * and the parameter vacation is true
 * if we are on vacation.
 * We sleep in if it is not a weekday or
 * we're on vacation.
 * Return true if we sleepin.
 * 
 * Sleepin (false, false) - true
 * Sleepin (true, false) - false
 * Sleepin (false, true) - true
 */

/**
 * @author geraldcraig
 *
 */
public class Sleep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Sleep sleep = new Sleep();
		boolean outcome1 = sleep.sleepIn(false, false);
		boolean outcome2 = sleep.sleepIn(true, false);
		boolean outcome3 = sleep.sleepIn(false, true);
		System.out.println("Result 1 is: " + outcome1);
		System.out.println("Result 2 is: " + outcome2);
		System.out.println("Result 3 is: " + outcome3);	

	}
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		

		if(!weekday || vacation) {
			return true;
		}
		return false;
}

}
