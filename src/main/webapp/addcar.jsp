
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.navbar {
  overflow: hidden;
  background-color: blue;
  font-family: Arial;
}

/* Links inside the navbar */
.navbar a {
  float: left;
  font-size: 20px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* The dropdown container */
.dropdown {
  float: right;
  overflow: hidden;
  padding-right: 3%;
}

/* Dropdown button */
.dropdown .dropbtn {
  font-size: 16px;
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit; /* Important for vertical align on mobile phones */
  margin: 0; /* Important for vertical align on mobile phones */
}

/* Dropdown content (hidden by default) */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

/* Add a grey background color to dropdown links on hover */
.dropdown-content a:hover {
  background-color: #ddd;
}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
  display: block;
}

.blink {
  animation: blink 1s steps(1, end) infinite;
}

@keyframes blink {
  0% {
    opacity: 1;
  }
  50% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.button {
  background-color: blue;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  margin: 0 auto
}

input[type=text],input[type=password],input[type=number],input[type=email],
select,input[type=date]
{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

label 
{
  padding: 12px 12px 12px 0;
  display: inline-block;
  font-weight: bold;
}


ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}
li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}

</style>
<title>Insert title here</title>
</head>
<body>
<div class="navbar">
  <a href="/">Car ShowRoom Management System</a>
  <!-- <button class="navbar"><a href="contactus">Contact Us</a></button>
  <button class="navbar"><a href="aboutus">About Us</a></button>
   -->
  <div class="dropdown">
    <button class="dropbtn">View
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="viewallemps">View all Emp</a>
      <a href="viewallcus">View all Cus</a>
      <a href="viewallcars">View all Cars</a>
    </div>
    <a href="addcar">Add Car</a>
    <a href="/logout">Logout</a>
  </div>  
</div>
</div>
<br><br>
<h3 align=center><u>Add Car</u></h3>
<br>
<form>
<table align="center">
<tr>
<td><label>Car Name</label></td>
<td><input type="text"/></td>
</tr>
<tr><td></td></tr>
<tr>
<td><label>Car Model</label></td>
<td><input type="text"/></td>
</tr>
<tr><td></td></tr>
<tr>
<td><label>Car Mileage</label></td>
<td><input type="text"/></td>
</tr>
<tr><td></td></tr>
<tr>
<td><label>Car Price</label></td>
<td><input type="text"/></td>
</tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr align=center>
</tr>
</table>
<p align="center"><a href="adminhome" class="button">Add</a></p>
</form>
</body>
</html>