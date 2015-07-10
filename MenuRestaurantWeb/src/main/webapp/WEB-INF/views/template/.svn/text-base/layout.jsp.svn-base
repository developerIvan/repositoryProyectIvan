<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ include file="/WEB-INF/views/libraries.jsp"  %>
  <c:set value=" <%=request.getContextPath() %>" var="context" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
response.addHeader("Cache-Control", "max-age = 0, s-maxage = 0,must-revalidate, proxy-revalidate, no-cache, no-store ");
response.addHeader("Pragma", "no-cache");

%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/stylesheet.css" rel="stylesheet" type="text/css"/>
<title>Restaurante</title>
</head>
<body>
   <!-- Encabezado -->
  <tiles:insertAttribute name="header" />
  
  
  <!-- side bar -->
 <!--   <tiles:insertAttribute name="sidebar" />-->
  
  <section>
     <tiles:insertAttribute name="body" />  
  </section>
  
  <!-- footer -->
  <tiles:insertAttribute name="footer" />
</body>
</html>