package com.example.chatserver.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.chatserver.model.ChatMessage;
import com.example.chatserver.model.ChatRoom;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ChatRepository extends JpaRepository<ChatRoom, Long> {

    @Override
    List<ChatRoom> findAll();

    List<ChatRoom> findByRoomId(String roomId);

    long deleteByRoomId(String roomId);

}