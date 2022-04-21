<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" type="text/css" href="static/css/footerStyle.css"/>
<title>Home</title>
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
</nav>

<div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://securecdn.pymnts.com/wp-content/uploads/2016/08/security-simplicity-digital-banking.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://analyticsinsight.b-cdn.net/wp-content/uploads/2021/03/Banking-Security.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://securitasmedia.com/securitas-epi/Top%20Page%20Mobile_2004-Financial2_Bank_2011_045.jpg" class="d-block w-100 " alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div




































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




</body>
</html>