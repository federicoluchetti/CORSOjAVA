<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="static/css/footerStyle.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Versamento</title>
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
  <form class="row row-cols-lg-auto g-3 align-items-center" id="form_user" action="inviovers_get" method="POST" modelAttribute="mapping_dati">
  <div class="col-12">
    <label class="visually-hidden" for="inlineFormInputGroupUsername">Username</label>
    <div class="input-group">
      <div class="input-group-text">@</div>
      <input type="text" class="form-control" path="username" id="inlineFormInputGroupUsername" placeholder="Nominativo">
    </div>
  </div>

  <div class="col-12">
    <label class="visually-hidden" for="inlineFormSelectPref">Preference</flabel>
    <select class="form-select" id="taglio" path="taglio">
      <option selected>Taglio</option>
      <option value="1">10 Euro</option>
      <option value="2">20 Euro</option>
      <option value="3">50 Euro</option>
    </select>
  </div>

  <div class="col-12">
  <label for="customRange2" class="form-label">Quantità</label>

<input type="range" value="0" min="1" max="100" oninput="this.nextElementSibling.value = this.value">
<output>0</output>

</div>
    </div>
  </div>

  <div class="col-12">
    <button type="submit" class="btn btn-primary">Invia</button>
  </div>


</form>
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