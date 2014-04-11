

$( document).ready(function() {
    

    
	$("#showHideForm").click(function(event){
        $("#filtre").fadeIn();
        $("#form1").fadeIn();
    });
	$("#nextto2").click(function(event){
        $("#form1").fadeOut();
        $("#form2").fadeIn();
    });
	$("#nextto3").click(function(event){
        $("#form2").fadeOut();
        $("#form3").fadeIn();
    });
	$("#nexttoend").click(function(event){
        $("#form3").fadeOut();
        $("#filtre").fadeOut();
    });
	$("#previousto1").click(function(event){
        $("#form2").fadeOut();
        $("#form1").fadeIn();
    });
	$("#previousto2").click(function(event){
        $("#form3").fadeOut();
        $("#form2").fadeIn();
    });
	$(".closeForm").click(function(event){
        $("#form1").fadeOut();
        $("#form2").fadeOut();
        $("#form3").fadeOut();
        $("#filtre").fadeOut();
    });
	
	var recupererDetailGraph = function(idGraph) {
		$.getJSON("detailgraphique", {
			id : idGraph
		}).done(function(graph) {
			if(graph.periode.typeperiode=="moisparmois"){
				drawChart(10);
			}
		});
	};
	
    function drawChart(a) {
        var data = google.visualization.arrayToDataTable([
          ['Year', 'Sales', 'Expenses'],
          ['2013',  a,      400],
          ['2014',  1170,      460],
          ['2015',  660,       1120],
          ['2016',  1030,      540]
        ]);

        var options = {
          title: 'Company Performance',
          hAxis: {title: 'Year',  titleTextStyle: {color: '#333'}},
          vAxis: {minValue: 0}
        };

        var chart = new google.visualization.AreaChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
    function motherfucker(){
    	drawChart(10);
    };//document.getElementById("choixGraphique").valueOf().valueOf($("[graphID]"))
	$("#nexttoend").click(function(event){
		alert($("#lol").valueOf($("[graphID]")));
	});

   
});

