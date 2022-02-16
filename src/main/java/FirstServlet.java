import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class FirstServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();

        String nam=req.getParameter("name");
        String pas=req.getParameter("pass");
        if(SQLDatabase.checking(nam,pas))
        {
            out.println("Welcome:"+nam);
        }
        else
        {
            out.println("UserName And Password Is Wrong");
        }
    }
}
