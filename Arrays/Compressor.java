package Arrays;

public class Compressor {
    // String stringCompressor(str){


    // }

    int compressionCount(String str){
        int count = 0;
        boolean twomore = false;
        for(int i=0; i<str.length()-1;i++){
            System.out.println(i);
            if(i+1>str.length() || str.charAt(i) == str.charAt(i+1)){
                if(twomore){
                    count++;
                }
                twomore = true;
            }
            else{
                twomore = false;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(new Compressor().compressionCount("aabbb"));
    }
}
