package comp1110.homework.O04;

public class Circle extends Shape {
    Circle(double length2){
        this.length2=length2;
    }

    Circle(double length2, double x, double y) {
        this.length2=length2;
        this.x= x;
        this.y= y;
    }

    @Override
    public double perimeter(){
        return length2*2*Math.PI;
    }
    public double area(){
        return Math.PI * length2 *length2;
    }
    public boolean overlaps(Shape other) {
        if(other instanceof Circle){
            if(Math.sqrt((this.x-other.x)*(this.x-other.x)+(this.y-other.y)*(this.y-other.y))<(this.length2+other.length2)){
                return true;}else{return false;}
        }else{double x = Math.abs(this.x-other.x)-other.length1/2;
            double y = Math.abs(this.y-other.y)-other.length1/2;
            if (x>0) {
                if (y>0) {
                    return x*x + y*y<this.length2*this.length2;
                } else {
                    return x<this.length2;
                }
            } else {
                return y<this.length2;
            }}
    }}