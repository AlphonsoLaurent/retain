var User = Object.create({ 
	loadUsers:function(){
		debugger;
		ObjectRequest.requestByAjaxJSON("https://retain.herokuapp.com/toapply/findallUsers", null, function(response){
			debugger;
			
			$.each(response.lstResponse, function(idx0, elem){
				$("#usermain").html(elem.nameUser);
				$("#dinamic").append("<div class='row' id='"+idx0+"'><div>");
				$.each(elem.categoryListDTO, function(idx1, element){
					if(idx1==0){
						$("#categoria").html(element.description);
					}else{
						
						var html ="<div class='col-xl-3 col-sm-6 mb-3'>"+
			            "<div class='card text-white bg-primary o-hidden h-100'>"+
			              "<div class='card-body'>"+
			                "<div class='card-body-icon'>"+
			                  "<i class='fas fa-fw fa-comments'></i>"+
			                "</div>"+
			                "<div class='mr-5'>"+element.description+"!</div>"+
			              "</div>"+
			            "</div>"+
			          "</div>";
						$("#"+idx0).append(html);
					}
				});
			});
			
			
			
		}, function(dataError){
			debugger;
		}, true);
	},
	
	
});

$(document).ready(function(){
	User.loadUsers();
	
});