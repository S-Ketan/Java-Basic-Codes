package JavaBasicCodes;

public class DoubleX {
    boolean doubleX(String str) {
        int i=str.indexOf('x');
        if(i==-1){return false;}

        if(i+1>=str.length()){return false;}
        if(str.charAt(i+1)=='x'){return true;}
        else{return false;}

    }

    public static void main(String[] args) {
        DoubleX doubleX = new DoubleX();
        System.out.println(doubleX.doubleX("ax"));
        System.out.println(doubleX.doubleX("xx"));
        System.out.println(doubleX.doubleX("axx"));
        System.out.println(doubleX.doubleX("axbx"));
    }
}
