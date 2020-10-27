public class Empwage {

         public static void main(String args[]){

                 System.out.println("welcome to employee wage computation");
                 int isfulltime = 1;
                 int isPartTime = 2;
                 int wagePerHr = 20;
                 int noOfWorkinDays = 20;
                 int wage=0;
                  int totalwage=0;

                 for (int day=1; day<=20; day++) {
                 double empcheck = Math.floor(Math.random() *10) % 3;
                  int value = (int)Math.round(empcheck); 
  
                 switch (value) {
                 case 0:
                    wage = 8 * 20 ;

                   System.out.println("employee is present");
                  
         

                    break;               
                  case 1:
                   wage = 4*20;
                   System.out.println("employee is present for half time");

                    break;
                 case 2:
                  System.out.println("employee is absent");
                 
                   break;
            }
           totalwage= wage + totalwage;

        }
            System.out.println("total salary is" +totalwage);

         }
}
