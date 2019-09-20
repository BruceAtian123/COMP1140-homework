package comp1110.homework.O04;

public class Square extends Shape {
    Square(double length1){
        this.length1=length1;
    }
    Square(double length1, double x, double y) {
        this.length1=length1;
        this.x= x;
        this.y= y;
    }
    @Override
    public double perimeter(){
        return length1*4;
    }
    public double area(){
        return length1 *length1;
    }
    public boolean overlaps(Shape other) {
        if(other instanceof Square){return((Math.abs(this.x-other.x)<this.length1/2+other.length1/2)&&
                (Math.abs(this.y-other.y)<this.length1/2+other.length1/2));
        }else {double x = Math.abs(other.x-this.x)-this.length1/2;
            double y = Math.abs(other.y-this.y)-this.length1/2;
            if (x>0) {
                if (y>0) {
                    return x*x + y*y<other.length2*other.length2;
                } else {
                    return x<other.length2;
                }
            } else {
                return y<other.length2;
            }}}}