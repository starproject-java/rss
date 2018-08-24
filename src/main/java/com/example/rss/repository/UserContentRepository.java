package com.example.rss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.rss.domain.UserContent;

@Repository
public interface UserContentRepository extends JpaRepository<UserContent, Long>{
}
