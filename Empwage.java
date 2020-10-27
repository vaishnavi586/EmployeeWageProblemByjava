public class Empwage {

         public static void main(String args[]){

                 System.out.println("welcome to employee wage computation");
                 int isfulltime = 1;
                 int isPartTime = 2;
                 int wagePerHr = 20;
                 int noOfWorkinDays = 20;
                   int workhrs=0;
                  int totalwage=0;
                   int totalworkdays=0;
                   int totalworkhrs=0;
                 while (totalworkhrs<100 && totalworkdays<20) {
                 totalworkdays++;
                 double empcheck = Math.floor(Math.random() *10) % 3;
                  int value = (int)Math.round(empcheck); 
  
                 switch (value) {
                 case 0:
                    workhrs=8;

                   System.out.println("employee is present");
                  
         

                    break;               
                  case 1:
                   workhrs=4;
                   System.out.println("employee is present for half time");

                    break;
                 case 2:
                  System.out.println("employee is absent");
                 
                   break;
            }
            totalworkhrs=totalworkhrs+workhrs;


        }

                 totalwage=totalworkhrs*20;
                 
                 System.out.println("totalworkhrs" +totalworkhrs);
                 System.out.println("total salary is" +totalwage);
            
         }
}
 
