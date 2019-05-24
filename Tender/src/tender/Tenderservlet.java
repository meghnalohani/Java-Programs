
package tender;
// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Tenderservlet extends HttpServlet {

   // Method to handle GET method request.
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Using GET Method to Read Form Data";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
         
      out.println(docType +
         "<html>\n" +
            "<head><title>" + Tender data + "</title></head>\n" +
             +"<body>"+
                  "Name"+ request.getParameter("name") + "\n" +
                  "Type"+  request.getParameter("type") + "\n" +
                    "Budget"+ request.getParameter("budget") + "\n" +
                    "Place"+ request.getParameter("place") + "\n" +
                    "Timeline"+ request.getParameter("time") + "\n" +
                  
                  
               
            "</body>"
         "</html>"
      );
   }

   // Method to handle POST method request.
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      doGet(request, response);
   }
}