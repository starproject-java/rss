package com.example.rss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.rss.domain.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}