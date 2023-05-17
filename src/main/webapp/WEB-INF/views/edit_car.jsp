<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT CAR INFO</title>
</head>
<body>
<div align="center">
<h1>Edit Car Information</h1>
<form:form action="save" method="post" modelAttribute="car">
<table>
<tr>
<td>ID:</td>
<td>
${car.plateNo}
<form:hidden path="plateNo"/>
</td>
</tr>
<tr>
<td>VehicleType:</td>
<td><form:input path="vehicleType" /></td>
</tr>
<tr>
<td>Floor:</td>
<td><form:input path="floor" /></td>
</tr>
<tr>
<td>Avl_Slot:</td>
<td><form:input path="avlSlot" /></td>
</tr>
<tr>
<td>bookedSlot</td>
<td><form:input path="bookedSlot" /></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="Save" /></td>
</tr>
</table>

</form:form>
</div>
</body>
</html>