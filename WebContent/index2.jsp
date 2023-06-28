<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dam2.dii.p12.model.Contacto" %>
<%@page import="java.util.*" %>

<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Agenda</title>
		<link rel="stylesheet" type="text/css"  href="css/styles.css"/>
		
	</head>
	<body>
	
		
		<div id="contenedor1">  
		
		  <h1>ALTA AGENDA</h1>
	
			
			
				<%
												String mensaje = (String) request.getAttribute("mensaje"); 
												
													if (mensaje == null) {
													
													mensaje = "";
													
													}
											%>
	
		
		  <div id="contenedor2">  <%=mensaje%>    </div>  
		
		       <br>
				
				<%
									ArrayList<Contacto> lista = (ArrayList<Contacto>) request.getAttribute("array");
								%>
				
				<%
									Iterator<Contacto> it = lista.iterator();
								%>
					
        
          <h1>Listado de Usuarios</h1>   
          
          <div class="contenedor3">     
              
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
              	  	while(it.hasNext()){
              	                		 
              	                    Contacto con=it.next();
              	  %>
                <tr>
                   <td><%= con.getName() %> </td>
                   <td><%= con.getSurname() %> </td>
                   <td><%= con.getEmail() %> </td>
                   <td><%= con.getPhone() %> </td>
                   <td><%= con.getComments() %> </td>
                </tr>
               
                             
                </tbody>  
                <% } %>   
                      
            </table>
            
           
           <br>
		
		    <a href="index.jsp">VOLVER A PANTALLA DE LOGIN</a>	   

	   	
          
          </div>	
          
          
		
				
		</div>	
		
	
		
	</body>
</html>