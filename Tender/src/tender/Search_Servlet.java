import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Search_Servlet extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String cname=request.getParameter("name");  
 
          
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:8080:contractors","meghna","meghna");  
              
PreparedStatement ps=con.prepareStatement("select * from contractors where name=cname");  
ps.setString(1,cname);  
 
  
ResultSet rs=ps.executeQuery();  
              
ResultSetMetaData rsmd=rs.getMetaData();  
  
  
while(rs.next())  
{  
    
out.print("Name :"+rs.getString(0));
out.print("ID :"+rs.getInt(1));
out.print("Experience :"+rs.getInt(2));
out.print("Projects :"+rs.getInt(2));
out.print("Time :"+rs.getString(3));
 
                  
}  
  

}catch (Exception e2) {e2.printStackTrace();}  
          
finally{out.close();}  
  
}  
}  