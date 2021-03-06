package pers.java.jstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jstl
 */
@WebServlet("/jstl")
public class Jstl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jstl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List list = new ArrayList();
		list.add(new Company("��Ѷ","www.tencent.com"));
		list.add(new Company("�ٶ�","www.baidu.com"));
		list.add(new Company("Ľ����","www.imooc.com"));
		Set set = new HashSet();
		set.add("May");
		set.add("March");
		set.add("January");
		set.add("February");
		set.add("April");
		request.setAttribute("week", set);
		request.setAttribute("score", 58);
		request.setAttribute("grade", "B");
		request.setAttribute("company", list);
		request.getRequestDispatcher("/core.jsp").forward(request, response);
	}

}
