package com.member.lib.service;

import java.util.List;
import java.util.Map;

public interface LentService {

	Map<String, Object> doInsertLent(Map<String,Object> lent);
	Map<String, Object> doUpdateLent(Map<String,Object> lent);
	Map<String, Object> doDeleteLent(int lNum);
	List<Map<String,Object>> doSelectLentList(Map<String,Object> lent);
	Map<String,Object> doSelectLent(int lNum);
	List<Map<String, Object>> selectNoLentbookList();
}
