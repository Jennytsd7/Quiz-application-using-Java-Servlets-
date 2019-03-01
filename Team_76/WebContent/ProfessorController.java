package Team76.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Team76.Entity.QuestionEntity;
import Team76.Utilities.DetailsModel;
import Team76.Utilities.QuestionModel;
import Team76.Utilities.ViewGradesModel;

/**
 * Servlet implementation class ProfessorController
 */
@WebServlet("/ProfessorController")
public class ProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	QuestionModel quiz = new QuestionModel();
	QuestionEntity entity = new QuestionEntity();
	DetailsModel q = new DetailsModel(); // object of quiz class used for calling fetch method
	ViewGradesModel vc = new ViewGradesModel();

	public ProfessorController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
		String action = request.getParameter("action");

		if (action.equals("ProfessorDash")) {
			response.sendRedirect("ProfessorDash.jsp");
		}
		if (action.equals("ViewGrades")) {
			try {
				vc.getParameters(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("ViewGrades.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null || action.isEmpty()) {
			response.sendRedirect("Login.jsp");
		}
		if (action.equals("CreateQuiz")) {
			response.sendRedirect("CreateQuiz.jsp");
		}
		if (action.equals("ViewGrades")) {
			response.sendRedirect("ViewGrades.jsp");
		}
		if (action.equals("Statistics")) {
			response.sendRedirect("Statistics.jsp");
		}
		if (action.equals("Continue")) {
			try {
				quiz.getParameters(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("Questions.jsp");
		}

		if (action.equals("Submit")) {
			try {
				quiz.getParameters(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("ProfessorDash.jsp");
		}
		if (action.equals("Continue1")) { 
			try {
				q.getParameters(request, response);       
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("Questions.jsp");
		}

		if (action.equals("Cancel")) {
			response.sendRedirect("ProfessorDash.jsp");
		}
		
		if (action.equals("Logout")) {
			response.sendRedirect("ProfessorDash.jsp");
		}
		

	}

}
