package com.axsosacademy.axsosplatform.services;


import com.axsosacademy.axsosplatform.repositories.RoleRepository;

public class RoleService {
    private final RoleRepository roleRepository;


    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }



}
