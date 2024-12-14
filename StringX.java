package JavaBasicCodes;

public class StringX {
    public String stringX(String str) {
        String nox="";
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)!='x'){
                nox+=str.charAt(i);
            }
        }
        if(str.equals("")){return "";}
        else if(str.equals("x")){return "x";}
        else if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x'){return "x"+nox+"x";}
        else if(str.charAt(0)=='x'){return "x"+nox;}
        else if(str.charAt(str.length()-1)=='x'){return nox+"x";}
        return nox;
    }

    public static void main(String[] args) {


    }
}
