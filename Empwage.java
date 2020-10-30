public class Empwage {
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
private final String company;
private final int EMP_RATE_PER_HOUR;
private final int MAX_HRS_IN_MONTH;
private final  int NUM_OF_WORKING_DAYS;
private int totalEmpWage;

public Empwage(String company, int EMP_RATE_PER_HOUR, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS) {
this.company = company;
this.EMP_RATE_PER_HOUR =  EMP_RATE_PER_HOUR;
this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
}
public void wage() {
int empHrs = 0; int totalEmpHrs = 0;
 int totalWorkingDays = 0;
while (totalEmpHrs <= MAX_HRS_IN_MONTH &&  totalWorkingDays < NUM_OF_WORKING_DAYS) {
totalWorkingDays++;

int empCheck = (int) Math.floor(Math.random() * 10) % 3;
switch (empCheck) {
case IS_PART_TIME:
   empHrs = 4;
   break;
case IS_FULL_TIME:
  empHrs = 8;
break;
default:
   empHrs = 0;
}
totalEmpHrs += empHrs;
System.out.println("Day#: " + totalWorkingDays + " totalEmpHrs: " +totalEmpHrs);

}
totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;

}

@Override
public String toString() {
return "total employee wage of company" +company+ " is" +totalEmpWage;
}
public static void main(String[] args) {

Empwage dmart=new Empwage( "DMART", 20, 100, 20);
Empwage jiomart=new Empwage( "jiomart", 15, 90, 15);
dmart.wage();
System.out.println(dmart);
jiomart.wage();
System.out.println(jiomart);

}

}




