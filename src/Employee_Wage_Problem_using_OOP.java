public class Employee_Wage_Problem_using_OOP {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WORKING_DAYS_IN_MONTH=20;
    public static void main(String[] args) {


        int PER_HOUR = 20;
        int FULL_TIME = 8;
        int PART_TIME = 4;
        int empHrs = 0;
        int empWage = 0;
        int day = 0;
        int TotalMonthWage = 0;

        while (day <= WORKING_DAYS_IN_MONTH) {
            int status = ((int) (Math.random() * 10) % 3);
            switch (status) {
                case IS_FULL_TIME:
                    empHrs = FULL_TIME;
                    break;
                case IS_PART_TIME:
                    empHrs = PART_TIME;
                    break;
                default:
                    empHrs = 0;
                day++;
            }
            empWage = empHrs * PER_HOUR;
            TotalMonthWage+=empWage;
            //System.out.println("Employee wage : " + empWage);
        }
        System.out.println("Total employee Wage in Month"+TotalMonthWage);
    }
}
