package e.commerce.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import e.commerce.server.dao.ProductDao;
import e.commerce.server.entity.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;
	
	public Product addNewProduct(Product product) {
		return productDao.save(product);
	}

}
