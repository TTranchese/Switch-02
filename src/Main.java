import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> stringList = new ArrayList<>();
		String string = "";
		while (true) {
			System.out.println("Insert string: ");
			string = scanner.next();
			switch (string) {
				case "size":
					System.out.println(stringList.size());
					break;
				case "clear":
					stringList.clear();
					break;
				case "print":
					System.out.println(stringList);
					break;
				default:
					stringList.add(string);
					break;
			}
		}
	}
}