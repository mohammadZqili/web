<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

	<div id="wrapper">
		<div id="header"></div>
		<div>
			<input type="button" onclick="window.location.href='add';return false;" value="Add customer"/>
		</div>
		<div id="container">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>


				</tr>

				<c:forEach var="tempCustomer" items="${customers}">
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
					</tr>
				</c:forEach>


			</table>

		</div>


	</div>


</body>

</html>









