package com.example.rss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.rss.domain.Contents;

@Repository
public interface ContentsRepository extends JpaRepository<Contents, Long>{

}