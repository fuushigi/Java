public class IfElseIf {
	public static void main(String[] args) {

		int round = 6;
		int shoeSize = 10;


		if (round > 12) {

			System.out.println("The match is over!");

		} else if (round > 0) {

			System.out.println("The match is underway!");

		}	else {

			System.out.println("The boxing match hasn't started yet.");

		}
		
		if (shoeSize > 12) {
		    System.out.println("Sorry, your shoe size is currently not in stock.");
		} else if (shoeSize >= 6) {
		    System.out.println("Your shoe size is in stock!");
		} else {
		    System.out.println("Sorry, this store does not carry shoes smaller than a size 6.");
		}
  }
  
}
 