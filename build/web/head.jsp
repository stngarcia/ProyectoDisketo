<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8" />
        <meta name="viewport"
              content="width=device-width, initial-scale=1, shrink-to-fit=no" />

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/estilo.css" />
        <title>Disketo</title>
    </head>
    <body>

        <a class="go-up"></a>
        <header>
            <div
                class="navbar shadow-sm navbar-expand-md fixed-top navbar-dark bg-dark">
                <div class="container d-flex justify-content-between">
                    <a href="index.html"
                       class="navbar-brand d-flex align-items-center"> <img
                            src="img/disco.png" alt="Disketo" height="12%" width="12%">
                        <h1>
                            <strong>Disketo</strong>
                        </h1>
                    </a>
                    <button class="navbar-toggler" type="button"
                            data-toggle="collapse" data-target="#navbarHeader"
                            aria-controls="navbarHeader" aria-expanded="false"
                            aria-label="Opciones">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                </div>
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarsExampleDefault"
                        aria-controls="navbarsExampleDefault" aria-expanded="false"
                        aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active"><a class="nav-link"
                                                       href="index.jsp">Home <span class="sr-only">(current)</span></a></li>
                        <li class="nav-item"><a class="nav-link"
                                                href="contacto-agregar-mensaje.jsp">Contacto</a></li>
                        <li class="nav-item"><a class="nav-link"
                                                href="ListContacts">Lista de mensajes</a></li>                        
                        <li class="nav-item"><a class="nav-link"
                                                href="acercaDE.jsp">Acerca de</a></li>
                        <li class="nav-item dropdown"><a
                                class="nav-link dropdown-toggle"
                                href="http://example.com" id="dropdown01"
                                data-toggle="dropdown" aria-haspopup="true"
                                aria-expanded="false">Acceso</a>
                            <div class="dropdown-menu" aria-labelledby="dropdown01">
                                <a class="dropdown-item" href="login.jsp">
                                    Acceder</a> <a class="dropdown-item"
                                               href="usuario-agregar.jsp">Registrar</a>
                            </div></li>
                    </ul>
                </div>
            </div>
        </header>