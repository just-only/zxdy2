<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>在线答疑系统 ——后台管理</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
		<link href="${ctx}/fkjava.ico" rel="shortcut icon" type="image/x-icon" />
		<link href="${ctx}/css/css.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
			 <tr><td height="10"></td></tr>
			 <tr>
			    <td width="15" height="32"><img src="${ctx}/images/main_locleft.gif" width="15" height="32"></td>
				<td class="main_locbg font2"><img src="${ctx}/images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：后台管理  &gt; 当前用户</td>
				<td width="15" height="32"><img src="${ctx}/images/main_locright.gif" width="15" height="32"></td>
			 </tr>
		</table>
		<table width="100%" height="90%" border="0" cellpadding="10" cellspacing="0" class="main_tabbor">
		  	<tr valign="top">
			    <td>
				  <table width="100%" border="0" cellpadding="0" cellspacing="10" class="main_tab">
				    <tr><td class="font3 fftd">名称：<font color="red" size="2">${sessionScope.user_session.uname}</font></td></tr>
				    <tr><td class="font3 fftd">邮箱：<font color="red" size="2">${sessionScope.user_session.uemail}</font></td></tr>
					<tr><td class="main_tdbor"></td></tr>
					<tr><td class="main_tdbor"></td></tr>
					<tr>
						<td class="font3 fftd">
							创建时间：<font color="red" size="2">
							<f:formatDate value="${sessionScope.user_session.uregdate}" 
								type="date" dateStyle="long"/>
								</font>
						</td>
					</tr>
					<tr>
						<td class="font3 fftd">
							最后登录时间：<font color="red" size="2">
							<f:formatDate value="${sessionScope.user_session.ulastlogin}" 
								type="date" dateStyle="long"/>
								</font>
						</td>
					</tr>
					<tr>
						<td class="font3 fftd">
							最近发表时间：<font color="red" size="2">
							<c:if test="${empty sessionScope.user_session.ulastemit}">
							  <a>无发表</a></c:if>
							<c:if test="${sessionScope.user_session.ulastemit!=null}">
							<f:formatDate value="${sessionScope.user_session.ulastemit}" 
								type="date" dateStyle="long"/></c:if>
								</font>
						</td>
					</tr>
					<tr>
						<td class="font3 fftd">
							发表权限：<font color="red" size="2">
							<c:if test="${sessionScope.user_session.upermit==1}">
							     <a>是</a></c:if>
							<c:if test="${sessionScope.user_session.upermit!=1}">
							    　<a>否</a></c:if>
							</font>
						</td>
					</tr>
				  </table>
				</td>
		  	</tr>
		</table>
		<div style="height:10px;"></div>
	</body>
</html>