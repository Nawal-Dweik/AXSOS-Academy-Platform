package com.axsosacademy.axsosplatform.services;

import com.axsosacademy.axsosplatform.repositories.CategoryRepository;
import com.axsosacademy.axsosplatform.repositories.GroupActivityRepository;
import org.springframework.stereotype.Service;

@Service
public class GroupActivityService {
    private final GroupActivityRepository groupActivityRepository;

    public GroupActivityService(GroupActivityRepository groupActivityRepository) {
        this.groupActivityRepository = groupActivityRepository;
    }
}
