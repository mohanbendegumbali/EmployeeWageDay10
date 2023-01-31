public class EmployeeWage {
    public class CompanyName{
    	
    	public static void EmployeeAttendence (String EmployeeName,String companyName,int Wage_per_hour,int Full_day_hours,int Part_time_hour) {
    		System.out.println("Employee Attendence calculation method in the -"+companyName);
    		int WorkedHours=0;
    		int employeeMOnthlySalary=0;		
    		int dailyWage = 0;
    		int Day=1;
            while((Day<=20) && (WorkedHours<100)){//her we have condition for the days and hours
            	int employeeCheck = (int) (Math.random() * 10) % 3;
                System.out.println(employeeCheck + "in the day "+Day);
                switch (employeeCheck) {
                case 1:
                	System.out.println("Employee is Present and earned "+employeeMOnthlySalary);
                    dailyWage = Wage_per_hour * Full_day_hours;
                    WorkedHours=WorkedHours+Full_day_hours;
                    break;
                case 2:
                	System.out.println("Employee is Present as part time and earned "+employeeMOnthlySalary);
                    dailyWage = Wage_per_hour * Part_time_hour;
                    WorkedHours=WorkedHours+Part_time_hour;
                    break;
                default:
                	System.out.println("Employee is Absent and earned "+employeeMOnthlySalary);
                	dailyWage = 0;
                	
                }
                Day++;
                employeeMOnthlySalary=employeeMOnthlySalary+dailyWage;
            }
            System.out.println("Working hours is -"+WorkedHours);
            System.out.println(employeeMOnthlySalary +EmployeeName +" - Earned in the month");
    	
           
    	}
    	 
    }
	public static void main(String[] args) {
		EmployeeWage.CompanyName a1=new EmployeeWage().new CompanyName();
		System.out.println("Emp1 attendence and  earnings");
		a1.EmployeeAttendence(" Mohan","X",20,8,4);
		System.out.println("------------------------------------");
		EmployeeWage.CompanyName a2=new EmployeeWage().new CompanyName();
		System.out.println("emp2 attendence and"
				+ " earnings");
		a2.EmployeeAttendence("Patrick","Y",20,8,4);
		
		a1.EmployeeAttendence("ABC","Z",20,8,4);
		a1.EmployeeAttendence("DEF","W",20,8,4);
	}

}