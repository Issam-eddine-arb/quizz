package com.quizz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizz.model.Level;

@Repository
public interface LevelDao extends JpaRepository<Level, Long>{

}
