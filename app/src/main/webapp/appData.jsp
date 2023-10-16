<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Date"%>
<%@ page import="ar.com.projects.bean.Persona"%>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSP Sample</title>
	</head>
	<body>
		<table>
			<tr>
				<td>NOMBRE</td>
				<td>DNI</td>
				<td>FECHA NAC</td>
				<td>SEXO</td>
			</tr>
			<%
				List<Persona> listPers = (List<Persona>)request.getAttribute("data");

				for (Persona p: listPers) {
			%>
				<tr>
					<td><%= p.getNombre() %></td>
					<td><%= p.getDni() %></td>
					<td><%= p.getFechaNacFormat() %></td>
					<td><%= p.getSexo().getDescription() %></td>
				</tr>
			<%
				}
			%>
		</table>
	</body>
</html>
