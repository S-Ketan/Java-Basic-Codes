package JavaBasicCodes;

public class ChanegPI {
    public String changePi(String str) {
        if(str.length()<2) return str;
        if(str.substring(0,2).equals("pi")) return "3.14"+changePi(str.substring(2));
        else{return str.charAt(0)+changePi(str.substring(1));
        }
    }

    public static void main(String[] args) {
        ChanegPI cp = new ChanegPI();
        System.out.println(cp.changePi("xxxpix"));
    }

}
