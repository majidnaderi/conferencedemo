package com.example.conference.respositories;

import com.example.conference.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository  extends JpaRepository<Session,Long> {
}
