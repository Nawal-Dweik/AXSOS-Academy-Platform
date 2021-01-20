package com.axsosacademy.axsosplatform.repositories;

import com.axsosacademy.axsosplatform.models.Topic;
import com.axsosacademy.axsosplatform.models.User;
import org.apache.logging.log4j.message.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserMessageRepository extends CrudRepository<User, Long> {

}
