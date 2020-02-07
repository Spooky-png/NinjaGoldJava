<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
</head>
<body>
<h3>Your Gold:<c:out value="${pouch}"/></h3>
<div>
<h4>Farm</h4>
<p>(Earns 10-20 gold)</p>
<form method="POST" action="/farm">
<button>Find Gold!</button>
</form>
</div>
<div>
<h4>Cave</h4>
<p>(Earns 5-10 gold)</p>
<form method="POST" action="/cave">
<button>Find Gold!</button>
</form>
</div>
<div>
<h4>House</h4>
<p>(Earns 2-5 gold)</p>
<form method="POST" action="/house">
<button>Find Gold!</button>
</form>
</div>
<div>
<h4>Casino!</h4>
<p>(Earns/takes 0-50 gold)</p>
<form method="POST" action="/casino">
<button>Find Gold!</button>
</form>
</div>
<h4>Reset</h4>
<p>(Go back to 0 gold)</p>
<form method="POST" action="/reset">
<button>Reset</button>
</form>
<div>
<ul>Activities:
<% for(int i = 0; i<3; i++) {%>
<li>(<c:out value="${dateArray}"/>)</li>
<% } %>
</ul>
</div>
</body>
</html>