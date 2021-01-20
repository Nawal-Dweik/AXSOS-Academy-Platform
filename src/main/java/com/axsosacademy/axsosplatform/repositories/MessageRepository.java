package com.axsosacademy.axsosplatform.repositories;

import com.axsosacademy.axsosplatform.models.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findAll();

}
