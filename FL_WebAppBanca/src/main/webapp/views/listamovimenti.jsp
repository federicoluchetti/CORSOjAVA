<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="static/css/footerStyle.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-light bg-light fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img src=https://www.logodesign.net/logo/abstract-arrows-going-upward-3166ld.png?size=2&industry=bank" alt="" width="30" height="24"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
      <div class="offcanvas-header">
        <h5 class="offcanvas-title" id="offcanvasNavbarLabel">Menù</h5>
        <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
      </div>
      <div class="offcanvas-body">
      <div class="d-grid gap-2">
 <a href="http://127.0.0.1:8080/FL_WebAppBanca/home" button class="btn btn-secondary" type="button">Home</a>
  <a href="http://127.0.0.1:8080/FL_WebAppBanca/versamento" button class="btn btn-secondary" type="button">Versamento</a>
  <a href="http://127.0.0.1:8080/FL_WebAppBanca/prelevamento" button class="btn btn-secondary" type="button">Prelievo</a>
  <a href="http://127.0.0.1:8080/FL_WebAppBanca/listamovimenti" button class="btn btn-success" type="button">Lista Movimenti</a>
</div>

      </div>
    </div>
  </div>
  <table>
<tr class="table-dark">
<th>ID</th>
<th>DATA</th>
<th>OPERAZIONE</th>
<th>NOMINATIVO</th>
<th>TAGLIO</th>
<th>QUANTITÀ</th>
<th>TOTALE</th>
</tr>
<c:set var = "numeroMovimentiGenerati" value="0"/>
<c:forEach var="lista" items="${responseMovimenti.listaMovimentiRestituti}">
<tr class="table-danger">
<td><c:out value="${lista.id}"/></td>
<td><c:out value="${lista.data}"/></td>
<td><c:out value="${lista.operazione}"/></td>
<td><c:out value="${lista.nominativo}"/></td>
<td><c:out value="${lista.taglio}"/></td>
<td><c:out value="${lista.quantità}"/></td>
<td><c:out value="${lista.totale}"/></td>
<td><a href="elimina-voce?id=<c:out value="${lista.id}"/>"> </td>
</tr>
</c:forEach>
</table>
</nav>












 <div class="footer-basic fixed-bottom">
        <footer>
            <div class="social"><a href="#"><i class="icon ion-social-instagram"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-facebook"></i></a></div>
            <ul class="list-inline">
                <li class="list-inline-item"><a href="#">Home</a></li>
                <li class="list-inline-item"><a href="#">Services</a></li>
                <li class="list-inline-item"><a href="#">About</a></li>
                <li class="list-inline-item"><a href="#">Terms</a></li>
                <li class="list-inline-item"><a href="#">Privacy Policy</a></li>
            </ul>
            <p class="copyright">Company Name © 2018</p>
        </footer>
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="static/js/neotech_ajax.js"></script>
<script type="text/javascript" src="static/js/main.js"></script>
</body>
</html>