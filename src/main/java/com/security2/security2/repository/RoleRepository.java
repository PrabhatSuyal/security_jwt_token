package com.security2.security2.repository;

import java.util.Optional;

import com.security2.security2.models.ERole;
import com.security2.security2.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
