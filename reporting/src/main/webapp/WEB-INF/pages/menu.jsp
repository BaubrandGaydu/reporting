<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="http://www.docapost-bpo.com/">
      	<img alt="Docapost-BPO" src="./image/Logo.png" class="logo-docapost"><span class="nom-prenom-menu">Romain Baubrand</span>
      </a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav"> 
      	<li class="${pageSelectionnee == 'accueil' ? 'active' : ''} active"><a href="#">Accueil</a></li>
        <li class="${pageSelectionnee == 'creationmethode' ? 'active' : ''}"><a href="#">Cr�er une nouvelle m�thode</a></li>
        <li class="${pageSelectionnee == 'personalisation' ? 'active' : ''}"><a href="#">Personnaliser</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Statut <b class="caret"></b></a>
          <ul class="dropdown-menu">
            <li><a href="#">Utilisateur</a></li>
            <li><a href="#">Gestionnaire</a></li>
            <li><a href="#">Administrateur</a></li>
       	  </ul>
        </li>
        <li><a href="connexion">D�connexion</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>