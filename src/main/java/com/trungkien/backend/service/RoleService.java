package com.trungkien.backend.service;

import com.trungkien.backend.entity.Role;
import com.trungkien.backend.ultilities.ERole;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(ERole name);
}
