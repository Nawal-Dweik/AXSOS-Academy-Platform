package com.axsosacademy.axsosplatform.repositories;

import com.axsosacademy.axsosplatform.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
