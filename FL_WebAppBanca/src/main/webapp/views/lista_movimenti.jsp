<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="static/css/bancaCss.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Lista Movimenti</title>
</head>
<body>
<div class="titolo">
<h1 class="text-center text-right fs-1"><strong>Neotech Bank</strong></h1>
</div>

<div id="saldo">
<input class="form-control form-control-lg" type="text" placeholder="SALDO" aria-label=".form-control-lg example">

</div>




</div id="tabella">
<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Data e Ora</th>
      <th scope="col">Operazione</th>
      <th scope="col">Nominativo</th>
      <th scope="col">Taglio</th>
      <th scope="col">Quantità</th>
      <th scope="col">Totale</th>
      <th scope="col">Azioni</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td><input class='myclass' type='button' value='Delete'/></td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
         <td><input class='myclass' type='button' value='Delete'/></td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
         <td><input class='myclass' type='button' value='Delete'/></td>
    </tr>
  </tbody>
</table>

</div>






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