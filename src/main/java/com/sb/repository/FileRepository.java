package com.sb.repository;

import com.sb.entity.Files;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<Files,String> {
}
