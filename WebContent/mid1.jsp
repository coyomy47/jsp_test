<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    table { border-collapse: collapse; }
    td { padding: 5px; border: solid 1px gray; }
</style>

</head>
<body>
<%
int result=0;
String s1= request.getParameter("form1");
if(s1==null){
	s1="0";
	
}
result=Integer.parseInt(s1);

%>

<form method="get">
	<input type="text" name="form1" value="<%= result %>"/>
	<button type "submit" value="+">단</button>
<table>
<% for (int i=1; i <= 9; ++i) { %> 
  <tr>
	<td> <%=result%> X <%=i%> = <%=i*result%></td>

  </tr>
  <% } %>
</table>


	


</body>
</html>