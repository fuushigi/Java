public class Precedence {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
/*
First, the ! Boolean operator in !(false) returns true.
Second, true && false evaluates to false.
Finally, the remaining expression true || false evaluates to true. 
*/

	boolean riddle = !( 1 < 8 && (5 > 2 || 3 < 5));
	System.out.println(riddle);
    
    System.out.println( !(false) || true && false);

	}
}