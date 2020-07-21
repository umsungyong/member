package com.member.lib.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.common.Connector;
import com.member.lib.dao.BookDAO;

public class BookDAOImpl implements BookDAO {

	@Override
	public int insertBook(Map<String, Object> book) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "insert into book(b_num, b_title, b_eser, b_credat, b_desc)";
			sql += " values(seq_book_b_num.nextval, ?,?,sysdate,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, book.get("b_title").toString());
			ps.setString(2, book.get("b_eser").toString());
			ps.setString(3, book.get("b_desc").toString());
			result = ps.executeUpdate();
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int updateBook(Map<String, Object> book) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "update book";
			sql += " set b_title=?,";
			sql += " b_eser=?,";
			sql += " b_desc=?";
			sql += " where b_num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, book.get("b_title").toString());
			ps.setString(2, book.get("b_eser").toString());
			ps.setString(3, book.get("b_desc").toString());
			ps.setInt(4, (int)book.get("b_num"));
			result = ps.executeUpdate();
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int deleteBook(int bNum) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "delete from book where b_num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bNum);
			result = ps.executeUpdate();
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public List<Map<String, Object>> selectBookList(Map<String, Object> book) {
		List<Map<String, Object>> bookList = new ArrayList<Map<String, Object>>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Connector.open();
			String sql = "select b_num, b_title, b_eser, b_credat, b_desc from book";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("b_num", rs.getInt("b_num"));
				map.put("b_title", rs.getString("b_title"));
				map.put("b_eser", rs.getString("b_eser"));
				map.put("b_credat", rs.getString("b_credat"));
				map.put("b_desc", rs.getString("b_desc"));
				bookList.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bookList;
	}

	@Override
	public Map<String, Object> selectBook(int bNum) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Connector.open();
			String sql = "select b_num, b_title, b_eser, b_credat, b_desc from book where b_num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bNum);
			rs = ps.executeQuery();
			if (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("b_num", rs.getInt("b_num"));
				map.put("b_title", rs.getString("b_title"));
				map.put("b_eser", rs.getString("b_eser"));
				map.put("b_credat", rs.getString("b_credat"));
				map.put("b_desc", rs.getString("b_desc"));
				return map;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		BookDAO bdao = new BookDAOImpl();
		Map<String, Object> map = new HashMap<>();
		map.put("b_title", "자바의정석");
		map.put("b_eser", "남궁성");
		map.put("b_desc", "광고 오진다.");
		// bdao.insertBook(map);
//		List<Map<String, Object>> bookList = bdao.selectBookList(map);
//		System.out.println(bookList);
//		System.out.println(bdao.selectBook(21));
//		int result = bdao.deleteBook(1);
		map.put("b_num", 2);
		int result = bdao.updateBook(map);
		System.out.println("수정 갯수: " + result);
	}
}