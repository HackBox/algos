package Arrays;

public class URLify {
    void replaceSpaces(String strmain, int trueLen) { // trueLen includes mid spaces
        char[] str = strmain.toCharArray();
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLen; i++) {
            if(str[i]==' ')
            spaceCount++;
        }
        index = trueLen + spaceCount * 2; //length of the final string
        if (trueLen < str.length)
            str[trueLen] = '\0';
        for (i = trueLen - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        new URLify().replaceSpaces("Mr John Smith    ",13);
    }
}
