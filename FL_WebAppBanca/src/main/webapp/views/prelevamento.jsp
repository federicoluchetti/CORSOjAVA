<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="static/css/bancaCss.css"/>

<title>Home</title>
</head>
<body>
<div class="titolo">
<h1 class="text-center text-right fs-1"><strong>Neotech Bank</strong></h1>
</div>

<form class="row row-cols-lg-auto g-3 align-items-top" id="form_user" action="inviodati_get" method="POST" modelAttribute="mapping_dati">
  <div class="col-12">
    <label class="visually-hidden" for="inlineFormInputGroupUsername">Username</label>
    <div class="input-group">
      <div class="input-group-text">@</div>
      <input type="text" class="form-control" id="inlineFormInputGroupUsername" placeholder="Nominativo">
    </div>
  </div>
  <div class="btn-group-vertical me-2" role="group" aria-label="First group">
    <button type="button" class="btn btn-outline-secondary">25</button>
    <button type="button" class="btn btn-outline-secondary">50</button>
    <button type="button" class="btn btn-outline-secondary">100</button>
    <button type="button" class="btn btn-outline-secondary">altro importo</button> <input type="altroimporto" class="form-control" id="inlineFormInputNumber" placeholder="importo">
  </div>

  <div class="col-12">
    <button type="submit" class="btn btn-primary">Invia</button>
  </div>


</form>






<div class="home">
<ul class="nav nav-pills">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="#">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="#">Versamento</a>
  </li>
  <li class="nav-item">
      <a class="nav-link active" aria-current="page" href="#">Prelevamento</a>
  </li>
  <li class="nav-item">
       <a class="nav-link active" aria-current="page" href="#">Lista Movimenti</a>
  </li>
</ul>
</div>
</div>










































<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>