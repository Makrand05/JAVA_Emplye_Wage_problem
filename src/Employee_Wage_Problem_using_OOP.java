public class Employee_Wage_Problem_using_OOP {
    public static void main(String[] args) {
        int IS_FULL_TIME=1;
        int PER_HOUR=20;
        int empHrs=0;
        int empWage=0;
        int status=((int)(Math.random()*10)%2);
        System.out.println(status);
        if(status==IS_FULL_TIME) {
            empHrs=8;
        }
        else
            empHrs=0;
        empWage=empHrs * PER_HOUR;
        System.out.println("Employee wage : "+ empWage);
    }

}
