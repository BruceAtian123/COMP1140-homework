package comp1110.homework.J08;

public class Staff {
    String name;
    double hourlyPay;
    int numOfHours;
    boolean worksOvertime;

    public Staff(String name, double hourlyPay, int numOfHours, boolean worksOvertime) {
        this.name = name;
        this.hourlyPay = hourlyPay;
        this.numOfHours = numOfHours;
        this.worksOvertime = worksOvertime;
    }

    public double getTotalPay(double extraPay) {
        double d;
        if(worksOvertime){
            d = extraPay+hourlyPay*numOfHours;
            return d;
        }else{
            d = hourlyPay*numOfHours;
            return d;
        }
    }

    public String getName() {
        return name;
    }

    public static class WeekendPayCalculator {
        private double loadingrate;

        public void setLoadingRate(double loadingrate) {
            this.loadingrate = loadingrate;
        }

        public double calcOvertime(double hourlyPay) {
            return hourlyPay * loadingrate;
        }
    }
}
