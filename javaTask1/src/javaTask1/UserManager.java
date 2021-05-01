package javaTask1;

public class UserManager {

	public void login(User user) {

		switch (user.getUserType()) {
		case "Öðrenci":
			System.out.println("Öðrenci: " + user.getName() + " baþarýyla giriþ yapýldý.");
			break;
		case "Öðretmen":
			System.out.println("Öðretmen: " + user.getName() + " baþarýyla giriþ yapýldý.");
			break;
		default:

		}
	}
}
