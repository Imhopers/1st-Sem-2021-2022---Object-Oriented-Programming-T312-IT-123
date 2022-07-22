import java.util.Scanner;
public class degrees {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		int revolutions=3000;
		int degrees=360;
		int second=60;
		int rotate;
		
		rotate=revolutions*degrees/second;

		

		System.out.println("it rotates "+rotate+" degree in every seconds");
		
		

		scanner.close();
	}
}