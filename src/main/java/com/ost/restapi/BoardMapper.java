package com.ost.restapi;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BoardMapper {
	// DB로부터 리스트를 가져오기
	List<Board> selectBoardList();
	
	// DB에 화면에서 입력 받은 값으로 행하나 추가하는 메서드
	int insertBoard(Board board);
	
	//DB에 원하는 정보를 삭제, 체크박스에 선택된 여러개의 아이디를 한 번에 지운다.
	int deleteBoard(int[] ck);
	
	//DB에 화면에서 입력 받은 값을 수정 하기
	int updateBoard(Board board);
}
