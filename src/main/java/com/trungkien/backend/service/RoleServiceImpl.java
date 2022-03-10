package com.trungkien.backend.service;

import com.trungkien.backend.entity.Role;
import com.trungkien.backend.repository.RoleRepository;
import com.trungkien.backend.ultilities.ERole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Optional<Role> findByName(ERole name) {
        return roleRepository.findByName(name);
    }
}
