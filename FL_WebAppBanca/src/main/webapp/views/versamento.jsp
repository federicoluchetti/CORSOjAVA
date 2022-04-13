<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="static/css/bancaCss.css"/>
<link rel="stylesheet" type="text/css" href="static/css/stileVersamento.css"/>
<title>Home</title>
</head>
<body>
<div class="titolo">
<h1 class="text-center text-right fs-1"><strong>Neotech Bank</strong></h1>
</div>


<form class="row row-cols-lg-auto g-3 align-items-center" id="form_user" action="inviodati_get" method="POST" modelAttribute="mapping_dati">
  <div class="col-12">
    <label class="visually-hidden" for="inlineFormInputGroupUsername">Username</label>
    <div class="input-group">
      <div class="input-group-text">@</div>
      <input type="text" class="form-control" id="inlineFormInputGroupUsername" placeholder="Nominativo">
    </div>
  </div>

  <div class="col-12">
    <label class="visually-hidden" for="inlineFormSelectPref">Preference</label>
    <select class="form-select" id="inlineFormSelectPref">
      <option selected>Taglio</option>
      <option value="1">10 Euro</option>
      <option value="2">20 Euro</option>
      <option value="3">50 Euro</option>
    </select>
  </div>

  <div class="col-12">
  <label for="customRange2" class="form-label">Quantità</label>

<input type="range" class="form-range" min="0" max="100" id="customRange2">

<div class="label-group">
<label for="customRange2" class="form-label">1</label>

<label for="customRange2" class="form-label">100</label>

</div>
    </div>
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
</div><!-- home -->















<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>