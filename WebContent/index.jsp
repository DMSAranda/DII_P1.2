<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dam2.dii.p12.model.Contacto"%>
<%@page import="java.util.*"%>


<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agenda</title>
<link rel="stylesheet" type="text/css" href="css/styles.css" />

</head>
<body>

	<div id="contenedor0">

		<div id="contenedor1">

			<h1>ALTA AGENDA</h1>

			<form id="form1" action="<%=request.getContextPath()%>/"
				method="post">


				<div>
					<img src="images/user.png" alt="" /> <input type="text"
						name="name" placeholder="INTRODUCE TU NOMBRE" />
				</div>

				<br>

				<div>
					<img src="images/user.png" alt="" /> <input type="text"
						name="surname" placeholder="INTRODUCE TUS APELLIDOS" />
				</div>

				<br>

				<div>
					<img src="images/email.png" alt="" /> <input type="email"
						name="email" placeholder="INTRODUCE TU EMAIL" />
				</div>

				<br>

				<div>
					<img src="images/phone.png" alt="" /> <input type="number"
						name="phone" placeholder="INTRODUCE TU TELÉFONO" />
				</div>

				<br>

				<div>
					<img src="images/comment.png" alt="" />

					<textarea name="comments" placeholder="INTRODUCE TUS COMENTARIOS"></textarea>
				</div>

				<br> <input type="submit" name="boton" value="Enviar" />

			</form>


			<%
				String mensaje = (String) request.getAttribute("mensaje");

					if (mensaje == null) {

						mensaje = "";

					}
			%>


			<div id="contenedor2">
				<%=mensaje%>
			</div>

		</div>

		<br>

		<%
			ArrayList<Contacto> lista = (ArrayList<Contacto>) request.getAttribute("array");

			if (lista != null) {

				Iterator<Contacto> it = lista.iterator();
		%>

		<div id="contenedor3">

			<h1>Listado de Usuarios</h1>

			<br>

			<table>
				<thead>
					<tr>
						<th>Nombre</th>
						<th>Apellidos</th>
						<th>Email</th>
						<th>Teléfono</th>
						<th>Comentarios</th>
					</tr>

				</thead>

				<tbody>

					<%
						while (it.hasNext()) {

											Contacto con = it.next();
					%>
					<tr>
						<td><%=con.getName()%></td>
						<td><%=con.getSurname()%></td>
						<td><%=con.getEmail()%></td>
						<td><%=con.getPhone()%></td>
						<td><%=con.getComments()%></td>
					</tr>


				</tbody>
				<%
					}
				%>

			</table>


			<%
				}
			%>



		</div>

	</div>

</body>
</html>