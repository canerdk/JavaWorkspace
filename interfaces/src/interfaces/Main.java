package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};

		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer customer = new Customer(1, "Caner", "Demirkaya");

		customerManager.add(customer);
	}

}
