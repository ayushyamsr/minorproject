/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validate()
{
    
    var emailId=$("#emailId").val();
   
    var pwd=$("#password").val();
    var success=true;
    
    if(emailId=="")
    {
        
        $("#sp1").text("UserId Required").css("color","red");
        success=false;
    }
    if(pwd=="")
    {
        $("#sp2").text("Password Required").css("color","red");
        success=false;
    }
    return success;         
}

$(document).ready(function()
{
   $("#userid").keypress(function(){
        $("#sp1").text("");
    });
    $("#pwd").keypress(function(){
        $("#sp2").text("");
    });
    $("#name").keypress(function(){
        $("#sp3").text("");
    });
});

