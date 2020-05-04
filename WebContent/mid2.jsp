<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

      <%  int result=0;
String s1= request.getParameter("radiotext");
if(s1==null){
	s1="one";
	
}

%>
<form method="get">
        <input type = "radio" name = "radiotext" value = "one" checked="checked">one
        <input type = "radio" name = "radiotext" value = "two">two
        <input type = "radio" name = "radiotext" value = "three">three</br>
        <input type="text" name="s1" value="<%=s1 %>"/>
                <input type = "submit" value ="ok">
    </form>




</body>
</html>