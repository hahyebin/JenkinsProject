package com.koreait.jenkinsproject.repository;

import org.springframework.stereotype.Repository;

import com.koreait.jenkinsproject.domain.BoardAttach;

@Repository
public interface BoardAttachRepository {

	
	// 게시글 이미지 등록
	public int insertBoardAttach(BoardAttach boardAttach);
	
}
