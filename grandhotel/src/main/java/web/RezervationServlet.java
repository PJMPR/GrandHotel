package web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.joda.time.DateTime;

import rezervations.Guest;
import rezervations.Rezervation; 
import grandhotel.Room;
@WebServlet(urlPatterns = "/addRezervation")
public class RezervationServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		Rezervation rezervation = new Rezervation(); 
		Room pokoj = new Room(); 
		int startDay = Integer.parseInt(request.getParameter("start_day"));
		int startMonth = Integer.parseInt(request.getParameter("start_month"));
		int startYear = Integer.parseInt(request.getParameter("start_year"));
		DateTime start = new DateTime(startDay, startMonth, startYear,0,0);
		
		int endDay = Integer.parseInt(request.getParameter("start_day"));
		int endMonth = Integer.parseInt(request.getParameter("start_month"));
		int endYear = Integer.parseInt(request.getParameter("start_year"));
		DateTime end = new DateTime(endDay, endMonth, endYear,0,0);
		
		rezervation.setStart(start);
		rezervation.setEnd(end);
		int dni; 
		rezervation.setCena_p(pokoj.getCena()); 
		dni=rezervation.pobyt(start, end); 
		int naleznosc; 
		naleznosc=rezervation.zaplata(dni, pokoj.getCena());
		rezervation.setNaleznosc(naleznosc); 
		
		rezervation.setGosc((Guest) request.getSession().getAttribute(SessionKey.guest));
		rezervation.setPokoj((Room) request.getSession().getAttribute(SessionKey.room));
		rezervation.setNumer(request.getParameter("numer_rezerwacji"));
		HttpSession session = request.getSession();
		session.setAttribute(SessionKey.guest, rezervation);
		session.setAttribute(SessionKey.room, rezervation);
		session.setAttribute(SessionKey.rezervation, rezervation); 
		resp.sendRedirect("/text.html");
	}

}
