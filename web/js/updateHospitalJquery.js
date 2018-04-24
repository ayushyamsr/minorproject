
function updatevalidate()
{
    
    mobNo=$("#mobNos").val();
   
    date=$("#datepickers").val();

    success=true;
    
    if(mobNo==""||date=="")
    {
        
        $("#sp6").text("This field is required.").css("color","red");
        $("#sp7").text("This field is required.").css("color","red");
         
        success=false;
    }
   
    return success;         
}

$(document).ready(function()
{var x=document.getElementById("mobNos");
		x.onkeypress=function(e){
							if(e.charCode>=48 && e.charCode<=57)
							{
								var s=document.getElementById("sp6");
								s.innerHTML="";
								return true;
							}
							else
							{
								var s=document.getElementById("sp6");
								s.innerHTML="Only digits are allowed!";
								s.style.color="#33ffbb";
								return false;
							}
		};
});

