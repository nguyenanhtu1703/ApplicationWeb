<%@ page language="java" import="java.util.*, java.text.*, java.io.*" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<html>
    <head><title>Hello World</title></head>
    <body>

    <%! int x = 10000;
    	class Z {
    		static final int x = 100;
    	};  %>
	<%
	out.println("okay" + Z.x); %>	   
   <p> Today's date: <%= new java.util.Date().toLocaleString() %> </p>
   Hello World!<br/>
   <%
       out.println("Your IP address is " + request.getRemoteAddr());
   %>
   
   <% int day = 3; float z = 1; double p = 1; boolean tmp = false; Boolean o = new Boolean(true); %> 
   
   <% if (day == 1 || day == 7) { %>
   		<p> Today is weekend </p>
   <% } else { %>
   		<p> Today is not weekend </p>
   <% } %>
   
   
	<% for (int fontSize = 1; fontSize <= 3; fontSize++) { %>
		<font color="green" size = "<%=fontSize%>">
		JSP tutorial
		</font><br>
	<%}%>
	
	<%! Cookie cook = new Cookie("123", "123"); %>
	
	<% out.println(request.getParameter("name") == null); %>
	
   <jsp:include page = "/index.html" flush = "true" />

 <% response.setHeader("Refresh", "1"); %>
   
   <p> <%= request.getParameter("first_name") %> </p>
   
   <p> <%= request.getParameter("lastname_name") %> </p>
   
   <p> <%= request.getCookies() %></p>
   
   <%-- this is a JSP comment --%>

	<% Date da = new Date(); %>
	
	<% SimpleDateFormat date = new SimpleDateFormat(); 
		 %>
	
	<p> <%= da.toString() + " " + date.toString() %>
	
	<% Integer hitCounter = (Integer)application.getAttribute("HitCounter"); 
	if (hitCounter == null || hitCounter == 0)
		hitCounter = 1;
	else 
		hitCounter++;
	%>
	
	<p> <%= hitCounter %> </p>
	
	<% application.setAttribute("HitCounter", hitCounter); %>
	
	<h2>Auto Refresh Header Example</h2>
         <%
            // Set refresh, autoload time as 5 seconds
            response.setHeader("Refresh", "1");
            
            // Get current time
            Calendar calendar = new GregorianCalendar();
            String am_pm;
            
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            
            if(calendar.get(Calendar.AM_PM) == 0)
               am_pm = "AM";
            else
               am_pm = "PM";
            String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
            out.println("Crrent Time: " + CT + "\n");
         %>
   </body>
</html>
</body>
</html>