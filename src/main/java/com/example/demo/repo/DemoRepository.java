package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Detail;

public interface DemoRepository extends JpaRepository<Detail, Integer> {

}
