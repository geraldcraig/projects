/**
 * 
 */
package codingbat;


/**
 * @author geraldcraig
 *
 */
public class Nth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Nth nth = new Nth();
		String outcome1 = nth.everyNth("Miracle", 2);
		String outcome2 = nth.everyNth("abcdefg", 2);
		String outcome3 = nth.everyNth("abcdefg", 3);
		
		System.out.println(outcome1);
		System.out.println(outcome2);
		System.out.println(outcome3);
		
		
	}
	
	public String everyNth(String str, int n) {
	 
	String result = "";
	  
	  for (int i=0; i<str.length(); i = i + n) {
	    result = result + str.charAt(i);
	  }
	  return result;

	}

}
