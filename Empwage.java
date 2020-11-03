import java.util.ArrayList;
import java.util.HashMap;
interface IEmpwage
{
    public void addCompany(String companyname, int EMPRATEPERHOUR, int MAXHRSINMONTH, int NUMOFWORKINGDAYS);

    public void wage();

}

class CompanyEmpWage{
final String company;
final int EMP_RATE_PER_HOUR;
final int MAX_HRS_IN_MONTH;
final int NUM_OF_WORKING_DAYS;
int totalEmpWage;
CompanyEmpWage(String companyname, int EMPRATEPERHOUR, int MAXHRSINMONTH, int NUMOFWORKINGDAYS) {
company = companyname;
EMP_RATE_PER_HOUR =  EMPRATEPERHOUR;
MAX_HRS_IN_MONTH = MAXHRSINMONTH;
NUM_OF_WORKING_DAYS = NUMOFWORKINGDAYS;
}
void setTotalEmpWage(int totalEmpWage) {
   this.totalEmpWage = totalEmpWage;
}
@Override
public String toString() {
return "total employee wage of company" +company+ " is" +totalEmpWage;
}
}

class Empwage implements IEmpwage {
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME =2;
int noofcompanies, index;
ArrayList<CompanyEmpWage> companyEmpWageArray;
HashMap<String,Integer> companyToEmpWageMap;
public Empwage()

{
companyEmpWageArray= new ArrayList<>();
companyToEmpWageMap = new HashMap<>();

}


public void addCompany(String companyname, int EMPRATEPERHOUR, int MAXHRSINMONTH, int NUMOFWORKINGDAYS) {
CompanyEmpWage company = new CompanyEmpWage( companyname, EMPRATEPERHOUR, MAXHRSINMONTH, NUMOFWORKINGDAYS);
companyEmpWageArray.add(company);
companyToEmpWageMap.put(companyname,0);
}

int getworkhrs()
{

int empCheck = (int) Math.floor(Math.random() * 10) % 3;
switch (empCheck) {
case IS_PART_TIME:
   return 4;

case IS_FULL_TIME:
  return 8;

default:
   return 0;
}
}
 public void wage() {
for ( CompanyEmpWage company : companyEmpWageArray)
{
 int totalWage = wage(company);
  company.setTotalEmpWage(totalWage);
  System.out.println(company);

}
}


int wage(CompanyEmpWage companyEmpWage) {
System.out.println("Computation of total wage of " + companyEmpWage.company + " employee");
System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
       
       

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.NUM_OF_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_HRS_IN_MONTH; day++, totalWorkingHrs += workingHrs)
        {
            workingHrs = getworkhrs();
            int wage = workingHrs *companyEmpWage.EMP_RATE_PER_HOUR;
            totalWage += wage;
             System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        companyToEmpWageMap.put(companyEmpWage.company, totalWage);
        return totalWage;
    }

void displaycompanyToEmpWageMap()
{
for (String companyname : companyToEmpWageMap.keySet())
{
   System.out.println(companyname+":"+companyToEmpWageMap.get(companyname));
}
}

public static void main(String[] args) {
Empwage obj = new Empwage();
obj.addCompany( "DMART", 20, 100, 20);
obj.addCompany( "jiomart", 15, 90, 15);
obj.wage();
obj.displaycompanyToEmpWageMap();
}

}


