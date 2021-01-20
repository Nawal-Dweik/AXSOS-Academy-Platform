package com.axsosacademy.axsosplatform.services;

import com.axsosacademy.axsosplatform.repositories.CategoryRepository;
import com.axsosacademy.axsosplatform.repositories.GroupActivityRepository;

public class GroupActivityService {
    private final GroupActivityRepository groupActivityRepository;

    public GroupActivityService(GroupActivityRepository groupActivityRepository) {
        this.groupActivityRepository = groupActivityRepository;
    }
}
