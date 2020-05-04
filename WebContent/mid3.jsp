<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String s1 = request.getParameter("radiotext"); 
if (s1 == null) s1 = "one"; %>
<form method="mi2.jsp">
        <input type = "radio" name = "radiotext" value = "one"checked="checked">one
        <input type = "radio" name = "radiotext" value = "two">two
        <input type = "radio" name = "radiotext" value = "three">three</br>
        
        <div> 
        <select name="s1"> 
        <option <%= "one".equals(s1) ? "selected" : "" %>>one</option> 
        <option <%= "two".equals(s1) ? "selected" : "" %>>two</option> 
        <option <%= "three".equals(s1) ? "selected" : "" %>>three</option> </select> 
        </div>        
                
                <input type = "submit" value ="ok">
                
                
                
    </form>
    
    
    
    
    
</body>
</html>