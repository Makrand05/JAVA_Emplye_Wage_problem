public class Employee_Wage_Problem_using_OOP {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static void main(String[] args) {


        int PER_HOUR = 20;
        int FULL_TIME = 8;
        int PART_TIME = 4;
        int empHrs = 0;
        int empWage = 0;
        int status = ((int) (Math.random() * 10) % 3);
//        System.out.println(status);
//        if (status == IS_FULL_TIME) {
//            empHrs = 8;
//        } else if (status == IS_PART_TIME) {
//            empHrs = 4;
//        } else
//            empHrs = 0;
        switch (status){
            case IS_FULL_TIME:
                empHrs=FULL_TIME;
                break;
            case  IS_PART_TIME:
                empHrs=PART_TIME;
                break;
            default:
                empHrs=0;

        }
        empWage = empHrs * PER_HOUR;
        System.out.println("Employee wage : " + empWage);
    }

}
