public class Empwage {

      public static void main(String args[]){

                 System.out.println("welcome to employee wage computation");
                 int isfulltime = 1;
                 int wagePerHr=20;
                 int empHrs=8;
                 double empcheck = Math.floor(Math.random() *10) % 2;
                 if (empcheck == isfulltime) {
                  double salary = empHrs * wagePerHr;
                  System.out.println("employee is present");
                  System.out.println("salary" +salary);
                  }

                  else {
                  System.out.println("employee is absent");

            }
         }

}
