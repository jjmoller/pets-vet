
/* Johann Juan Moller
   217131794
   Group 1A 
 */

public class AnimalClsMollerJJ {

String type;
protected char sex;
int birthYear;
double weight;
	
	
AnimalClsMollerJJ(){
	
type = "XXXXX";
sex = 'X';
birthYear = 0;
weight = 0;
}

void setType(String inType){
	type = inType;	
}

String getType(){
	return type;
}

void setSex(char inSex){
	sex = inSex;
}

char getSex(){
	return sex;
}

void setBirthYear(int inBirthYear){
	birthYear = inBirthYear;
}

int getBirthYear(){
	return birthYear;
}

void setWeight(double inWeight){
	weight = inWeight;
}

double getWeight(){
	return weight;
}

 void displayDetails(){
	
System.out.println("Type:             "+type);
System.out.println("Sex:              "+sex);
System.out.println("Birth Year:       "+birthYear);
System.out.println("Weight(Kg):       "+weight);	
}


}
