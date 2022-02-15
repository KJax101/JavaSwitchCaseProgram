package Q14SwitchCase;

public class Main {

		public static void main(String[] args) {
			Main.invokeCase(1);
			Main.invokeCase(2);
			Main.invokeCase(3);
		}

		public static void invokeCase(int condition) {
			int a = 100;
			
			switch (condition) {
			case 1: 
			System.out.println(Math.sqrt(a));
			
			break;
			
			case 2:
			System.out.println(java.time.LocalDateTime.now());
			
			break;
			
			case 3:
			String b = "Java";
			String[] arrOfStr = b.split(" ");
			System.out.println(arrOfStr.toString());
			
			break;
			
	  }
	  }
	}