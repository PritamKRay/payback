<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMI</title>
<!-- CSS for the button and text on the page -->
<style>
.btn {
	background: #3498db;
	background-image: -webkit-linear-gradient(top, #3498db, #2980b9);
	background-image: -moz-linear-gradient(top, #3498db, #2980b9);
	background-image: -ms-linear-gradient(top, #3498db, #2980b9);
	background-image: -o-linear-gradient(top, #3498db, #2980b9);
	background-image: linear-gradient(to bottom, #3498db, #2980b9);
	-webkit-border-radius: 28;
	-moz-border-radius: 28;
	border-radius: 28px;
	font-family: Arial;
	color: #ffffff;
	font-size: 20px;
	padding: 10px 20px 10px 20px;
	text-decoration: none;
	margin-left: 10px;
	margin-top: 20px;
}

.btn:hover {
	background: #3cb0fd;
	background-image: -webkit-linear-gradient(top, #3cb0fd, #3498db);
	background-image: -moz-linear-gradient(top, #3cb0fd, #3498db);
	background-image: -ms-linear-gradient(top, #3cb0fd, #3498db);
	background-image: -o-linear-gradient(top, #3cb0fd, #3498db);
	background-image: linear-gradient(to bottom, #3cb0fd, #3498db);
	text-decoration: none;
}

td {
	text-shadow: 2px 2px 2px rgba(150, 150, 150, 1);
	font-size: 30px;
	font-family: Arial;
}
</style>
</head>
<body>

	<c:choose>
		<c:when test="${!empty loan}">

			<div id="table" align="center">
				<table class="table table-bordered table-hover"
					style="background-color: #ffffff">

					<tr>
						<td>Loan Amount</td>
						<td>${loan.loanAmount}</td>
					</tr>
					<tr>
						<td>Duration</td>
						<td>${loan.duration}</td>
					</tr>
					<tr>
						<td>Payback Scheme</td>
						<td>${loan.paybackScheme}</td>
					</tr>
					<tr>
						<td>EMI</td>
						<td>Rs. ${loan.emi}</td>
					</tr>
					<tr>
						<td colspan="2" align="center"><button class="btn"
								type="button" onclick="goBack()" id="carloan">Go Back</button></td>
					</tr>
				</table>
				<div style="height: 100px"></div>
			</div>
		</c:when>
	</c:choose>
</body>
<script>
	function goBack() {
		window.history.back()
	}
</script>