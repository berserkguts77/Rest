package com.ost.restapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	// @Controller 였다면 view를 연결해야 한다.
	// @RestController 이니까 외부에서 함수처럼 처리할 수 있는 함수가 있어야 한다.
	
	@GetMapping("/list")
	public List<Board> boardList(){
		return null;
	}
	
	@PostMapping("/add")
	public int addBoard(@RequestBody Board board) {
		return 0;		
	}
	
	@PostMapping("/modifyById")
	public int modifyBoard(@RequestBody Board board) {
		return 0;
	}
	
	@GetMapping("/remove")
	public int removeBoard(@RequestBody int[] ck) {
		return 0;
	}
	
	
}
