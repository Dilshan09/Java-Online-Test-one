import java.util.Scanner;//import scanner class

public class RoomChargeCalculator {
		  
	  int amount = 0 ,amount1 = 0,amount2 = 0 ,amount3 = 0 ,amount4 = 0 ; //Assign amounts default value as 0

	  public float getChargeDeluxDouble(boolean balcony,boolean parking,boolean tv,boolean kitchen,boolean wifi){
	    	  
          
	    	                            // collect facility values
	    	     if(balcony==true  ) {

	    		  amount = amount + 500;  	
	    	      }
	    	     if(parking==true ) {
		  	    	
	    		  amount1 = amount1 + 200;
		    	  }
	    	     if(tv==true ) {
		  	    	
		    	  amount2 = amount2 + 200;
		    	  }	
	    	     if(kitchen==true ) {
			  	    	
		    	  amount3 =amount3 +  1000;
		    	  }	
	    	     if(wifi==true ) {
			  	    	
		    	  amount4 =amount4 + 100;
		  	    	
		   	      }
		   	 
	    	     return(amount +amount1 +amount2 +amount3 +amount4 + 5000); //collected facility values add to the 5000 fixed value
	    	  
}
	  
	  public float getChargeStandardFamily(boolean parking,boolean kitchen,boolean garden){
	    	  
		                                // collect facility values
		    	  if(parking == true ) {
		  	    	
	    		  amount = amount+ 200;
		    	  }
		    		
		    	  if(kitchen ==true ) {
			  	    	
		    	  amount1 = amount1+ 1000;
		    	  }	
		    	  if(garden == true) {
			  	    	
		    	  amount2 = amount2+ 100;
		  	    	
		   	      }
		   	 
		    	  return(amount +amount1 +amount2 + 3000);//collected facility values add to the 3000 fixed value
	    		  
}
	  
	  public float getChargeStandardSingle(boolean parking, boolean ac , boolean wifi){
    
		                               // collect facility values
		    	  if(parking == true) {
		  	    	
	    		  amount = amount+ 200;
		    	  }
		    	  	
		    	  if(ac == true) {
			  	    	
		    	  amount1 = amount1+ 1000;
		    	  }	
		    	  if(wifi == true) {
			  	    	
		    	  amount2 = amount2+ 100;
		  	    	
		   	      }
		   	 
		    	  return(amount +amount1 +amount2 + 2000);	//collected facility values add to the 2000 fixed value    		  
}
	  	public static void main(String[]args) {
				
	  		   boolean balcony,parking,tv,kitchen,wifi,garden,ac;    //Scanner objects
			   int choice;
	  		
	           Scanner scc = new Scanner(System.in);  //Make a scanner 
	           
			   RoomChargeCalculator room =  new RoomChargeCalculator();   //Make a main object as room
			   
 
			    System.out.println("\nRoom Charge Calculator");
			    System.out.println("\n1. Delux-Double\n2. Standard-Family\n3. Standard-Single\n4. Quit");
			    
			    System.out.print("\nEnter your choice (1-4):");                 //User instructions
			    choice = scc.nextInt();
			    
			    if(choice == 1) {
			    	
				    System.out.print("\n!!Use true and fales to give your choises when displaying the facility points!!\n\n");

			    	  System.out.print("Do you want balcony facility :");
			          balcony = scc.nextBoolean();
					  System.out.print("Do you want parking facility :");
					  parking = scc.nextBoolean();
			    	  System.out.print("Do you want tv facility :");
			    	  tv = scc.nextBoolean();
				      System.out.print("Do you want kitchen facility :");
				      kitchen = scc.nextBoolean();
				      System.out.print("Do you want wifi facility :");
				      wifi = scc.nextBoolean();
				      System.out.print("\n\nYour total amount :"+room.getChargeDeluxDouble(balcony, parking, tv, kitchen, wifi));
				      
			    	  //Using made object call to the matching method 
			    }
                if(choice == 2) {
                	
    			    System.out.print("\n!!Use true and fales to give your choises when displaying the facility points!!\n\n");

                	  System.out.print("Do you want parking facility :");
            		  parking = scc.nextBoolean();
            	      System.out.print("Do you want kitchen facility :");
            	      kitchen = scc.nextBoolean();
            	      System.out.print("Do you want garden facility :");
            	      garden = scc.nextBoolean();
			  	
            	      System.out.print("\n\nYour total amount :"+room.getChargeStandardFamily(parking, kitchen, garden));
            	      
			    	  //Using made object call to the matching method 


			    }
                if(choice == 3) {
	
    			    System.out.print("\n!!Use true and fales to give your choises when displaying the facility points!!\n\n");

                	 System.out.print("Do you want parking facility :");
           		     parking = scc.nextBoolean();
               	     System.out.print("Do you want ac facility :");
               	     ac = scc.nextBoolean();	 
           	         System.out.print("Do you want wifi facility :");
           	         wifi = scc.nextBoolean();
           	      
           	        System.out.print("\n\nYour total amount :"+room.getChargeStandardSingle(parking, ac, wifi));
           	        
			    	//Using made object call to the matching method 

                }
	             if(choice == 4) {
	                
	            	 System.out.print("Quite.");
	            }
	             if(choice != 1 && choice != 2 && choice != 3 && choice != 4) {
		                
	            	 System.out.print("\n\nIt is a wrong input!!");
	            }
}
}
