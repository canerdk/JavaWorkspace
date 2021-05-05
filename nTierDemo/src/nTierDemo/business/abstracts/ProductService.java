package nTierDemo.business.abstracts;

import java.util.List;

import nTierDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
