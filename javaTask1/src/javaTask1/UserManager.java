package javaTask1;

public class UserManager {

	public void login(User user) {

		switch (user.getUserType()) {
		case "��renci":
			System.out.println("��renci: " + user.getName() + " ba�ar�yla giri� yap�ld�.");
			break;
		case "��retmen":
			System.out.println("��retmen: " + user.getName() + " ba�ar�yla giri� yap�ld�.");
			break;
		default:

		}
	}
}
