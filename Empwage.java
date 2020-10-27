public class Empwage {

      public static void main(String args[]){

                 System.out.println("welcome to employee wage computation");
                 int isfulltime = 1;
                 int isPartTime = 2;
                 int wagePerHr=20;
                 double empcheck = Math.floor(Math.random() *10) % 3;
                 if (empcheck == isfulltime) {
                  int empHrs = 8;
                  System.out.println("employee is present");
                 
                  }
                  else if (empcheck == isPartTime){
                  int empHrs = 4;
                  System.out.println("employee is present for half time");
                  }

                  else {
                  System.out.println("employee is absent");

            }

                  double salary = empHrs * wagePerHr;

                  System.out.println("salary" +salary);
         }

}
