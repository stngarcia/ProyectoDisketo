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

        <main role="main">
            <section class="jumbotron text-center">
                <div class="container">
                    <h1 class="jumbotron-heading">Inicio de sesión.</h1>
                    <p class="text-center text-muted">Ingresa tus credenciales y
                        comienza a registrar tus discografías.</p>
                    <form id="formularioLogin" name="formularioLogin" method="post" class="form-horizontal"
                          action="login">
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
                                <input type="password" class="form-control" id="pwd" name="pwd"
                                       placeholder="Ingrese su contraseña" />
                            </div>
                        </div>


                        <div class="row">
                            <div class="col-sm-12 col-md-3">
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary">Ingresar</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </section>
        </main>

        <jsp:include page="footer.html" />

        <script type="application/javascript" src="js/jquery/jquery-3.3.1.min.js"></script>
        <script type="application/javascript" src="js/popper/popper.min.js"></script>
        <script type="application/javascript" src="js/bootstrap/bootstrap.min.js"></script>
        <script type="application/javascript" src="js/jqueryValidation/jquery.validate.min.js"></script>
        <script type="application/javascript" src="js/funciones.js"></script>
        <script type="application/javascript" src="js/validaFormularioLogin.js"></script>

    </body>
</html>


