<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="static/css/footerStyle.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Prelevamento</title>
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
  <div class="row g-2">
  <div class="col-md">
    <div class="form-floating">
      <input type="username" class="form-control" id="username" placeholder="Mario Rossi" value="username">
      <label for="floatingInputGrid">Username</label>
    </div>
  </div>
<div class="input-group">
  <select class="form-select" id="inputGroupSelect04" aria-label="Example select with button addon">
    <option selected>Importo</option>
    <option value="1">20</option>
    <option value="2">50</option>
    <option value="3">100</option>
    <option value="4">altro importo</option>
  </select>
  
  <button class="btn btn-outline-secondary" type="button">Invia</button>
</div>


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
</body>
</html>