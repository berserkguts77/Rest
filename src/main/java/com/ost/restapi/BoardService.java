package com.ost.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	public List<Board> selectBoardList() {
		
		return boardMapper.selectBoardList();
	}
	
	public int addBoard(Board board) {
		
		return boardMapper.insertBoard(board);
	}
	
	public int removeBoard(int[] ck) {
		
		return boardMapper.deleteBoard(ck);
	}
	
	public int modifyBoard(Board board) {
		
		return boardMapper.updateBoard(board);
	}
	
}
