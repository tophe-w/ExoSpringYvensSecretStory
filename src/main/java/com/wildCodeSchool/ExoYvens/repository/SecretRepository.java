package com.wildCodeSchool.ExoYvens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wildCodeSchool.ExoYvens.entity.Secret;


public interface SecretRepository extends JpaRepository<Secret, Long> {
    
}
