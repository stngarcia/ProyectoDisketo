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
                <h1>Usuario creado</h1>
                <table class="table table-responsive">
                    <tr>
                        <td>Nombre:</td>
                        <td><%=request.getParameter("nombre") + ' ' + request.getParameter("apellido") %></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><%=request.getParameter("email")%></td>
                    </tr>
                </table>

            </section>
        </div>

        <jsp:include page="footer.html" />

        <script type="application/javascript" src="js/jquery/jquery-3.3.1.min.js"></script>
        <script type="application/javascript" src="js/popper/popper.min.js"></script>
        <script type="application/javascript" src="js/bootstrap/bootstrap.min.js"></script>

    </body>
</html>
