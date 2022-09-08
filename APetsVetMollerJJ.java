/* Johann Juan Moller
   217131794
   Group 1A 
 */
import java.util.*;

public class APetsVetMollerJJ {

static Scanner sc = new Scanner(System.in);   //Scanner

static int input;
	
static void displayMenu(){
	System.out.println("=========================================");
	System.out.println("      WELCOME TO THE PET'S VET!          ");
	System.out.println("        (Enter a valid Option)           ");
	System.out.println("=========================================\n");
	System.out.println("OPTION 1: Create new Patient");
	System.out.println("OPTION 2: Edit Patient Details");
	System.out.println("OPTION 3: Display Patient Age");
	System.out.println("OPTION 4: Display All Patient Details");	
	System.out.println("OPTION 5: Make a Payment");	
	System.out.println("OPTION 6: EXIT\n");	
	System.out.print("Selection: ");	
}

static void displaySubMenu(){
	System.out.println("=========================================");
	System.out.println("          Edit Patient's Details         ");
	System.out.println("       (You are now in the sub-menu)     ");
	System.out.println("=========================================\n");
	System.out.println("OPTION 1: Edit pet's Type");
	System.out.println("OPTION 2: Edit pet's Sex");
	System.out.println("OPTION 3: Edit pet's Year of Birth");
	System.out.println("OPTION 4: Edit pet's Weight");	
	System.out.println("OPTION 5: Edit owner's Name");
	System.out.println("OPTION 6: Edit owner's Telephone Number");	
	System.out.println("OPTION 7: Edit pet's Name");	
	System.out.println("OPTION 8: Return");	
}


static PatientClsMollerJJ patient = new PatientClsMollerJJ();// New Object

public static void main(String[]args){                     // Main Method
		
	do{
		displayMenu();
	    input = sc.nextInt();
	    
	    while(input<1||input>6){                           // validation
	    	System.out.print("Invalid Option. Please re-enter: ");
	    	input = sc.nextInt();
	    }
	 
	  switch(input){  
	  
	  case 1:  System.out.println("=========================================");
		       System.out.println("           Load a New Patient");
		       System.out.println("=========================================\n");
		       System.out.print("Please enter the animal's Type: ");
		       String ctType = sc.next();
		       patient.setType(ctType);
		       
		       
		       System.out.print("Please enter the animal's Sex (M/F): ");
		       char ctSex = sc.next().toUpperCase().charAt(0);
	             while(ctSex!='M'&&ctSex!='F'){
	    	       System.out.println("Invalid input. Please re-enter. ");
	    	       ctSex = sc.next().toUpperCase().charAt(0);
	             }
	             patient.setSex(ctSex);
	             
	           System.out.print("Please enter animal's Birth Year: ");
	           int ctBirthYear = sc.nextInt();
	              while(ctBirthYear<2000){
	            	  System.out.println("Invalid input. Please re-enter. ");
	            	  ctBirthYear = sc.nextInt();
	              }
	              patient.setBirthYear(ctBirthYear);
	              
	           System.out.print("Please enter animal's Weight (Kg): ");
		       double ctWeight = sc.nextDouble();
		          while(ctWeight<0.1){
		            System.out.println("Invalid input. Please re-enter. ");
		            ctWeight= sc.nextDouble();
		              }
		          patient.setWeight(ctWeight);
	              System.out.println("");
	              break;
	    	   
	   case 2: do{
		       displaySubMenu();
	            
               input = sc.nextInt();	   
                 while(input<1||input>8){                           // validation
       	    	 System.out.print("Invalid Option. Please re-enter: ");
       	    	 input = sc.nextInt();
       	    } 
	        
                  switch(input){
                    
                  case 1: System.out.println("The current type is: "+patient.getType());
                          System.out.println("Enter a new Type: ");
                          ctType = sc.next();
                          patient.setType(ctType); break;
                
                  case 2: System.out.println("The current Sex is: "+patient.getSex());
                          System.out.println("Enter the new Sex(M/F): ");
                          ctSex = sc.next().toUpperCase().charAt(0);
                          while(ctSex!='M'&&ctSex!='F'){
           	    	       System.out.println("Invalid input. Please re-enter. ");
           	    	       ctSex = sc.next().toUpperCase().charAt(0);
           	               }
                          patient.setSex(ctSex); break;
                          
                  case 3: System.out.println("The current Age is: "+patient.getBirthYear());
                          System.out.println("Enter the new Year of Birth: ");
                          ctBirthYear = sc.nextInt();
                          while(ctBirthYear<2000){
   	    	              System.out.println("Invalid input. Please re-enter. ");
   	    	              ctBirthYear = sc.nextInt();
   	                      }
                          patient.setBirthYear(ctBirthYear);break;
                          
                  case 4: System.out.println("The current Weight is (Kg): "+patient.getWeight());
                          System.out.println("Enter the new Weight (Kg): ");
                          ctWeight = sc.nextDouble();
                          while(ctWeight<0.1){
   	                      System.out.println("Invalid input. Please re-enter. ");
   	                      ctWeight = sc.nextDouble();
                          }
                          patient.setWeight(ctWeight);break;
                          
                  case 5: System.out.println("The current Owner's Name is: "+patient.getOwnerName());
                          System.out.println("Enter the new Owner's Name: ");
                          String ctOwnerName = sc.next();
                          patient.setOwnerName(ctOwnerName);break;
                          
                  case 6: System.out.println("The current Owner's Telephone number: "+patient.getOwnerTel());
                          System.out.println("Enter the new Telephone number: ");
                          long ctOwnerTel = sc.nextLong();
                          patient.setOwnerTel(ctOwnerTel);break;
                          
                  case 7: System.out.println("The current Pet's Name is: "+patient.getPetName());
                          System.out.println("Enter a new Name: ");
                          String ctPetName = sc.next();
                          patient.setPetName(ctPetName);break;
                          
                  case 8: System.out.println("Editing is complete!\n");break;
                        
                  }
	           }while(input!=8);
	            break;
	   
	   case 3: System.out.println("=========================================");
               System.out.println("           Patient Name and Age");
               System.out.println("=========================================\n");
               System.out.print("Please enter the Current Year: ");              
               int ctCurrentYear = sc.nextInt();
               while(ctCurrentYear<2017||ctCurrentYear>2017){
            	   System.out.print("Invalid Year. Please re-enter:");
            	   ctCurrentYear = sc.nextInt();
               }
               System.out.println(patient.getPetName() +": "+ (ctCurrentYear - patient.getBirthYear()) + " year(s)\n");
               break;
	   
	   case 4: System.out.println("=========================================");
               System.out.println("       Display Patient's Details");  
               System.out.println("=========================================\n");
               patient.displayDetails();      
               break;                                                                                 
                           
	   case 5: System.out.println("=========================================");
               System.out.println("            Payment Screen");  
               System.out.println("=========================================\n");
               System.out.print("How much do you want to pay? R");
               int ctPayment = sc.nextInt();
               while(ctPayment<1){
            	   System.out.print("Invalid amount. Please re-enter: R");
            	   ctPayment = sc.nextInt();
               }
               System.out.println("Current Account Balance: R" + patient.getAccBal()+"\n");
               
               System.out.println("New Balance: R" + (patient.getAccBal() - ctPayment)+"\n");//??
               patient.setAccBal(patient.getAccBal() - ctPayment);
		       break;
		   
	   case 6: System.out.println("=========================================");
               System.out.println("                Good-Bye!");  
    
                       
       
               System.out.println("=========================================\n");
		       System.exit(0);
		       break;
	  }	
		
	}while(input!=6);
	
}	
	
}

/*
      ,_-~~~-,    _-~~-_
     /        ^-_/      \_    _-~-.
    |      /\  ,          `-_/     \
    |   /~^\ '/  /~\  /~\   / \_    \
     \_/    }/  /        \  \ ,_\    }
            Y  /  /~  /~  |  Y   \   |
           /   | {Q) {Q)  |  |    \_/
           |   \  _===_  /   |
           /  >--{     }--<  \
         /~       \_._/       ~\
        /    *  *   Y    *      \
        |      * .: | :.*  *    |
        \    )--__==#==__--     /
         \_      \  \  \      ,/
           '~_    | |  }   ,~'
              \   {___/   /
               \   ~~~   /
               /\._._._./\    
              {    ^^^    }
               ~-_______-~
                /       \
 */
