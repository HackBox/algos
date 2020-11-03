package Arrays;

public class Permutation {
    String sort(String str) {
        char[] string = str.toCharArray();
        java.util.Arrays.sort(string);
        return new String(string);
    }

    boolean hasPermutation(String s, String t) {
        if (s.length() != t.length())
            return false;
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        System.out.println(new Permutation().hasPermutation("hello", "hell1"));
    }
}