package nTierDemo.dataAccess.concretes;

import java.util.List;

import nTierDemo.dataAccess.abstracts.ProductDao;
import nTierDemo.entities.concretes.Product;

public class AbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Abc ile eklendi " + product.getName());
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
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
