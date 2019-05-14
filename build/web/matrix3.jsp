<%-- 
    Document   : matriz2
    Created on : 7/05/2019, 11:28:05 PM
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="code.code"%>
<%
    int aaa = Integer.parseInt(request.getParameter("a"));
    int bbb = Integer.parseInt(request.getParameter("b"));
    int ccc = Integer.parseInt(request.getParameter("c"));
    int ddd = Integer.parseInt(request.getParameter("d"));
    int eee = Integer.parseInt(request.getParameter("e"));
    int fff = Integer.parseInt(request.getParameter("f"));
    int ggg = Integer.parseInt(request.getParameter("g"));
    int hhh = Integer.parseInt(request.getParameter("h"));
    int iii = Integer.parseInt(request.getParameter("i"));

    int aaaa = Integer.parseInt(request.getParameter("aa"));
    int bbbb = Integer.parseInt(request.getParameter("bb"));
    int cccc = Integer.parseInt(request.getParameter("cc"));
    int dddd = Integer.parseInt(request.getParameter("dd"));
    int eeee = Integer.parseInt(request.getParameter("ee"));
    int ffff = Integer.parseInt(request.getParameter("ff"));
    int gggg = Integer.parseInt(request.getParameter("gg"));
    int hhhh = Integer.parseInt(request.getParameter("hh"));
    int iiii = Integer.parseInt(request.getParameter("ii"));

    code matriz = new code();
    String[] results = matriz.matrizb(aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii, aaaa, bbbb, cccc, dddd, eeee, ffff, gggg, hhhh, iiii);

    String dominante = results[0], maxmin = results[1], nash = results[2];

%>
<!DOCTYPE html>
<html>
    <head>
        <!--====== USEFULL META ======-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Massive HTML5 Template is a simple Smooth Personal App Landing Template" />
        <meta name="keywords" content="App, Landing, Business, Onepage, Html, Business" />

        <!--====== TITLE TAG ======-->
        <title>Massive Html5 App Landing Template</title>

        <!--====== FAVICON ICON =======-->
        <link rel="shortcut icon" type="image/ico" href="img/favicon.png" />

        <!--====== STYLESHEETS ======-->
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/modal-video.min.css">
        <link rel="stylesheet" href="css/stellarnav.min.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/slick.css">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/material-icons.css" rel="stylesheet">

        <!--====== MAIN STYLESHEETS ======-->
        <link href="style.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">

        <script src="js/vendor/modernizr-2.8.3.min.js"></script>
        <!--[if lt IE 9]>
            <script src="//oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="//oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
            <![endif]-->

        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <!-- <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css"> -->
        <!--===============================================================================================-->
        <!-- <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css"> -->
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>



        <section id="matriz3" class="features-area relative padding-100-50 gray-bg">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-lg-6 col-md-offset-3 col-lg-offset-3 col-sm-12 col-xs-12">
                        <div class="area-title text-center wow fadeIn">
                            <h2>Matriz 3 x 3</h2>
                            <p>La matriz 3 x 3 es una matriz que muestra los pagos que pueden obtener dos jugadores con 3 estrategias cada uno.</p>
                        </div>
                    </div>
                </div>
                <div class=" d-inline-flex align-items-center justify-content-center">

                    <div class="table100 ver6 m-b-110 col align-self-center">

                        <table data-vertable="ver6">

                            <thead>
                                <tr class="row100 head">
                                    <th class="column100 column2" data-column="column1"></th>
                                    <th class="column100 column3" data-column="column2">Estrategia 1</th>
                                    <th class="column100 column4" data-column="column3">Estrategia 2</th>
                                    <th class="column100 column4" data-column="column4">Estrategia 3</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="row100">
                                    <td class="column100 column2" data-column="column1">Estrategia 1</td>
                                    <td class="column100 column3" data-column="column2">
                                        A
                                        <input type="number" name="a" class="form-control" style="width: 90%;" value="<%=aaa%>">
                                        <input type="number" name="aa" class="form-control" style="width: 90%;" value="<%=aaaa%>">
                                    </td>
                                    <td class="column100 column4" data-column="column3">
                                        B
                                        <input type="number" name="b" class="form-control" style="width: 90%;" value="<%=bbb%>">
                                        <input type="number" name="bb" class="form-control" style="width: 90%;" value="<%=bbbb%>">
                                    </td>
                                    <td class="column100 column5" data-column="column4">
                                        C
                                        <input type="number" name="c" class="form-control" style="width: 90%;" value="<%=ccc%>">
                                        <input type="number" name="cc" class="form-control" style="width: 90%;" value="<%=cccc%>">
                                    </td>
                                </tr>

                                <tr class="row100">
                                    <td class="column100 column2" data-column="column1">Estrategia 2</td>
                                    <td class="column100 column3" data-column="column2">
                                        D
                                        <input type="number" name="d" class="form-control" style="width: 90%;" value="<%=ddd%>">
                                        <input type="number" name="dd" class="form-control" style="width: 90%;" value="<%=dddd%>">
                                    </td>
                                    <td class="column100 column4" data-column="column3">
                                        E
                                        <input type="number" name="e" class="form-control" style="width: 90%;" value="<%=eee%>">
                                        <input type="number" name="ee" class="form-control" style="width: 90%;" value="<%=eeee%>">
                                    </td>
                                    <td class="column100 column5" data-column="column4">
                                        F
                                        <input type="number" name="f" class="form-control" style="width: 90%;" value="<%=fff%>">
                                        <input type="number" name="ff" class="form-control" style="width: 90%;" value="<%=ffff%>">
                                    </td>
                                </tr>
                                <tr class="row100">
                                    <td class="column100 column2" data-column="column1">Estrategia 3</td>
                                    <td class="column100 column3" data-column="column2">
                                        G
                                        <input type="number" name="g" class="form-control" style="width: 90%;" value="<%=ggg%>">
                                        <input type="number" name="gg" class="form-control" style="width: 90%;" value="<%=gggg%>">
                                    </td>
                                    <td class="column100 column4" data-column="column3">
                                        H
                                        <input type="number" name="h" class="form-control" style="width: 90%;" value="<%=hhh%>">
                                        <input type="number" name="hh" class="form-control" style="width: 90%;" value="<%=hhhh%>">
                                    </td>
                                    <td class="column100 column5" data-column="column4">
                                        I
                                        <input type="number" name="i" class="form-control" style="width: 90%;" value="<%=iii%>">
                                        <input type="number" name="ii" class="form-control" style="width: 90%;" value="<%=iiii%>">
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <br>
                        <br>
                        <div id="resultados" style="color: #fff!important"> 
                            <h4>Estrategia Dominante: </h4><h5><%out.println(dominante);%></h5>
                            <br>
                            <h4>Estrategia MaxMin: </h4><h5><%out.println(maxmin);%></h5>
                            <br>
                            <h4>Equilibrio Nash: </h4><h5><%out.println(nash);%></h5>
                            <br>
                            <a class="btn btn-primary" style="margin: auto;" role="button" href="index.html">Salir</a>
                        </div>
                    </div>


                </div>
            </div>
        </section>


        <!--====== SCRIPTS JS ======-->
        <script src="js/vendor/jquery-1.12.4.min.js"></script>
        <script src="js/vendor/bootstrap.min.js"></script>

        <!--====== PLUGINS JS ======-->
        <script src="js/vendor/jquery.easing.1.3.js"></script>
        <script src="js/vendor/jquery-migrate-1.2.1.min.js"></script>
        <script src="js/vendor/jquery.appear.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/stellar.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery-modal-video.min.js"></script>
        <script src="js/stellarnav.min.js"></script>
        <script src="js/contact-form.js"></script>
        <script src="js/jquery.ajaxchimp.js"></script>
        <script src="js/jquery.sticky.js"></script>

        <!--===== ACTIVE JS=====-->
        <script src="js/main.js"></script>
    </body>
</html>
