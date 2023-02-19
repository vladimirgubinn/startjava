public class MyFirstApp {
	public static void main(String[] args) {
		
		int result = 1;
		for (int i = 2; i <= 5; i++) {
			result = result + i;
			if(result % 2 == 0) {
            	System.out.println("Число " + result + " является четным");
        	} else {
            	System.out.println("Число " + result + " является нечетным");
		}
	}
		System.out.println("1 + 2 + 3 + 4 + 5 = 55ada" + result);

	}
}