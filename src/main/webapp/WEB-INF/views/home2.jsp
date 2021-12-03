<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<style>
  table {
    width: 100%;
    border: 1px solid #444444;
  }
  th, td {
    border: 1px solid #444444;
  }
</style>
<body>
	<table>
		<thead>
			<tr>
				<th>회원번호</th>
				<th>이름</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>핸드폰</th>
				<th>주소</th>
				<th>이메일</th>
				<th>가입날짜</th>
				<th>수정날짜</th>
				<th>상태번호</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${user}" var="users">
				<tr>
					<td>${users.user_num}</td>
					<td>${users.user_name}</td>
					<td>${users.user_id}</td>
					<td>${users.user_pwd}</td>
					<td>${users.user_phone}</td>
					<td>${users.user_address}</td>
					<td>${users.user_email}</td>
					<td>${users.enroll_date}</td>
					<td>${users.modify_date}</td>
					<td>${users.ustatus}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>