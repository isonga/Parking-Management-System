<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Cars</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>

<div align="center">
<a href="new" class="btn btn-primary btn-lg active" role="button" >ADD NEW CAR</a>
<table class="table table-striped table-dark">
<tr class="table-active">
<th  scope="col">#</th>
<th  scope="col">PlateNo</th>
<th  scope="col">Floor</th>
<th  scope="col">VehicleType</th>
<th  scope="col">AvlSlot</th>
<th  scope="col">BookedSlot</th>
<th  scope="col">Action</th>
</tr>

<c:forEach items="${listCar }" var="car" varStatus="status">
<tr class= " bg-info">
<td  scope="row">${status.index +1 }</td>
<td  scope="row">${car.plateNo }</td>
<td scope="row">${car.floor }</td>
<td scope="row">${car.vehicleType }</td>
<td scope="row">${car.avlSlot }</td>
<td scope="row">${car.bookedSlot}</td>
<td>
<a class=" btn btn-outline-dark text-white bg-dark" href="edit?id=${car.plateNo}">Edit</a>
&nbsp;&nbsp;
<a class="btn btn-outline-dark text-white bg-dark" href="delete?id=${car.plateNo}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>