package com.axsosacademy.axsosplatform.repositories;

import com.axsosacademy.axsosplatform.models.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, Long> {
    List<Topic> findAll();

}
