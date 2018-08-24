package com.example.rss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.rss.domain.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Long>{

}