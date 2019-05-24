   <head>
      <title>Displaying tender data</title>
   </head>
   
   <body>
      <h1>Tender details</h1>
      
      <ul>
         <li><p><b>Name:</b>
            <%=request.getParameter("name")%>
         </p></li>
         <li><p><b>Type:</b>
            <%= System.out.println(request.getParameter("type"))%>
         </p></li>
         <li><p><b>Budget:</b>
            <%= System.out.println(request.getParameter("budget"))%>
         </p></li>
         <li><p><b>Place:</b>
            <%= System.out.println(request.getParameter("place"))%>
         <li><p><b>Timeline:</b>
            <%= System.out.println(request.getParameter("time"))%>
         </p></li>
         </p></li>
      </ul>
   
   </body>
</html>