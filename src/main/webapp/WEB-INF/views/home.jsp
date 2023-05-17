<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container" align="center">
<h1>Car Registration Form:</h1>
<div class="card">
<div class="card-body">
<form:form action="save" method="post" modelAttribute="car">
<div class="form-group row">
<label for="plateNo" class="col-sm-2 col-form-label">Plate No:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="plateNo" 
placeholder="Enter PlateNo" path="plateNo"/>
</div>
</div>
<div class="form-group row">
<label for="owner" class="col-sm-2 col-form-label">Floor:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="floor" 
placeholder="Enter Floor" path="floor"/>
</div>
</div>
<div class="form-group row">
<label for="cost" class="col-sm-2 col-form-label">VehicleType:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="vehicleType" 
 path="vehicleType" />
</div>
</div>
<div class="form-group row">
<label for="cost" class="col-sm-2 col-form-label">Avl_Slot:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="avlSlot" 
 path="avlSlot" />
</div>
</div>
<div class="form-group row">
<label for="cost" class="col-sm-2 col-form-label">BookedSlot:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="bookedSlot" 
 path="bookedSlot" />
</div>
</div>
<button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</div>
</div>
</div>
</body>
</html>