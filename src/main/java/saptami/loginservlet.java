package saptami;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "loginservlet", value="/login")
public class loginservlet extends HttpServlet {
  //  Map<String, User> hmap;

    public void init() {
       // hmap = new HashMap<>();
        //User user1 = new User();
       // user1.setPassword("123");
       // hmap.put("9003031164", user1);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").include(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String phonenumber = request.getParameter("phonenumber");
        String password = request.getParameter("password");

        // Write logic to validate
        User user = hmap.get(phonenumber);
        if (user != null) {
        	if(user.getPasswordHash().equals(password)) {
        		request.getRequestDispatcher("/welcome.jsp").include(request, response);
        	}
        	else {
        		request.getRequestDispatcher("/login.jsp").include(request, response);
        	}
            // Successful login
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            String encodedURL = response.encodeRedirectURL("welcome.jsp");
            response.sendRedirect(encodedURL);
            // Redirect to a welcome page
        } else {
            // Invalid credentials, show error message
            String errorMessage = "Invalid phone number or password";
            request.setAttribute("errorMessage", errorMessage);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
 







