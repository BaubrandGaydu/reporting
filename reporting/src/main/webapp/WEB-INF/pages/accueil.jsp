<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Accueil</title>
	<script type="text/javascript" src="https://www.google.com/jsapi"></script>
	<link href="css/bootstrap-theme.css" rel="stylesheet">
	<link href="css/bootstrap-theme.min.css" rel="stylesheet">
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/theme.css" rel="stylesheet">
	<script src="js/jquery.js" type="text/javascript" charset="utf-8" async defer></script>
	<script src="js/bootstrap.js" type="text/javascript" charset="utf-8" async defer></script>
    <script src="js/accueil.js" type="text/javascript" charset="utf-8" async defer></script> 
   	<script type="text/javascript">
   		google.load('visualization', '1.0', {'packages':['corechart']});
   		google.setOnLoadCallback(drawChart);
   	</script>


</head>
<body>
	<c:set var="pageSelectionnee" value="accueil" scope="request" />
	<jsp:include page="menu.jsp" />
	<div class="panel panel-default panel-docapost panel-graphique">
		<div class="accueil-sup">
			<div id="chart_div"></div>
		</div>
		<div class="accueil-inf">
			<button id="showHideForm" class="btn btn-lg btn-docapost btn-graphique" type="button">Créer un nouvel élément</button>
		</div>
	</div>
	<div id="filtre">
	</div>
	<div id="form1" class="fenetre-form panel panel-default">
		<div class="form-sup">
			<a class= "fermeture-fenetre closeForm"> <span class="glyphicon glyphicon-remove"></span></a>
			<br/>
			<label id="suivi-etape1" class="suivi-etape active">Etape 1</label>
			<label id="suivi-etape2" class="suivi-etape">Etape 2</label>
			<label id="suivi-etape3" class="suivi-etape">Etape 3</label>
			<hr class="separation-form"/>
		</div>
		<div class="form-mid">
			<form>
				<ul>
					<li><label for="genre">Choix du graphique </label></li>
					<li>
						<select id="choixGraphique" name="genre">
							<option id="lol" graphId="xD">Choix du graphique</option>
						<c:forEach var="listegraphique" items="${listeGraphique}">
							<option graphId="${listegraphique.idGraphique}"> ${listegraphique.libelleGraphique} </option>
						</c:forEach>
						</select></li>
				</ul>
				<ul>
					<li><label for="genre">Genre </label></li>
					<li>
						<select id="genre" name="genre">
							<option> Genre </option>
							<option> Genre 1 </option>
							<option> Genre 2 </option>
						</select></li>
				</ul>
				
			</form>
		</div>
		<div class="form-inf">
			<div class="next">
				<a id="nextto2" class="fleche-next">
					<label>Suivant</label>
					<span class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
			
		</div>
	</div>
	<div id="form2" class="fenetre-form panel panel-default">
		<div class="form-sup">
			<a class= "fermeture-fenetre closeForm"> <span class="glyphicon glyphicon-remove"></span></a>
			<br/>
			<label id="suivi-etape1" class="suivi-etape">Etape 1</label>
			<label id="suivi-etape2" class="suivi-etape active">Etape 2</label>
			<label id="suivi-etape3" class="suivi-etape">Etape 3</label>
			<hr class="separation-form"/>
		</div>
		<div class="form-mid">
			<form>
				<ul>
					<li><label for="type">Genre </label></li>
					<li>
						<select id="type" name="type">
							<option> Type </option>
							<option> Type 1 </option>
							<option> Type 2 </option>
						</select></li>
				</ul>
				
			</form>
		</div>
		<div class="form-inf">
			<div class="previous">
				<a id="previousto1" class="fleche-previous">
					<span class="glyphicon glyphicon-chevron-left"></span>
					<label>Précédent</label>
				</a>
			</div>
			<div class="next">
				<a id="nextto3" class="fleche-next">
					<label>Suivant</label>
					<span class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
		</div>
	</div>
		<div id="form3" class="fenetre-form panel panel-default">
		<div class="form-sup">
			<a class= "fermeture-fenetre closeForm"> <span class="glyphicon glyphicon-remove"></span></a>
			<br/>
			<label id="suivi-etape1" class="suivi-etape">Etape 1</label>
			<label id="suivi-etape2" class="suivi-etape">Etape 2</label>
			<label id="suivi-etape3" class="suivi-etape active">Etape 3</label>
			<hr class="separation-form"/>
		</div>
		<div class="form-mid">
			<form>
				<ul>
					<li><label for="genre">Genre </label></li>
					<li>
						<select id="genre" name="genre">
							<option> Genre </option>
							<option> Genre 1 </option>
							<option> Genre 2 </option>
						</select></li>
				</ul>
				<ul>
					<li><label for="type">Genre </label></li>
					<li>
						<select id="type" name="type">
							<option> Type </option>
							<option> Type 1 </option>
							<option> Type 2 </option>
						</select></li>
				</ul>
			</form>
		</div>
		<div class="form-inf">
			<div class="previous">
				<a id="previousto2" class="fleche-previous">
					<span class="glyphicon glyphicon-chevron-left"></span>
					<label>Précédent</label>
				</a>
			</div>
			<div class="next">
				<a id="nexttoend" class="fleche-next">
					<label>Terminer</label>
					<span class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>	
		</div>
	</div>
</body>
</html>