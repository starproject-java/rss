package com.example.rss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.rss.domain.Chats;

@Repository
public interface ChatsRepository extends JpaRepository<Chats, Long>{

}