package com.member.lib.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.BookDAO;
import com.member.lib.dao.impl.BookDAOImpl;
import com.member.lib.service.BookService;

public class BookServiceImpl implements BookService {
	private BookDAO bookDAO = new BookDAOImpl();

	@Override
	public Map<String, Object> insertBook(Map<String, Object> book) {
		Map<String, Object> rMap = new HashMap<>();
		int result = bookDAO.insertBook(book);
		rMap.put("msg", (result == 1) ? "도서입력 성공~" : "도서입력 실패");
		rMap.put("cnt", result);

		return rMap;
		
	}

	@Override
	public Map<String, Object> updateBook(Map<String, Object> book) {
		Map<String, Object> rMap = new HashMap<>();
		int result = bookDAO.updateBook(book);
		rMap.put("msg", (result == 1) ? "도서 업데이트 성공~ " : "도서 업데이트 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> deleteBook(int bNum) {
		Map<String, Object> rMap = new HashMap<>();
		int result = bookDAO.deleteBook(bNum);
		rMap .put("msg", (result == 1) ? "도서 삭제 성공": "도서 삭제 실패");
		rMap. put("cnt", result);
		return rMap;
	}

	@Override
	public List<Map<String, Object>> selectBookList(Map<String, Object> book) {
		return bookDAO.selectBookList(book);
	}

	@Override
	public Map<String, Object> selectBook(int bNum) {
		return bookDAO.selectBook(bNum);
	}

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		Map<String, Object> rMap = bookService.deleteBook(82);
//		System.out.println(rMap);
		Map<String, Object> map = new HashMap<>();
		map.put("b_num", 61  );
		map.put("b_title", "컴퓨터컴퓨터");
		map.put("b_eser", "견본");
		map.put("b_desc", "시");
//	    System.out.println(bookService.insertBook(map));
		rMap = bookService.updateBook(map);
		System.out.println(rMap);
       
	}
}
