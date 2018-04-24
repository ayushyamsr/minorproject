<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>hospitalHome</title>
  <link rel="icon" href="./img/icon.jpg" type="image/png" >
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/bootstrap.css">
  <link rel="stylesheet" href="css/style.css">
  <script src="js/jquery.min.js"></script>
  <script src="jquery-ui/jquery-ui.js"></script>
  <link href="jquery-ui/jquery-ui.css" rel="stylesheet">
  <script src="js/hospitalJquery.js"></script>
  <script src="js/updateHospitalJquery.js"></script>
   <script>
    $( function() {
    $( "#datepicker" ).datepicker({minDate:'-30D',maxDate:'+0D'});
    $( "#datepickers" ).datepicker({maxDate:'+0D'});
  } );
  

  </script>

</head>
<body id="home">
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
    <div class="container">
    
	  <span class="navbar-brand text-warning" style="font-size:30px;">Welcome </span>
	  
          <span class="navbar-brand" style="font-size:25px"> <%=session.getAttribute("hospName")%></span>

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
  
  
  <!-- HOME SECTION -->
  <header id="home-section" style="background-image:url('./img/hospital.jpeg')  ;min-height: 1500px;">
    <div class="dark-overlay">
      <div class="home-inner">
        <div class="container">
          <div class="row">
		  
            <!-- ADD DONOR CARD-->

			<div class="col-xl-4 " style="opacity:0.9;">
              <div class="card bg-info text-center card-form mb-4">
                <div class="card-body">
                  <h3 class="align-center">Add Donors</h3>
                  <p>Please fill out this form to add </p>
                  <form action="HospitalController" method="post" onclick="return(validate())" name="addForm">
                    <div class="form-group">
                        <input type="text" class="form-control form-control-lg" placeholder="Mobile no." maxlength="10" id="mobNo" name="mobNos">
                        <span id="sp1"></span>
                    </div>
                        <div class="form-group" >
                      <input type="text" class="form-control form-control-lg " placeholder="Name" id="name" name="userName">
                      <span id="sp2"></span>
                    </div>
                    <div class="form-group">
                        <select class="form-control form-control-lg" placeholder="Blood Group" name="bglist" id="list">
			
                          
                            <option value="Opos">O+</option>
                            <option value="Oneg">O-</option>
                            <option value="Apos">A+</option>
                            <option value="Aneg">A-</option>
                            <option value="Bpos">B+</option>
                            <option value="Bneg">B-</option>
                            <option value="ABpos">AB+</option>
                            <option value="neg">AB-</option>
                        </select>
                        <span id="sp3"></span>
                    </div>
                    
                    <div class="form-group" >
                      <input type="text" class="form-control form-control-lg  disabled" readonly="readonly" placeholder="Date" id="datepicker" name="dates">
                      <span id="sp4"></span>
                    </div>
                    <div class="form-group">
                      <input type="text" class="form-control form-control-lg" placeholder="City" id="city" name="city">
                      <span id="sp5"></span>
                    </div>
                    <input type="submit" class="btn btn-dark btn-block" name="addDonor">
                  </form>
                </div>
              </div>
            </div>
			<!-- UPDATE DONOR CARD-->
			
	    <div class="col-xl-4 " style="opacity:0.9;">
              <div class="card bg-info text-center card-form mb-4">
                <div class="card-body">
                  <h3 class="align-center">Update Donors Detail</h3>
                  <p>Please fill out this form to update </p>
                  <form action="UpdateHospitalController" method="post" name="update" onclick="return(updatevalidate())">
                    <div class="form-group">
                        <input type="text" class="form-control form-control-lg"  placeholder="Mobile no." id="mobNos" name="mobNo"  maxlength="10">
                      <span id="sp6"></span>
                    </div>
                      
                    <div class="form-group">
                      <input type="text" class="form-control form-control-lg" readonly="readonly" placeholder="Date" id="datepickers" name="date">
                      <span id="sp7"></span>
                    </div>
                      

                    <input type="submit" class="btn btn-dark btn-block" name="updateSubmit">
                  </form>
                </div>
              </div>
            </div>
			
			
						
				<!--SEARCH FOR DONOR -->
				
				
            <div class="col-xl-4 ">
              <div class="card bg-info text-center card-form mb-4">
                <div class="card-body">
                  <h3 class="align-center">Search for blood</h3>
                  <p>Please fill out these first</p>
                  <form action="SearchDonorController" method="post" name="searchForm" onclick="return(searchvalidate())">
                    <div class="form-group">
                      <select class="form-control form-control-lg" placeholder="Blood Group" name="searchbglist">
                            
                            <option value="Opos">O+</option>
                            <option value="Oneg">O-</option>
                            <option value="Apos">A+</option>
                            <option value="Aneg">A-</option>
                            <option value="Bpos">B+</option>
                            <option value="Bneg">B-</option>
                            <option value="ABpos">AB+</option>
                            <option value="ABneg">AB-</option>
                        </select>
                    </div>
                    <div class="form-group">
                      <input type="text" class="form-control form-control-lg" placeholder="City" name="searchcity">
                      <span id="sp8"></span>
                    </div>
                    <input type="submit" class="btn btn-dark btn-block" name="searchDonor">
                  </form>
                </div>
              </div>
            </div>
			
			
          </div>
        </div>
      </div>
    </div>
  </header>


  
  
  
  
  <!-- MAIN FOOTER -->
  <footer id="main-footer" class="bg-dark pt-5">
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

  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
  </body>
  </html>