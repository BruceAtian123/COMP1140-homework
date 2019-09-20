package comp1110.homework.J10;

public class SquareRoot {
    public static String findPreciseRoot(int n ,int d){
        String str = "";
        if (n<0){
            str = "-1";
        }else{
            for(int i = 0;i<=n;i++){
                if(i*i==n){
                    str = ""+i;
                    break;
                }else {
                    String sta = "" + Math.sqrt(n);
                    int de = sta.indexOf(".");
                    String deci;
                    if (d == 0) {
                        str = "" + (int) (Math.sqrt(n));
                    } else {
                        if (de + d + 1 > sta.length()) {
                            deci = sta.substring(de);
                        } else {
                            int deb = Integer.parseInt(sta.substring(de+d+1,de+d+2));
                            if(deb>=5){
                                int dec = Integer.parseInt(sta.substring(de+1,de+d+1))+1;
                                str = "" + (int) (Math.sqrt(n))+"."+dec;
                                break;
                            }else {
                                deci = sta.substring(de, de + d + 1);
                            }
                        }
                        str = "" + (int) (Math.sqrt(n)) + deci;
                    }
                }
            }
        }
        return str;
    }
}
