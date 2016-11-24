public class Ternary {
	public static void main(String[] args) {
		
		int fuelLevel = 3;
    int pointsScored = 21;

		char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
		System.out.println(canDrive);
    
    char gameResult = (pointsScored > 20) ? 'W' : 'L';
System.out.println(gameResult);

	}
}