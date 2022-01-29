package com.example.myserver.repository;

import com.example.myserver.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long > {
}
