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
		���ϰ�: <%=request.getAttribute("result1") %> <br>
		�̸�: <input type="text" name="name"/> <br>
		����: <input type="text" name="age"/>
		<input type="submit" value="������ ��û" />
	</form>
	
	<form action="redirect", method="get">
		���ϰ�: <%=request.getAttribute("result2") %> <br>
		�̸�: <input type="text" name="name"/> <br>
		����: <input type="text" name="age"/>
		<input type="submit" value="����Ʈ ��û" />
	</form>

</body>
</html>