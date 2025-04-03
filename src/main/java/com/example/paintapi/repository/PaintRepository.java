package com.example.paintapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paintapi.paint.Paint;

public interface PaintRepository extends JpaRepository<Paint, Long> 
{
    List<Paint> findNameContaining(String keyword);

    List<Paint> findByCategory(String category);
    List<Paint> findByName(String category);
    
    List<Paint> findByRedBetweenAndGreenBetweenAndBlueBetween(
            int redStart, int redEnd,
            int greenStart, int greenEnd,
            int blueStart, int blueEnd
        );
}