package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import org.sprinngframework.stereotype.Repository;

import com.example.demo.entity.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository  <StudentEntity,Integer>{


}