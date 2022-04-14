<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="static/css/bancaCss.css"/>
<link rel="stylesheet" type="text/css" href="static/css/stileVersamento.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Versamento</title>
</head>
<body>
<div class="titolo">
<h1 class="text-center text-right fs-1"><strong>Neotech Bank</strong></h1>
</div>


<form class="row row-cols-lg-auto g-3 align-items-center" id="form_user" action="inviovers_get" method="POST" modelAttribute="mapping_dati">
  <div class="col-12">
    <form:label class="visually-hidden" for="inlineFormInputGroupUsername">Username</form:label>
    <div class="input-group">
      <div class="input-group-text">@</div>
      <form:input type="text" class="form-control" path="username" id="inlineFormInputGroupUsername" placeholder="Nominativo">
    </div>
  </div>

  <div class="col-12">
    <form:label class="visually-hidden" for="inlineFormSelectPref">Preference</form:label>
    <form:select class="form-select" id="taglio" path="taglio">
      <form:option selected>Taglio</form:option>
      <form:option value="1">10 Euro</form:option>
      <form:option value="2">20 Euro</form:option>
      <form:option value="3">50 Euro</form:option>
    </form:select>
  </div>

  <form:div class="col-12">
  <form:label for="customRange2" class="form-label">Quantità</form:label>

<form:input type="range" class="form-range" min="0" max="100" id="customRange2" path="quantita">

<form:div class="label-group">
<form:label for="customRange2" class="form-label">1</form:label>

<form:label for="customRange2" class="form-label">100</form:label>

</div>
    </div>
  </div>

  <div class="col-12">
    <form:button type="submit" class="btn btn-primary">Invia</form:button>
  </div>


</form:form>




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