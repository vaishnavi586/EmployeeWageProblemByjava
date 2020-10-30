public class Empwage {
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static void wage(String company, int EMP_RATE_PER_HOUR, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS) {
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
int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
System.out.println("total employee wage of company" +company+ " is" +totalEmpWage);

}


public static void main(String[] args) {

wage( "DMART", 20, 100, 20);
wage( "jiomart", 15, 90, 15);


}

}




