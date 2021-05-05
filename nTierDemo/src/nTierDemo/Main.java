package nTierDemo;

import nTierDemo.business.abstracts.ProductService;
import nTierDemo.business.concretes.ProductManager;
import nTierDemo.core.JLoggerManagerAdapter;
import nTierDemo.dataAccess.concretes.AbcProductDao;
import nTierDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productManager = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1, 2, "Elma",12,50);

		productManager.add(product);
	}

}
