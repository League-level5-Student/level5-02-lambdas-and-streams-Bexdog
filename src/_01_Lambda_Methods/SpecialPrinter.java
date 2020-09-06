package _01_Lambda_Methods;

public interface SpecialPrinter {
	public default void printSpecial(String s) {
			for(int i = 0; i < 10; i++) {
				System.out.println(s.charAt(i));
			}
	}
}
