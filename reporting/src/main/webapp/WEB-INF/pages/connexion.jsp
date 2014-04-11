<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Connexion</title>
	<link href="css/bootstrap-theme.css" rel="stylesheet">
	<link href="css/bootstrap-theme.min.css" rel="stylesheet">
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/theme.css" rel="stylesheet">
	<link href="css/themeconnexion.css" rel="stylesheet">
	<script src="/js/bootstrap.js" type="text/javascript" charset="utf-8" async defer></script>
</head>
<body>
	<div class="panel panel-default connexion panel-docapost">
  		<div class="panel-heading">
    		<h3 class="panel-title">Identifiez-vous et accédez à nos services</h3>
  		</div>
  		<div class="panel-body container div-formulaire">
    		<form class="form-signin" role="form">
	        	<input type="email" class="form-control" placeholder="Adresse mail" required="" autofocus="">
	        	<input type="password" class="form-control" placeholder="Mot de passe" required="">
	        	<label class="checkbox">
	         		<input type="checkbox" value="remember-me"> Se souvenir de moi
	        	</label>
	        	<button class="btn btn-lg btn-docapost btn-block" type="submit">Connexion</button>
	      	</form>
  		</div>
	</div>
	<img alt="Docapost-BPO" src="./image/Logo.png" class="logo-docapost">
</body>