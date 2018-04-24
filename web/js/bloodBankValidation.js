/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validate()
{
    
    var Opos=$("#Qty1").val();
    var Oneg=$("#Qty2").val(); 
    var Apos=$("#Qty3").val();
    var Aneg=$("#Qty4").val();
    var Bpos=$("#Qty5").val();
    var Bneg=$("#Qty6").val(); 
    var ABpos=$("#Qty7").val();
    var ABneg=$("#Qty8").val();
    var success=true;
    
    if(Opos=="")
    {
        
        $("#sp1").text("This field is Required").css("color","red");
        success=false;
    }
    if(Oneg=="")
    {
        $("#sp2").text("This field is Required").css("color","red");
        success=false;
    }
    if(Apos=="")
    {
        
        $("#sp3").text("This field is Required").css("color","red");
        success=false;
    }
    if(Aneg=="")
    {
        $("#sp4").text("This field is Required").css("color","red");
        success=false;
    }
    if(Bpos=="")
    {
        
        $("#sp5").text("This field is Required").css("color","red");
        success=false;
    }
    if(Bneg=="")
    {
        $("#sp6").text("This field is Required").css("color","red");
        success=false;
    }
    if(ABpos=="")
    {
        
        $("#sp7").text("This field is Required").css("color","red");
        success=false;
    }
    if(ABneg=="")
    {
        $("#sp8").text("This field is Required").css("color","red");
        success=false;
    }
    return success;         
}
/*
$(document).ready(function()
{
    
   $("#qty1").keypress(function(){
        $("#sp1").text("");
    });
   $("#qty2").keypress(function(){
        $("#sp2").text("");
    });
     $("#qty3").keypress(function(){
        $("#sp3").text("");
    });
     $("#qty4").keypress(function(){
        $("#sp4").text("");
    });
     $("#qty5").keypress(function(){
        $("#sp5").text("");
    });
     $("#qty6").keypress(function(){
        $("#sp6").text("");
    });
     $("#qty7").keypress(function(){
        $("#sp7").text("");
    });
     $("#qty8").keypress(function(){
        $("#sp8").text("");
    });
});*/