
function validate()
{
    
    mobNo=$("#mobNo").val();
    name=$("#name").val();
    bglist=$("#list").val();
    date=$("#datepicker").val();
    city=$('#city').val();
    success=true;
    
    if(mobNo==""||name==""||bglist==""||date==""||city=="")
    {
        
        $("#sp1").text("This field is required.").css("color","red");
         $("#sp2").text("This field is required.").css("color","red");
          $("#sp3").text("This field is required.").css("color","red");
           $("#sp4").text("This field is required.").css("color","red");
            $("#sp5").text("This field is required.").css("color","red");
        success=false;
    }
   
    return success;         
}

$(document).ready(function()
{
    var x=document.getElementById("mobNo");
		x.onkeypress=function(e){
							if(e.charCode>=48 && e.charCode<=57)
							{
								var s=document.getElementById("sp1");
								s.innerHTML="";
								return true;
							}
							else
							{
								var s=document.getElementById("sp1");
								s.innerHTML="Only digits are allowed!";
								s.style.color="yellow";
								return false;
							}
		};
    
    var y=document.getElementById("name");
		y.onkeypress=function(y){
							if(y.charCode==32 ||( y.charCode>=65 && y.charCode<=90) || (y.charCode>=97 && y.charCode<=122))
							{
								var s=document.getElementById("sp2");
								s.innerHTML="";
								return true;
							}
							else
							{
								var s=document.getElementById("sp2");
								s.innerHTML="No special characters are allowed";
								s.style.color="#33ffbb";
								return false;
							}
		};
});

