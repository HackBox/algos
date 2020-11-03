//Implement an Algorith todetermine if a string has all unique characters.

package Arrays;

class IsUniqueChars {
    boolean isUniqueChars(String str) {
        if (str.length() > 128)
            return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsUniqueChars().isUniqueChars("helow"));
    }
}