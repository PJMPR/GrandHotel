package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.joda.time.DateTime;

import rezervations.Guest;
import rezervations.Rezervation;

public class RezervationServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		Rezervation rezervation = new Rezervation();
		int startDay = Integer.parseInt(request.getParameter("start_day"));
		int startMonth = Integer.parseInt(request.getParameter("start_month"));
		int startYear = Integer.parseInt(request.getParameter("start_year"));
		DateTime start = new DateTime(startDay, startMonth, startYear,0,0);
		rezervation.setStart(start);
		rezervation.setGosc((Guest) request.getSession().getAttribute(SessionKey.guest));
		rezervation.setSurname(request.getParameter("surname"));
		rezervation.setAdres(request.getParameter("adres"));
		rezervation.setCard(request.getParameter("card"));
		rezervation.setPhone(request.getParameter("phone"));
		rezervation.setEmail(request.getParameter("email"));
		HttpSession session = request.getSession();
		session.setAttribute(SessionKey.guest, rezervation)
	}

}
