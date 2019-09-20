package comp1110.homework.O01;

public class BMI {
    String name;
    double height;
    double weight;

    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI(){
        double value = weight/(height*height);
        return value;
    }

    public String toString() {
        String s = name +" is "+height+"m tall and is "+weight+"Kg and has a BMI of "+getBMI()+"Kg/m^2";
        System.out.println(s);
        return s;
    }
}
