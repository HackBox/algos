package practice;

public class LargestSumContageousSubArray {
    public static void main(String[] args) {
    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_end_here = 0;
        int max_sum =0;
        for(int i=0; i<a.length;i++){
            max_end_here = Math.max(0, max_end_here+a[i]);
            max_sum = Math.max(max_end_here, max_sum);
        }
        System.out.println(max_sum);
    }
}