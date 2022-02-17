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

        req.setAttribute("name",nam);

        if(SQLDatabase.checking(nam,pas))
        {
            RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
            rd.forward(req,res);
        }
        else
        {
            out.println("<html><body style='background-color:red'>");
            out.println("<h2 style='color:white'>");
            out.println("UserName Or Password Is Incorrect");
            out.println("Try Again");
            out.println("</h2>");
            out.println("</body></html>");
            RequestDispatcher rd=req.getRequestDispatcher("index.html");
            rd.include(req,res);
        }
    }
}
