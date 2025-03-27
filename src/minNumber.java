/*
 * This method find the minimum number from array
 * The time complexity of the code is O(n)
 * The loop iterates from 1 to n
 */
public class minNumber{
    public static int minN(int n,int[] arr){
        int min_num=arr[0];
        for (int i=0;i< n;i++){
            if (arr[i]<min_num){
                min_num=arr[i];
            }
        }
        return min_num;
    }
}
