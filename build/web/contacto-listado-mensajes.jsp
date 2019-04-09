<%@page import="entity.Contact"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <title>Disketo></title>
        <meta charset="utf-8" />
        <meta name="viewport"
              content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/estilo.css" />
    </head>

    <body>
        <jsp:include page="head.jsp" />

        <div class="container">
            <section class="jumbotron text-center">
                <br><br>
                <h1>Lista de mensajes ingresados</h1>
                <table class="table table-responsive">
                    <thead>
                    <th>id</th>
                    <th>Nombre</th>
                    <th>Email</th>
                    <th>Teléfono</th>
                    <th>Motivo</th>
                    <th>Mensaje</th>
                    <th>Fecha ingreso</th>    
                    </thead>
                    <tbody>


                        <%
                            List<Contact> myContactList = (List<Contact>) request.getAttribute("contacts");
                            for (Contact myContact : myContactList) {
                                out.println("<tr>");
                                out.println("<td>"+myContact.getIdContacto()+"</td>");
                                out.println("<td>"+myContact.getNombre()+"</td>");
                                out.println("<td>"+myContact.getEmail() +"</td>");
                                out.println("<td>"+myContact.getTelefono() +"</td>");
                                out.println("<td>"+myContact.getMotivo() +"</td>");
                                out.println("<td>"+myContact.getTextoReq()+"</td>");
                                out.println("<td>"+myContact.getFechaHora()+"</td>");
                                out.println("</tr>");
                            }
                        %>
                    </tbody>           

                </table>

            </section>
        </div>




        <jsp:include page="footer.html" />

        <script type="application/javascript" src="js/jquery/jquery-3.3.1.min.js"></script>
        <script type="application/javascript" src="js/popper/popper.min.js"></script>
        <script type="application/javascript" src="js/bootstrap/bootstrap.min.js"></script>

    </body>
</html>
