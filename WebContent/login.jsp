<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录页面</title>
  </head>
  
  <body>
	<form action="userServlet" method="post">
		<table>
			<tr>
				<td colspan="2">登录窗口</td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username" value="admin"/>
				</td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" value="123"/>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="登录" />
				</td>
			</tr>
			<tr>
			<td>
			<a  target="_blank" href="downLoadServlet?dt=zq"><span >下载</span></a>
			</td>
			</tr>
		</table>
	</form>
</body>
</html>
