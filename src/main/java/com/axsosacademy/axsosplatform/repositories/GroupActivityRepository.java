package com.axsosacademy.axsosplatform.repositories;

import com.axsosacademy.axsosplatform.models.Algorithm;
import com.axsosacademy.axsosplatform.models.GroupActivity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupActivityRepository extends CrudRepository<GroupActivity, Long> {
    public List<GroupActivity> findAll();
}
