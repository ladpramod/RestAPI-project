package com.info.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.entity.StudentData;

public interface StudentRepo extends JpaRepository<StudentData, Long>{

}
