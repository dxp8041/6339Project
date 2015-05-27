<%-- 
    Document   : Message
    Created on : May 20, 2015, 10:17:27 PM
    Author     : deepak
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <jsp:include page="header3.jsp"/> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Message</title>
</head>

<body>
    <div class="section page-content">
      <div class="container">
        <div class="row">
          <div class="col-sm-8">
    <center>
        <h3><%=request.getAttribute("Message")%></h3>
    </center>
          </div>
        </div>
      </div>
    </div>
    
</body>
<jsp:include page="footer2.jsp"/> 
</html>