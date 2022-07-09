package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.items.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer>{

}
