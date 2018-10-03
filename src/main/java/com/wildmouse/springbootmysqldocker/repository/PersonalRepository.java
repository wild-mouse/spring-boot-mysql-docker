package com.wildmouse.springbootmysqldocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildmouse.springbootmysqldocker.entity.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Long> {
}
