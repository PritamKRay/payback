<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payback</title>
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
	font-size: 36px;
	padding: 10px 20px 10px 20px;
	text-decoration: none;
	margin-left: 10px
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

.text {
	text-shadow: 3px 3px 2px rgba(150, 150, 150, 1);
	font-size: 30px;
	font-family: Arial;
}

.fields {
	height: 50px;
	width: 300px;
	margin-top: 5px;
	margin-bottom: 15px;
}
</style>
</head>
<body>
	<div align="center">
		<h2 class="text">Calculate your Loan EMI</h2>
		<button class="btn" type="button" onclick="setLoanTypeCar()"
			id="carloan">Car loan</button>
		<button class="btn" type="button" onclick="setLoanTypeHouse()"
			id="houseloan">Housing loan</button>
		<button class="btn" type="button" onclick="setLoanTypeEducation()"
			id="educationloan">Education loan</button>

		<div id="formdiv" align="center"
			style="display: none; width: 780px; height: 500px; background: #0C79F5; margin-top: 10px">
			<form:form method="post" action="calculate" id="detailform"
				modelAttribute="loan">

				<form:input class="fields" type="hidden" path="loanType"
					name="loanType" />
				<form:label class="text" path="loanAmount">
					<spring:message code="label.amount" />
				</form:label>
				<br>
				<form:input class="fields" path="loanAmount" id="loanAmount" />
				<br>
				<form:label class="text" path="duration">
					<spring:message code="label.years" />
				</form:label>
				<br>
				<form:input class="fields" path="duration" id="duration" />
				<br>
				<form:label class="text" path="paybackScheme">
					<spring:message code="label.paybackscheme" />
				</form:label>
				<br>

				<form:select class="fields" path="paybackScheme" id="paybackScheme">
					<form:option value="RegularEmi" label="Regular EMI" />
					<form:option value="StepUpEmi" label="StepUp EMI" />
				</form:select>
				<br>
				<br>
				<button class="btn" type="submit" class="btn blue">Calculate
					EMI</button>
			</form:form>
		</div>
	</div>
</body>
<!-- Java script functions to set the loanType based on the button clicked by the user -->
<script>
	function setLoanTypeCar() {
		oFormObject = document.forms['detailform'];
		oFormObject.elements["loanType"].value = 'car';
		document.getElementById("formdiv").style.display = "block";
		document.getElementById("carloan").style.background = "#EE571B";
		document.getElementById("houseloan").style.background = "#3498db";
		document.getElementById("educationloan").style.background = "#3498db";
	}
	function setLoanTypeHouse() {
		oFormObject = document.forms['detailform'];
		oFormObject.elements["loanType"].value = 'house';
		document.getElementById("formdiv").style.display = "block";
		document.getElementById("carloan").style.background = "#3498db";
		document.getElementById("houseloan").style.background = "#EE571B";
		document.getElementById("educationloan").style.background = "#3498db";
	}
	function setLoanTypeEducation() {
		oFormObject = document.forms['detailform'];
		oFormObject.elements["loanType"].value = 'education';
		document.getElementById("formdiv").style.display = "block";
		document.getElementById("carloan").style.background = "#3498db";
		document.getElementById("houseloan").style.background = "#3498db";
		document.getElementById("educationloan").style.background = "#EE571B";
	}
</script>
</html>