var User = Object.create({
	classtyle:["bg-primary","bg-warning","bg-success","bg-danger"],
	initclass:function(){
		
		$( ".move" ).draggable({ cursor: "hand"});
//		$('.card').draggable({
//			cursor: "move",
//			cursor: "pointer",
//		});
	},
	loadUsers:function(){
		
		ObjectRequest.requestByAjaxJSON("https://retain.herokuapp.com/toapply/findallUsers", null, function(response){
			debugger;
			var contador = 0;
			var renglon = 0;
			var cpintar = 0;
			$.each(response.lstResponse, function(idx0, elem){
				$("#usermain").html(elem.nameUser);
				$.each(elem.categoryListDTO, function(idx1, element){
					if(idx1==0){
						$("#categoria").html(element.description);
						$("#dinamic").append("<div class='row' id='"+renglon+"'><div>");
					}else{
						
						if(cpintar % 3 == 0){ 
							contador=0;
							renglon++;
							$("#dinamic").append("<div class='row' id='"+renglon+"'><div>");
							
						}else{
							contador++;
						}
						var html ="<div class='col-xl-3 col-sm-6 mb-3 move' style='cursor:pointer;'>"+
			            "<div class='card text-white "+User.classtyle[contador]+" o-hidden h-100'>"+
			              "<div class='card-body'>"+
			                "<div class='card-body-icon'>"+
			                  "<i class='fab fa-leanpub'></i>"+
			                "</div>"+
			                "<div class='mr-5'>"+element.description+"</div>"+
			              "</div>"+
			            "</div>"+
			          "</div>";
						$("#"+renglon).append(html);
						cpintar ++;
					}
				});
				User.initclass();
			});
			
			
			
		}, function(dataError){
			debugger;
		}, true);
		
		
	},
	
	
});

$(document).ready(function(){
	User.loadUsers();
	
});