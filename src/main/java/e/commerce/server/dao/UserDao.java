package e.commerce.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import e.commerce.server.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
