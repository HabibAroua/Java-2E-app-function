<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
      <head>
           <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
           <title>Form</title>
      </head>
      <body>
            <div class="container">
                  <div class="title">Add a passanger</div>
                  <fieldset>
                         <legend>Passenger detail</legend>
                         <form action="AddPassenger" method="post">
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
                                  <input type="text" name="date_birth" id="date_brith"></input>
                             </div>
                             <div class="inputField">
                                  <label for="gender" class="inputLabel">Gender :</label>
                                  <select name="gender" id="gender">
                                          <option>Man</option>
                                          <option>Woman</option>
                                  </select>
                             </div>
                         </form>
                  </fieldset>
                  <div class="inputField">
                        <input type="submit" id="submitBtn" value="Add new passanger" ></input>
                  </div>
             </div>
      </body>
</html>