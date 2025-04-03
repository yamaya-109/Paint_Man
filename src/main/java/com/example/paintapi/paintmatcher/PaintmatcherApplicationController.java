package com.example.paintapi.paintmatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paint")
public class PaintmatcherApplicationController {

	public static void main(String[] args) {
		SpringApplication.run(PaintmatcherApplicationController.class, args);
	}
	
	 @GetMapping(value="/")
	 public String index() {
	   return "アクセス成功です";
	}
	@GetMapping("/add/{name}/{type}/{category}/{red}/{green}/{blue}")
	public String addPaint(
	        @PathVariable String name,
	        @PathVariable String type,
	        @PathVariable String category,
	        @PathVariable int red,
	        @PathVariable int green,
	        @PathVariable int blue
	    )
	{
	        // ここで paint エンティティを生成して DB に保存など
	        return "登録成功: " + name + " [" + red + "," + green + "," + blue + "]";
	    }
}
