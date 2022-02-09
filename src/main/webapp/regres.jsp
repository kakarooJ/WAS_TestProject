<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html"; charset="UTF-8">
<title> general request</title>
</head>
<body>
	<form action="forward", method="get">
		리턴값: <%=request.getAttribute("result1") %> <br>
		이름: <input type="text" name="name"/> <br>
		나이: <input type="text" name="age"/>
		<input type="submit" value="포워드 요청" />
	</form>
	
	<form action="redirect", method="get">
		리턴값: <%=request.getAttribute("result2") %> <br>
		이름: <input type="text" name="name"/> <br>
		나이: <input type="text" name="age"/>
		<input type="submit" value="리디렉트 요청" />
	</form>

</body>
</html>