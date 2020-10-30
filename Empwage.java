public class Empwage {
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int NUM_OF_WORKING_DAYS = 20;
public static final int MAX_HRS_IN_MONTH = 100;

void wage() {
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
System.out.println( "total employee wage is "+totalEmpWage);

}


public static void main(String[] args) {

Empwage empobj=new Empwage();
empobj.wage();


}

}




