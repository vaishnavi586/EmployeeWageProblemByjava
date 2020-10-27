public class Empwage {

       void main(String args[]){

                 System.out.println("welcome to employee wage computation");
                 int isfulltime = 1;
                 int isPartTime = 2;
                 int wagePerHr=20;
                 double empcheck = Math.floor(Math.random() *10) % 3;
                  int value = (int)Math.round(empcheck); 
  
                 switch (value) {
                 case 0:
                   int empHrs = 8;
                   System.out.println("employee is present");
                  
         

                    break;               
                  case 1:
                   int empHrs = 4;
                   System.out.println("employee is present for half time");

                    break;
                 case 2:
                  System.out.println("employee is absent");
                 
                   break;
            }
               double salary = empHrs * wagePerHr;
                     System.out.println("salary" +salary);


         }
}
