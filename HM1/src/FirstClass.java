import java.util.Scanner;

public class FirstClass {
	Scanner scanner;

	/**
	 *
	 * @param scanner Input scanner
	 */
	public FirstClass(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public FirstClass() {
		this.scanner = new Scanner(System.in);
	}
	
	public void run() {
		String name = setData("Введите имя: ");
		String age_str = setData("Введите возраст");
		int age = 0;
		try {
			age = Integer.parseInt(age_str);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		Decorator.helloUser(name, age);
		
	}
	
	public String setData(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}
	
	
}
