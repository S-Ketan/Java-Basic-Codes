package JavaBasicCodes;

public class StartOz {
    public String startOz(String str) {
        if((str.startsWith("oz"))){
            return "oz";
        } else if((!str.isEmpty())&&(str.charAt(0) == 'o')){
            return "o";
        } else if((!str.isEmpty())&&(str.charAt(1) == 'z')){
            return "z";
        }else{
            return "";
        }
    }

    public static void main(String[] args) {
        StartOz so = new StartOz();
        System.out.println(so.startOz("o"));
        System.out.println(so.startOz("oz"));
        System.out.println(so.startOz("ozt"));
        System.out.println(so.startOz("oz"));
        System.out.println(so.startOz(""));
    }

}
