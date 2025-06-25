package JavaBasicCodes;

public class PlatzTausch {
    public static void main(String[] args) {
    PlatzTausch pt = new PlatzTausch();
    int []example1={0,1,5,4,7,9};
    int []example2={5,7,3,4,2};
    int []example3={9,54,61,1,49};


       pt.arrayReversed(example1);
       pt.arrayReversed(example2);
       pt.arrayReversed(example3);
    }
    public void arrayReversed(int[] arr) {
        for(int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.printf("%d",arr[i]) ;
        }
    }
}
