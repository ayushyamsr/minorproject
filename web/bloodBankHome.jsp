<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>bloodBankHome</title>
  <link rel="icon" href="./img/icon.jpg" type="image/png" >
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/bootstrap.css">
  <link rel="stylesheet" href="css/style.css">
  <script src="js/bloodBankValidation.js"></script>
   <script>
      
      function preventBack()
      {
          window.history.forward();
      }
      setTimeout("preventBack()",0);
      window.onload=function(){
          null
      };
  </script>
</head>
<body id="home">
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
    <div class="container">
    
	  <span class="navbar-brand text-warning" style="font-size:30px;">Welcome </span>
	  
          <span class="navbar-brand" style="font-size:25px"> <%=session.getAttribute("bloodBankName")%></span>

      <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav ml-auto">
		  
          <li class="nav-item">
            <a href="index.html"><button class="btn btn-danger"> Logout</button></a>
          </li>
        </ul> 	
     </div>
    </div>
  </nav>
  
  
<header id="home-section" style="background-image:url('./img/BloodBank.jpg'); min-height: 700px">
    <div class="dark-overlay">
      <div class="home-inner">
        <form action="BloodBankController" method="post" onclick="return(validate())">
        <div class="container">
          <div class="row">
            
                <div class="col md-3 align-left">
                    <h3>
                    <label class="btn btn-info" style="width:100px;"> O+ </label>
                    </h3>
                    <input type="number" class="form-control" id="Qty1" placeholder="Quantity" name="Opos" required><br>
                    <span id="sp1"></span>
                    <br>
                    <h3>
                    <label class="btn btn-info" style="width:100px;"> O- </label>
                    </h3>
                    <input type="number" class="form-control" id="Qty2" placeholder="Quantity" name="Oneg" required>
                    <span id="sp2"></span>
                    <br>
		</div>
			
		<div class="col md-3 align-left">
				
                    <h3>
                        <label class="btn btn-info" style="width:100px;"> A+ </label>
                    </h3>
                    <input type="number" class="form-control" id="Qty3" placeholder="Quantity" name="Apos" required><br>
                    <span id="sp3"></span><br>
                    <h3>
                        <label class="btn btn-info" style="width:100px;"> A- </label>
                    </h3>
                    <input type="number" class="form-control" id="Qty4" placeholder="Quantity" name="Aneg" required>
                    <span id="sp4"></span><br>
                </div>
			
		<div class="col md-3 align-left">
				
                        <h3>
                            <label class="btn btn-info" style="width:100px;"> B+ </label>
			</h3>
                        <input type="number" class="form-control" id="Qty5" placeholder="Quantity" name="Bpos" required><br>
			<span id="sp5"></span><br>
                        <h3>
                            <label class="btn btn-info" style="width:100px;"> B- </label>
			</h3>
                        <input type="number" class="form-control" id="Qty6" placeholder="Quantity" name="Bneg" required>
			<span id="sp6"></span>	<br>		
                </div>
			
		<div class="col md-3 align-left">
			<h3>
                            <label class="btn btn-info" style="width:100px;"> AB+ </label>
			</h3>
			<input type="number" class="form-control" id="Qty7" placeholder="Quantity" name="ABpos" required><br>
			<span id="sp7"></span><br>
                        <h3>
                            <label class="btn btn-info" style="width:100px;"> AB- </label>
                        </h3>
			<input type="number" class="form-control" id="Qty8" placeholder="Quantity" name="ABneg" required>
			<span id="sp8"></span>	<br>
		</div>
		<br><br>
		
              
	</div>
                
</div>          
                
                
                <div class=" mt-5" align="center">
		<input type="submit" class="btn btn-success" style="text-align:center; width:100px; margin:auto;" >
		</div>
                
        </form>
</div>
       <!-- <h6 class="float-right">Last Updated:<%=new  java.util.Date() %></h6>-->
 </header>
  
  
  
  
  
  
  
  
  
  
  
  
  
    <!-- MAIN FOOTER -->
  <footer id="main-footer" class="bg-dark">
    <div class="container">
      <div class="row">
        <div class="col text-center">
          <div class="py-4">
            <h1 class="h3">Find Your Blood</h1>
            <p>Minor Project &copy; 2017-18</p>
            <!--<button class="btn btn-primary" data-toggle="modal" data-target="#contactModal">Contact Us</button>-->
          </div>
        </div>
      </div>
    </div>
	
	
  </footer>
 <script src="js/jquery.min.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
  </body>
  </html>