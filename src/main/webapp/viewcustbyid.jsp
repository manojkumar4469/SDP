<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
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
  font-size: 20px;
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
</head>
<body>
<div class="navbar">
  <a href="adminhome">Car ShowRoom Management System</a>
  <div class="dropdown">
    <button class="dropbtn">View
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="viewallemps">View all Emp</a>
      <a href="viewallcus">View all Cus</a>
      <a href="viewallcars">View all Cars</a>
    </div>
    <a href="/logout">Logout</a>
  </div>  
</div>
<br>
<h3 align=center>Welcome&nbsp;<c:out value="${cus.name}"></c:out></h3>
<br>
<table align=center>
<tr><th>ID:</th>&nbsp;<td>${cus.id}</td></tr>
<tr><th>User Name:</th>&nbsp;<td>${cus.uname}</td></tr>
<tr><th>Email ID:</th>&nbsp;<td>${cus.emailid}</td></tr>
</table>
</body>
</html>