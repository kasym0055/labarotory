public class minNumber{
    public static int minN(int[] arr){
        int min_num=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]<min_num){
                min_num=arr[i];
            }
        }
        return min_num;
    }
}
