package nTierDemo.dataAccess.concretes;

import java.util.List;

import nTierDemo.dataAccess.abstracts.ProductDao;
import nTierDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi " + product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("Hibernate ile güncellendi " + product.getName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("Hibernate ile silindi " + product.getName());
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
