package JavaBasicCodes;

//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

public class xyzThere {
    public boolean xyzFinder(String str) {
        if(str.length()>3){
            for(int i =0; i<str.length()-2;i++){
                String xyz="";
                if(str.substring(i,i+3).equals("xyz")&& i==0){
                    return true;
                }
                else if(str.substring(i,i+3).equals("xyz")&& i!=0 &&str.charAt(i-1)!='.'){
                    return true;
                }
            }
            return false;
        }
        if(str.length()==3 && str.equals("xyz")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        xyzThere obj = new xyzThere();
        System.out.println(obj.xyzFinder("xyz"));
        System.out.println(obj.xyzFinder("abcxyz"));
        System.out.println(obj.xyzFinder("xyz.abc"));

    }

}
