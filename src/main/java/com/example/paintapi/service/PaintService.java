package com.example.paintapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.paintapi.dto.PaintDto;
import com.example.paintapi.paint.Paint;
import com.example.paintapi.repository.PaintRepository;

@Service
public class PaintService {
    
    private final PaintRepository paintRepository;
    
    public PaintService(PaintRepository paintRepository) {
        this.paintRepository =paintRepository;
        // TODO 自動生成されたコンストラクター・スタブ
    }

    
    //追加
    public Paint add(PaintDto dto)
    {
        Paint paint = new Paint();
        paint.setName(dto.GetName());
        paint.setType(dto.GetType());
        paint.setCategory(dto.GetCatefory());
        paint.setRed(dto.GetRed());
        paint.setGreen(dto.GetGreen());
        paint.setBlue(dto.GetBlue());
        paint.setAmount(dto.GetAmoount());
        
        return paintRepository.save(paint);
    }
    
    public List<Paint> SearchByname(String name)
    {
        return paintRepository.findByName(name);
    }
    
    public  List<Paint> SearchByCategory(String category)
    {
        return paintRepository.findByCategory(category);        
    }
    public List<Paint> searchSimilarColor(int r,int g,int b,int margin)
    {
        return paintRepository.findByRedBetweenAndGreenBetweenAndBlueBetween(
        Math.max(0,r-margin),Math.min(255,r+margin),
        Math.max(0,g-margin),Math.min(255, g+margin),
        Math.max(0,b-margin),Math.min(255, b+margin)
                );
    }
    public List<Paint> getAllPaints()
    {
        return paintRepository.findAll();
    }
    
}