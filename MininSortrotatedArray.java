import java.util.*;
class MininSortrotatedArray{
    static int msra(int[] arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=Math.min(res,arr[i]);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={9,4,5,6,11};
        System.out.println(msra(arr));
    }
}