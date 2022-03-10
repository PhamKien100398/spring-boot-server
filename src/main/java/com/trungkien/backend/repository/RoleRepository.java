package com.trungkien.backend.repository;

import com.trungkien.backend.entity.Role;
import com.trungkien.backend.ultilities.ERole;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
