package com.axsosacademy.axsosplatform.repositories;

import com.axsosacademy.axsosplatform.models.Role;
import com.axsosacademy.axsosplatform.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findAll();

    String findRoleByUser(User user);
}
