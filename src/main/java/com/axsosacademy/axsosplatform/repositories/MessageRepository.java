package com.axsosacademy.axsosplatform.repositories;

import org.apache.logging.log4j.message.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findAll();

}
