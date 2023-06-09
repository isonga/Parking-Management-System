<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>

<form:form action="save" method="post" modelAttribute="car">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create register new car.</p>
    <hr>

    <label for="email"><b>parkingId</b></label>
    <form:input type="text" placeholder="Enter parkingId" name="parkingId"  required path="plateNo" />

    <label for="psw"><b>Floor</b></label>
    <form:input type="text" placeholder="Enter number of Floor" required path="floor" />

    <label for="psw-repeat"><b>Vehicle_Type</b></label>
    <form:input type="text" placeholder="Enter Vehicle_Type" required path="VehicleType" />

    <label for="psw-repeat"><b>avl-slot</b></label>
    <form:input type="text" placeholder="Enter available-slot" required path="avlSlot" />

    <label for="psw-repeat"><b>Booked-slot</b></label>
    <form:input type="text" placeholder="Enter Booked-slot" required path="bookedSlot" />
    <hr>
    

    <button type="submit" class="registerbtn">Register</button>
  </div>
  
  <div class="container signin">
    <p>Already have an account? <a href="/">Sign in</a>.</p>
  </div>
</form:form>

</body>
</html>
