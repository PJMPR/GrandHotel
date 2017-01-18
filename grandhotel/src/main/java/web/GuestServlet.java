package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import rezervations.Guest;

@WebServlet("/addGuest")
public class GuestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Guest guest = new Guest();
		guest.setName(request.getParameter("name"));
		guest.setSurname(request.getParameter("surname"));
		guest.setAdres(request.getParameter("adres"));
		guest.setCard(request.getParameter("card"));
		guest.setPhone(request.getParameter("phone"));
		guest.setEmail(request.getParameter("email"));
		HttpSession session = request.getSession();
		session.setAttribute(SessionKey.guest, guest);
		response.sendRedirect("/addRezervation.html");
		
	}

}
