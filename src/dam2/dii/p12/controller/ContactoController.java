package dam2.dii.p12.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dam2.dii.p12.dao.ContactoDAOImplMem;
import dam2.dii.p12.model.Contacto;
import dam2.dii.p12.service.ContactoService;

@WebServlet("")
public class ContactoController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("controlador: get");

		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("controlador: post");

		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String comments = request.getParameter("comments");

		if (name.isEmpty() || surname.isEmpty() || email.isEmpty() || phone.isEmpty() || comments.isEmpty()) {

			if (name.isEmpty()) {

				name = null;
			}

			else if (surname.isEmpty()) {

				surname = null;
			}

			else if (email.isEmpty()) {

				email = null;
			}

			else if (phone.isEmpty()) {

				phone = null;
			}

			else if (comments.isEmpty()) {

				comments = null;
			}

			request.setAttribute("mensaje", "NO PUEDE HABER CAMPOS VACIOS");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

		else {

			Contacto con = new Contacto(name, surname, email, phone, comments);

			con.setName(name);
			con.setSurname(surname);
			con.setEmail(email);
			con.setPhone(phone);
			con.setComments(comments);

			ContactoService servicio = new ContactoService();

			if (servicio.compruebaExiste(con) == true) {

				request.setAttribute("mensaje", "YA EXISTE UN USUARIO CON ESOS DATOS.");
				request.getRequestDispatcher("index.jsp").forward(request, response);

			}

			else {

				servicio.agregarAgenda(con);
				request.setAttribute("mensaje", "ALTA CORRECTA");
				request.setAttribute("array", ContactoDAOImplMem.agenda);

				// variante de ejercicio 6
				request.getRequestDispatcher("index.jsp").forward(request, response);

				// variante de ejercicio 5
				// request.getRequestDispatcher("index2.jsp").forward(request, response);

			}

		}

	}
}
