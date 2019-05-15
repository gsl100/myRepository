package servlet;

import dao.UsersDAO;
import entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deluser")
public class UserDelServlet extends HttpServlet {
    private UsersDAO usersDAO=new UsersDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String type=req.getParameter("type");

        if("lock".equals(type)){
            //锁定操作
            Users user =new Users();
            user.setId(Integer.parseInt(id));
            user.setUserStatus(1);
            usersDAO.updateUser(user);
        }else if("del".equals(type)){
            //彻底删除
            usersDAO.delUsers(Integer.parseInt(id));
        }else if("unlock".equals(type)){
            //解锁
            Users user =new Users();
            user.setId(Integer.parseInt(id));
            user.setUserStatus(0);
            usersDAO.updateUser(user);
        }

        resp.sendRedirect("/index");
    }
}
