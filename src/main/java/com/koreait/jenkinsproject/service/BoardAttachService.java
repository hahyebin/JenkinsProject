package com.koreait.jenkinsproject.service;

import org.springframework.stereotype.Service;

import com.koreait.jenkinsproject.domain.BoardAttach;

@Service
public interface BoardAttachService {
	
	// 게시글 등록
	public int addBoardAttach(BoardAttach boardAttach);
}
