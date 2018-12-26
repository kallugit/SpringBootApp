package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Engine;

import lombok.Synchronized;

@Repository
public interface EngineRepository extends JpaRepository<Engine, Integer>{
}
