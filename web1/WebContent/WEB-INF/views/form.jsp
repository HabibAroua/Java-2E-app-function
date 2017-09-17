<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
      <head>
           <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
           <title>Form</title>
           <link rel="stylesheet" href="resources/css/theme.css">
           <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
      </head>
      <body>
           <script src="resources/javascript/jquery.js"></script>
           <script src="resources/javascript/init.js"></script>
           <script src="resources/javascript/operation.js"></script>

            <div class="container">
           
            	<div class="alert alert-warning" id="all"> 
            	
            	      All values are empty
                </div> 
            
            	<div class="alert alert-warning" id="birth">
            	    Your date of birth is empty
            	</div>

            	<div class="alert alert-warning" id="name">
            	     Your first name is empty
            	</div>
            	
            	<div class="alert alert-warning" id="last">
            	     Your last name is empty
            	</div>

                <div class="alert alert-success" id="succes">
                    You are enrolled to my web site
                </div>

                  <div class="title">Add a passanger</div>
                  <fieldset>
                         <legend>Passenger detail</legend>
                         <form  method="post">
                             <div class="inputField">
                                  <label for="first_name" class="inputLabel">First name :</label>
                                  <input type="text" name="first_name" id="first_name"></input>
                             </div>
                             <div class="inputField">
                                  <label for="last_name" class="inputLabel">Last name :</label>
                                  <input type="text" name="last_name" id="last_name"></input>
                             </div>
                             <div class="inputField">
                                  <label for="date_birth" class="inputLabel">Birth date :</label>
                                  <input type="text" name="date_birth" id="my_date"></input>
                             </div>
                             <div class="inputField">
                                  <label for="gender" class="inputLabel">Gender :</label>
                                  <select name="gender" id="gender">
                                          <option>Male</option>
                                          <option>Female</option>
                                  </select>
                             </div>
                             <div class="inputField">
                                  <input type="submit" id="submitBtn" value="Add new passanger"  ></input>
                             </div>
                         </form>
                  </fieldset>
                  
             </div>
      </body>
</html>