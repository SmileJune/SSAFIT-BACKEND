package com.ssafy.ssafit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Video;
import com.ssafy.ssafit.model.service.VideoServiceImpl;

@RestController
@RequestMapping("/api")
public class ApiVideoController {
	
	@Autowired
	private VideoServiceImpl videoService;

	
	@GetMapping("video/list")
	public List<Video> list(){
		return videoService.getVideoList();
	}
	
	@GetMapping("video/{id}")
	public Video listOne(@PathVariable int id) {
		return videoService.getVideo(id);
	}
}
