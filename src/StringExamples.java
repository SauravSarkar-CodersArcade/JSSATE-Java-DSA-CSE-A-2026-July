public class StringExamples {
    public static void main(String[] args) {
        char[] letters = {'C','h','i','r','a','a','g'};
        String name = new String(letters);
        System.out.println(name); // Chiraag
        int[] arr = {3,1,2,4,1,3,2};
        int res = 0;
        for (int i=0; i< arr.length; i++){
            res = res ^ arr[i];
        }
        System.out.println("Unique: " + res);
    }
}
