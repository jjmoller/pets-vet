
/* Johann Juan Moller
   217131794
   Group 1A 
 */

public class PatientClsMollerJJ extends AnimalClsMollerJJ {

String ownerName;
long ownerTel;
String petName;
double accBal;
	


PatientClsMollerJJ(){
ownerName="XXXXX";
petName="XXXXX";
ownerTel = 0;
accBal = 0;
}

void setOwnerName(String inOwnerName){
	ownerName = inOwnerName;
}

String getOwnerName(){
	return ownerName;
}

void setOwnerTel(long inOwnerTel){
	ownerTel = inOwnerTel;
}

long getOwnerTel(){
	return ownerTel;
}

void setPetName(String inPetName){
	petName = inPetName;
}

String getPetName(){
	return petName;
}
void setAccBal(double inAccBal){
	accBal = inAccBal;
}

double getAccBal(){
	return accBal;
}

void displayDetails(){
	
	super.displayDetails();
	System.out.println("Owner Name:       "+ownerName);
	System.out.println("Pet Namme:        "+petName);
	System.out.println("Owner Telephone:  "+ownerTel);
	System.out.println("Account Balance:  R"+accBal+"\n");
	
}


}
