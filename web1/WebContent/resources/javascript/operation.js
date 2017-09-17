$(document).ready
(
		function()
        {
			$("#submitBtn").click
            (
            		function()
        		    {
            			var firstName=document.getElementById("first_name").value;
        			    var lastName=document.getElementById("last_name").value;
        			    var dateBirth=document.getElementById("my_date").value;
        				if((firstName=="")&&(lastName=="")&&(dateBirth==""))
        				{
        					alert(firstName+" "+lastName+" "+dateBirth);
            			    var url = $(this).prop('href');
            			    $("#submitBtn").load(url);
            			    event.preventDefault();
        				    $("#all").show();
        				}
        				else
        			    {
        					if(firstName=="")
							{
        						$("#submitBtn").load(url);
     			                event.preventDefault();
 							    $("#name").show();
							}
        			    }
        							   		 
        		    }
        	);
        }
 );