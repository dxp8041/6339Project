<%-- 
    Document   : Login
    Created on : Apr 6, 2015, 9:39:53 PM
    Author     : deepak
--%>

<%@page import="java.io.File"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="BusinessObjects.FeedMessage"%>
<%@page import="BusinessObjects.Feed"%>
<%@page import="BusinessObjects.RssFeedParser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
      <jsp:include page="header3.jsp"/>   

    
          <!--  <img src="css/images/admin.jpg" alt="UTA Tower" class="img-responsive" />-->
          
<!-- Main contents-->


<%
   String s="http://www.amazon.com/rss/tag/hip%20hop/new?length=100&tag=bumperartcom-20";
    String s2="https://www.facebook.com/feeds/notifications.php?id=574075437&viewer=574075437&key=AWjfI9BJLfFxLHP-&format=rss20";
    
		ServletContext servletContext = getServletContext();
		String contextPath = servletContext.getContextPath();		
                String[] pure=contextPath.split("/");
                
  //  String context=k.getContextPath();
    //out.print(context);
     RssFeedParser parser = new RssFeedParser("https://www.facebook.com/feeds/notifications.php?id=574075437&viewer=574075437&key=AWjfI9BJLfFxLHP-&format=rss20");
        Feed feed = parser.readFeed();
        int x=0;
         out.print("<div class=\"section page-content\">");
         out.print("<div class=\"container\">");
             
         out.print(" <div class=\"row\">");
         out.print(" <div class=\"col-sm-3\">");
         out.print("<h3 style=\"margin-top:0;\">"+"Facebook Notifactions"
                    + "</h3> </hr>");
        for (FeedMessage message : feed.getMessages()) {
            
           
           
            out.print("<h4 style=\"margin-top:0;\">"+message.getDescription()
                    + "</h4> </hr>");
            out.print("<br>");
            out.print("<a href="+message.getLink()+">Click Here</a>");
                
           
           
            
           
            out.println("<br>");
            out.println("<br>");
            
            
            
            
           
        }
        out.print("</div>");
        out.print(" <div class=\"col-sm-6\">");
         RssFeedParser parser2 = new RssFeedParser("http://www.npr.org/rss/rss.php?id=1045");
        Feed feed2 = parser2.readFeed();
        for (FeedMessage message : feed2.getMessages()) {
            
           out.print("<h4 style=\"margin-top:0;\">"+message.getAuthor()
                    + "</h4> </hr>");
            out.print("<br>");
            out.print("<a href="+message.getLink()+">"+message.getDescription()+"</a>");
            out.print("<br>");
               
            out.print(message.getImage());
           
            
            
            
           
        }
        
        
        
        
        
        out.print("</div>");
        
        out.print(" <div class=\"col-sm-3\">");
        for (FeedMessage message : feed2.getMessages()) {
            
           
            
           // out.print("<h4 style=\"margin-top:0;\">"+message.getTitle()
             //       + "</h4> </hr>");
            out.print("<h4 style=\"margin-top:0;\">"+message.getDescription()
                    + "</h4> </hr>");
            out.print("<br>");
           // out.print("<a href="+message.getLink()+">Click Here</a>");
                
           
           
            
           
            out.println("<br>");
            out.println("<br>");
            
            
            
            
           
        }
          out.print("</div></div></div>");
%>

  
           
                
                   










<!-- End of Main Contents -->
          
          
            

              
               

          
        </div>
      </div>  
    </div>
    



    <br><br><br><br><br><br><br>

    <div class="section footer">
      <div class="container">
        <div class="row">
          <div class="col-sm-3 footer-section">
            <h4>Helpful Links</h4>
            <hr />
            <ul>
              <li><a href="#" title="UTA Home Page">Admin Home Page</a></li>
              <li><a href="#" title="College of Engineering">Add Domains</a></li>
              <li><a href="#" title="CSE Advising">Add Rss</a></li>
            </ul>
          </div>

          <div class="col-sm-3 footer-section">
            <h4></h4>
            <hr />
            <p>
              
            </p>
          </div>
        </div>
      </div>  
    </div>

    <div class="section container copyright">
      <small>Copyright &copy; 2015 - All Rights Reserved - Cable Tv Ads</small>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>