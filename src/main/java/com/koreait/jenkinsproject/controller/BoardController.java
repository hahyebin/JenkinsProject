package com.koreait.jenkinsproject.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.koreait.jenkinsproject.service.BoardService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BoardController {

	private BoardService boardService;
	
	// 삽입 : boards    + POST
	// 이미지 삽입
	@PostMapping(value="api/boards", produces = "application/json; charset=UTF-8")
	public Map<String, Object> addBoard(MultipartHttpServletRequest multipartRequest){
  	  return	boardService.addBoard(multipartRequest);
	}
	
	
	
	
	
	
	
}
