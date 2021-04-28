package inheritance;


public class CustomerManager {
	public void Add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	public void AddMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			Add(customer);
		}
	}
}
