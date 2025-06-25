package JavaBasicCodes;

public class PanngramChecker {
    public static void main(String[] args) {
        PanngramChecker pc = new PanngramChecker();
        String example1="Jeder wackere Bayer vertilgt bequem zwo Pfund Kalbshaxen";
        String example2="Jeder wackere Bayer vertilgt bequem zwo Pfund Kalbshaxen";
        String example3="Jeder wackere Bayer sertilgt bequem zwo Pfund Kalbshaxen";
        String example4 = "Dies ist kein vollständiger Satz.";
        System.out.println(pc.isPanngram(example1));
        System.out.println(pc.isPanngram(example2));
        System.out.println(pc.isPanngram(example3));
        System.out.println(pc.isPanngram(example4));

    }
    public boolean isPanngram(String sentence){
        sentence = sentence.toLowerCase();
         boolean []alphabets= new boolean[26];

         for(int i=0; i<sentence.length(); i++){
             char ch = sentence.charAt(i);
             if(ch>='a' && ch<='z'){
                 alphabets[ch-'a']=true;
             }
         }

         for(int i=0;i<alphabets.length;i++){
             if(!alphabets[i]){
                 return false;
             }
         }
             return true;

    }
}
