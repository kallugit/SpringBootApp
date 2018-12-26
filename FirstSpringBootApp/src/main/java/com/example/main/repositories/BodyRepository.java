package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Body;

@Repository
public interface BodyRepository extends JpaRepository<Body,Integer>{

}
