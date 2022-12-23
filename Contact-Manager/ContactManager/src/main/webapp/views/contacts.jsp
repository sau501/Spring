
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Contacts</title>
  </head>
  <body>
	  <nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
		  <a class="navbar-brand m-2" >
			  Contact Manager</a>
		  <div class="collapse navbar-collapse">
			  <ul class="navbar-nav">
				  <li class="nav-item"><a class="nav-link" href="/welcome">Home</a></li>
				  <li class="nav-item"><a class="nav-link" href="/contacts">Contacts</a></li>
			  </ul>
		  </div>
		  <ul class="navbar-nav">
			  <li class="nav-item"><a class="nav-link" href="/">Logout</a></li>
		  </ul>
	  </nav>
    <div class="container">
		<h2>Your contacts are </h2>
	<table class="table">
		<thead>
		<th>ID</th>
		<th>Name</th>
		<th>Description</th>
		<th>MNO</th>
		<th>Delete</th>
		<th>Update</th>
		</thead>
		<tbody>
			<c:forEach items="${contacts}" var="contact">
				<tr>
					<td>${contact.id}</td>
					<td>${contact.name}</td>
					<td>${contact.description}</td>
					<td>${contact.mobNO}</td>
					<td><a href="delete-contact?id=${contact.id}"
						class="btn btn-warning">Delete</a> </td>
					<td><a href="update-contact?id=${contact.id}"
						   class="btn btn-success">Update</a> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<a href="add-contact" class="btn btn-success"> Add Contact</a>
</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>