package servlet;

import dao.UsersDAO;
import entity.Users;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/updateusers")
public class UsersUpdateServlet extends HttpServlet {

    private UsersDAO usersDAO=new UsersDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        String id=req.getParameter("id");
        String nickname=req.getParameter("nickname");
        String age=req.getParameter("age");
        String gender=req.getParameter("gender");
        String email=req.getParameter("email");
        String phone=req.getParameter("phone");
        String remark=req.getParameter("remark");

        Users user=new Users(Integer.parseInt(id),nickname,Integer.parseInt(age),gender,email,phone,new Date(),remark);

        usersDAO.updateUser(user);

        resp.sendRedirect("/detail?id="+user.getId());
    }
}
