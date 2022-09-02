package at04;

public class ex06 {

	public static void main(String[] args) {
		for (int i = 1; i < 51; i++) {
		System.out.println(i % 2 == 1 ? i : "");
		}
		for (int i = 1; i < 51; i++) {
		System.out.print(i % 2 == 1 ? i : " | ");
		}
	}
}
