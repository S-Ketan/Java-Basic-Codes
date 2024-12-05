package JavaBasicCodes;

public class PosNeg {
    public static void main(String[] args) {
    PosNeg pn = new PosNeg();
    System.out.println(pn.posNeg(-1, -2, true));
    System.out.println(pn.posNeg(-1, 1, false));
    System.out.println(pn.posNeg(1, -1, false));
    System.out.println(pn.posNeg(1, 9, false));
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if((a<0&&b<0&&negative)||(a>0 && b<0&&!negative)|| (a<0 && b>0&&!negative)){
            return true;
        }else{
            return false;
        }
    }

}
