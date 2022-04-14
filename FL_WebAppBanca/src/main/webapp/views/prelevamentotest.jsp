<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="static/css/bancaCss.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Prelevamento</title>
</head>
<body>
<div class="titolo">
<h1 class="text-center text-right fs-1"><strong>Neotech Bank</strong></h1>
</div>

<form:form class="row row-cols-lg-auto g-3 align-items-top" id="form_user" action="prelievo_get" method="POST" modelAttribute="mapping_dati">
  <div class="col-12">
    <form:label class="visually-hidden" for="inlineFormInputGroupUsername">Username</form:label>
    <div class="input-group">
      <div class="input-group-text">@</div>
      <form:input type="text" class="form-control" id="inlineFormInputGroupUsername" placeholder="Nominativo">
    </div>
  </div>
  <div class="btn-group-vertical me-2" role="group" aria-label="First group">
    <form:button type="button" class="btn btn-outline-secondary">25</form:button>
    <form:button type="button" class="btn btn-outline-secondary">50</form:button>
    <form:button type="button" class="btn btn-outline-secondary">100</form:button>
    <form:button type="button" class="btn btn-outline-secondary">altro importo</form:button>
    <form:input type="altroimporto" class="form-control" id="inlineFormInputNumber" placeholder="importo">
  </div>

  <div class="col-12">
    <form:button type="submit"  id="bth-search" class="btn btn-primary">Invia</form:button>
  </div>


</form:form>






<div class="home">
<ul class="nav nav-pills">
  <li class="nav-item" action="home_get" method="GET" modelAttribute="mapping_dati">
    <a class="nav-link active" aria-current="page" href="127.0.0.1:8080/FL_WebAppBanca/home">Home</a>
  </li>
  <li class="nav-item" action="versamento_get" method="GET" modelAttribute="mapping_dati">
    <a class="nav-link active" aria-current="page" href="http://127.0.0.1:8080/FL_WebAppBanca/versamento">Versamento</a>
  </li>
  <li class="nav-item" action="prelevamento_get" method="GET" modelAttribute="mapping_dati">
      <a class="nav-link active" aria-current="page" href="http://127.0.0.1:8080/FL_WebAppBanca/prelevamento">Prelevamento</a>
  </li>
  <li class="nav-item" action="lista_get" method="GET" modelAttribute="mapping_dati">
       <a class="nav-link active" aria-current="page" href="http://127.0.0.1:8080/FL_WebAppBanca/lista">Lista Movimenti</a>
  </li>
</ul>
</div>
</div>










































<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>