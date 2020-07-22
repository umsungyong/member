package com.member.lib.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.LentDAO;
import com.member.lib.dao.impl.LentDAOImpl;
import com.member.lib.service.LentService;


public class LentServiceImpl implements LentService {
	LentDAO lentDAO = new LentDAOImpl();

	@Override
	public Map<String, Object> doInsertLent(Map<String, Object> lent) {
		Map<String, Object> rMap = new HashMap<>();
		int result = lentDAO.insertLent(lent);
		rMap.put("msg", (result == 1) ? "대여정보 입력 성공" : "대여정보 입력 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> doUpdateLent(Map<String, Object> lent) {
		Map<String, Object> rMap = new HashMap<>();
		int result = lentDAO.updateLent(lent);
		rMap.put("msg", (result == 1) ? "대여정보 수정 성공" : "대여정보 수정 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> doDeleteLent(int lNum) {
		Map<String, Object> rMap = new HashMap<>();
		int result = lentDAO.deleteLent(lNum);
		rMap.put("msg", (result == 1) ? "대여정보 삭제 성공" : "대여정보 삭제 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public List<Map<String, Object>> doSelectLentList(Map<String, Object> lent) {
		return lentDAO.selectLentList(lent);
	}

	@Override
	public Map<String, Object> doSelectLent(int lNum) {
		return lentDAO.selectLent(lNum);
	}

	public static void main(String[] args) {
//		LentService LentService = new LentServiceImpl();
//
//		Map<String,Object> rMap = LentService.doDeleteLent(61);
//		System.out.println(rMap); 

//		Map<String, Object> rMap = new HashMap<>();
//		rMap.put("m_num", 24);
//		rMap.put("b_num", 81);
//		Map<String,Object> map = LentService.doInsertLent(rMap);
//		System.out.println(map);
		
//		rMap.put("l_num", 61);
//		System.out.println(LentService.doUpdateLent(rMap));

//		List<Map<String,Object>> mList = new ArrayList<>();
//		mList = LentService.doSelectLentList(rMap);
//		for(Map<String,Object> mem:mList) {
//			System.out.println(mem);
	
//		}

//		Map<String, Object> map = LentService.doSelectLent(61);
//		System.out.println(map);

	}

	@Override
	public List<Map<String, Object>> selectNoLentbookList() {
		// TODO Auto-generated method stub
		return lentDAO.selectNoLentbookList();
	}
}
