
$(document).ready(function(){
alert("invoked");
$('#all-unchecked').hide();
$('#all-unchecked1').hide();
    var typedata=0;
    var price1=2000;
$.ajax({
	type : "POST",     
    	url : '/bin/orchardTwo/PriceFilteServlet',     
        data : {         
            Price1:typedata,
            Price2:price1
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
            var p ='';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
                        p += 'Price: ' + products[i].price + '<br>';
					}
					$(".Name").html(s);
					$(".Price").html(p);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });


<!-- unchecked  Function -->
    $('#all-unchecked').click(function(){
        if(!$('input[name="Bonsai"]').is(':checked') && !$('input[name="Cactus"]').is(':checked') && !$('input[name="Climbers"]').is(':checked') && !$('input[name="Fruit"]').is(':checked') && !$('input[name="Herb"]').is(':checked'))
        {
            $('#pricedropdown').show();
			$('#all-unchecked').hide();
            $("#allData").show();
        }else{
			alert('atleast one is checked');

        }
    });
<!-- unchecked  Function one -->
    $('#all-unchecked1').click(function(){
        if(!$('input[name="Range1"]').is(':checked') && !$('input[name="Range2"]').is(':checked') && !$('input[name="Range3"]').is(':checked') && !$('input[name="Range4"]').is(':checked') && !$('input[name="Range5"]').is(':checked'))
        {
            $('#plantdropdown').show();
			$('#all-unchecked1').hide();
            $("#allData").show();
        }else{
			alert('atleast one is checked');

        }
    });

<!-- Price Range 5  Function -->
$('input[type=checkbox][name=Range5]').click(function(){
    $('#all-unchecked1').show();
        $("#allData").hide();
        $("#plantdropdown").hide();
         $("#Range5Div").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Range5]:checked").val());
                alert("in button");
                var typedata = 1301;
                var price1=2000;
$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/PriceFilteServlet',     
        data : {         
            Price1:typedata,
            Price2:price1
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#Range5Div").html(s);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#Range5Div").hide();


            }
                });




<!-- Price Range 4  Function -->
$('input[type=checkbox][name=Range4]').click(function(){
    $('#all-unchecked1').show();
        $("#allData").hide();
        $("#plantdropdown").hide();
         $("#Range4Div").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Range4]:checked").val());
                alert("in button");
                var typedata = 901;
                var price1=1300;
$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/PriceFilteServlet',     
        data : {         
            Price1:typedata,
            Price2:price1
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#Range4Div").html(s);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#Range4Div").hide();


            }
                });






<!-- Price Range 3  Function -->
$('input[type=checkbox][name=Range3]').click(function(){
    $('#all-unchecked1').show();
        $("#allData").hide();
        $("#plantdropdown").hide();
         $("#Range3Div").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Range3]:checked").val());
                alert("in button");
                var typedata = 401;
                var price1=900;
$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/PriceFilteServlet',     
        data : {         
            Price1:typedata,
            Price2:price1
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#Range3Div").html(s);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#Range3Div").hide();

            }
                });





<!-- Price Range 2  Function -->
$('input[type=checkbox][name=Range2]').click(function(){
    $('#all-unchecked1').show();
        $("#allData").hide();
        $("#plantdropdown").hide();
         $("#Range2Div").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Range2]:checked").val());
                alert("in button");
                var typedata = 101;
                var price1=400;
$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/PriceFilteServlet',     
        data : {         
            Price1:typedata,
            Price2:price1
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#Range2Div").html(s);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#Range2Div").hide();

            }
                });





<!-- Price Range 1  Function -->
$('input[type=checkbox][name=Range1]').click(function(){
    $('#all-unchecked1').show();
        $("#allData").hide();
		 $("#plantdropdown").hide();
         $("#Range1Div").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Range1]:checked").val());
                alert("in button");
                var typedata = 0;
                var price1=100;
$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/PriceFilteServlet',     
        data : {         
            Price1:typedata,
            Price2:price1
        },     
      success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#Range1Div").html(s);
                  alert('sucess');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#Range1Div").hide();

            }
                });





<!-- Herb Function -->
$('input[type=checkbox][name=Herb]').click(function(){
     $('#all-unchecked').show();
 $("#allData").hide();
 $('#pricedropdown').hide();
         $("#HerbDiv").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Herb]:checked").val());
                alert("in button");
                var typedata = $("input[type=checkbox][name=Herb]:checked").val();

	$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/SideNavServlet',     
        data : {         
        type:typedata    
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#HerbDiv").html(s);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#HerbDiv").hide();

            }
                });


<!-- Fruit Function -->
$('input[type=checkbox][name=Fruit]').click(function(){
     $('#all-unchecked').show();
        $("#allData").hide();
 $('#pricedropdown').hide();
         $("#FruitDiv").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Fruit]:checked").val());
                alert("in button");
                var typedata = $("input[type=checkbox][name=Fruit]:checked").val();

	$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/SideNavServlet',     
        data : {         
        type:typedata    
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#FruitDiv").html(s);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#FruitDiv").hide();

            }
                });



<!-- Climbers Function -->
$('input[type=checkbox][name=Climbers]').click(function(){
     $('#all-unchecked').show();
        $("#allData").hide();
 $('#pricedropdown').hide();
         $("#ClimbersDiv").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Climbers]:checked").val());
                alert("in button");
                var typedata = $("input[type=checkbox][name=Climbers]:checked").val();

	$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/SideNavServlet',     
        data : {         
        type:typedata    
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#ClimbersDiv").html(s);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#ClimbersDiv").hide();

            }
                });



<!-- Cactus Function -->
$('input[type=checkbox][name=Cactus]').click(function(){
    $('#all-unchecked').show();
        $("#allData").hide();
	 $('#pricedropdown').hide();
         $("#CactusDiv").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Cactus]:checked").val());
                alert("in button");
                var typedata = $("input[type=checkbox][name=Cactus]:checked").val();

	$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/SideNavServlet',     
        data : {         
        type:typedata    
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#CactusDiv").html(s);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#CactusDiv").hide();

            }
                });

<!-- Bonsai Function -->
$('input[type=checkbox][name=Bonsai]').click(function(){
    $('#all-unchecked').show();
        $("#allData").hide();
		 $('#pricedropdown').hide();
         $("#BonsaiDiv").show();
            if($(this).prop("checked") == true){
            	alert($("input[type=checkbox][name=Bonsai]:checked").val());
                alert("in button");
                var typedata = $("input[type=checkbox][name=Bonsai]:checked").val();

	$.ajax({     
	type : "POST",     
    	url : '/bin/orchardTwo/SideNavServlet',     
        data : {         
        type:typedata    
        },     
        success : function(result) {
            var products = $.parseJSON(result)
            var s = '';
					for(var i = 0; i < products.length; i++) {
						s += 'Name: ' + products[i].name + '<br>';
						s += 'Price: ' + products[i].price + '<br>';
						s += '----------------------<br>';
					}
					$("#BonsaiDiv").html(s);
                  alert('success');
        },     
        error : function(XMLHttpRequest, textStatus, errorThrown) {         
        //write your logic that you need to perform on error 
           alert('error');
        } 
        });
alert("After ajax");
                }
                else if($(this).prop("checked") == false){
                console.log("Checkbox is unchecked.");
                $("#BonsaiDiv").hide();

            }
                });
          });
