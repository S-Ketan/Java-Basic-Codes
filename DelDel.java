package JavaBasicCodes;

public class DelDel {
    public String delDel(String str) {
        if((str.length()>3)&&(str.substring(1,4).equals("del"))){
            char a=str.charAt(0);
            String end =str.substring(4);
            return a+end;
        }else{
            return str;
        }
    }

    public static void main(String[] args) {
        DelDel dd = new DelDel();
        System.out.println(dd.delDel("adelbc"));
        System.out.println(dd.delDel("adelhello"));
        System.out.println(dd.delDel("adel"));

    }
}
