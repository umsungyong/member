package com.member.lib.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.lib.service.LentService;
import com.member.lib.service.Impl.LentServiceImpl;

public class LentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LentService LentService = new LentServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		if ("/lent/lent-insert".equals(uri)) {
			request.setAttribute("bookList", LentService.selectNoLentbookList());
			RequestDispatcher rd = request.getRequestDispatcher("/views/lent/lent-insert");
			rd.forward(request, response);

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		if ("/lent/lent-insert".equals(uri)) {
            String bNum = request.getParameter("b_num");
            String mNum = request.getParameter("m_num");
            Map<String, Object>lent = new HashMap<>();
            lent.put("b_num", bNum);
            lent.put("m_mun", mNum);
            LentService.doInsertLent(lent);
            System.out.println(bNum + ", " + mNum);
		}
	}
}
