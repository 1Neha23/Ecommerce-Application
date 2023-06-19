package e.commerce.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import e.commerce.server.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
