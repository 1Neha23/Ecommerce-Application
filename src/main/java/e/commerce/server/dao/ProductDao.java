package e.commerce.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import e.commerce.server.entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product,Integer>{

}
