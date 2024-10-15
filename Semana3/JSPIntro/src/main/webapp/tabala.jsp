<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border =1><%
for(int i = 0 ;i<=10 ;i++){
	out.println("<tr>");
	for(int j = 1 ;j<=10 ;j++){
		
		if(j == 10){
			out.println("<td>"+i +""+ 0+"</td>");
		}
		if(i == 10){
			out.println("<td>"+j +""+ 0+"</td>");
		}
	 else{
		out.println("<td>"+i +""+ j+"</td>");
		}
	}
	out.println("</tr>");
}
%>
</table>
 

</body>
</html>