package dynamicProgramming.lcs.recursion;
public class LCSRecursion {
    public static int lcs(String s1, String s2, int i, int j){
        // Base Case
        if (i == 0 || j == 0) return 0;
        // If characters match
        if (s1.charAt(i-1) == s2.charAt(j-1)){
            return 1 + lcs(s1, s2, i-1, j-1);
        }
        // If characters don't match
        return Math.max(
                lcs(s1,s2,i-1,j),
                lcs(s1,s2,i,j-1));
    }
    public static void main(String[] args) {
        String s1 = "stone";
        String s2 = "longest";
        int m = s1.length();
        int n = s2.length();
        System.out.println("LCS length: " + lcs(s1,s2,m,n));
    }
}
