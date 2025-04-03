package com.example.paintapi.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.paintapi.dto.PaintDto;
import com.example.paintapi.paint.Paint;
import com.example.paintapi.service.PaintService;

@RestController
@RequestMapping("/api/paint")
public class PaintController
{
    private final PaintService paintService;
    
    public PaintController(PaintService paintService) {
        this.paintService = paintService;
    }
    @PostMapping("/add")
    public Paint addPaint(@RequestBody PaintDto paintDto)     {
        return paintService.add(paintDto);
    }
    
    @GetMapping("/similar")
    public List<Paint> searchSimilarColor(
        @RequestParam int r,
        @RequestParam int g,
        @RequestParam int b,
        @RequestParam(defaultValue = "30") int margin
    ) {
        return paintService.searchSimilarColor(r, g, b, margin);
    }

    @GetMapping("/all")
    public List<Paint> GetAllPaints()
    {
        return paintService.getAllPaints();
    }
}