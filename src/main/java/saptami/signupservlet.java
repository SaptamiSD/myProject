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

@WebServlet(name = "signupservlet", value="/signup")
public class signupservlet extends HttpServlet {
    //Map<String, User> hmap;

    public void init() {
     //   hmap = new HashMap<>();
       // User user1 = new User();
       // user1.setPassword("123");
      //  hmap.put("9003031164", user1);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/signup.jsp").include(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       
        String LoginName = request.getParameter("Login Name");
        String phonenumber = request.getParameter("phonenumber");
        String Password = request.getParameter("Password");
        String ReTypepassword = request.getParameter("ReType password");	
        String BankAccount = request.getParameter("Bank Account");
    }
}

	


