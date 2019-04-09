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
            <h1>
                Creación de usuarios
            </h1>
            <p class="text-center text-muted">
                Ingresa los datos solicitados para crear un nuevo usuario.
            </p>
            <div class="panel panel-default">
                <div class="panel-body">
                    <form id="formularioUsuario" method="post" class="form-horizontal"
                          action="AddUser">
                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="nombre">Nombre</label>
                            <div class="col-sm-5">
                                <input type="text" class="form-control" id="nombre"
                                       name="nombre" placeholder="Ingrese su nombre" autofocus />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="apellido">Apellido</label>
                            <div class="col-sm-5">
                                <input type="text" class="form-control" id="apellido"
                                       name="apellido" placeholder="Ingrese su apellido" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="email">Email</label>
                            <div class="col-sm-5">
                                <input type="text" class="form-control" id="email" name="email"
                                       placeholder="Ingrese su email" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="pwd">Contraseña</label>
                            <div class="col-sm-5">
                                <input type="text" class="form-control" id="pwd"
                                       name="pwd" placeholder="Ingrese su contraseña" />
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-9 col-sm-offset-4">
                                <button type="submit" class="btn btn-primary" name="grabar"
                                        value="grabar">Grabar</button>
                            </div>



                    </form>            
                </div>
            </div>
        </div>

        <jsp:include page="footer.html" />

        <script type="application/javascript" src="js/jquery/jquery-3.3.1.min.js"></script>
        <script type="application/javascript" src="js/popper/popper.min.js"></script>
        <script type="application/javascript" src="js/bootstrap/bootstrap.min.js"></script>
        <script src="js/jqueryValidation/jquery.validate.min.js"></script>
        <script src="js/funciones.js"></script>
        <script src="js/validaFormularioUsuario.js"></script>
    </body>
</html>
