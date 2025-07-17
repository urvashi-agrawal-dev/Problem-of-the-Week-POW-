//Min in Sort rotated Array this is the first approach below is the second approach
import java.util.*;
class MininSortrotatedArray{
    static int msra(int[] arr){
        int n=arr.length;
        int low=0;int high=n-1;
        while (low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            } else{
                high=mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args){
        int[] arr={9,4,5,6,11};
        System.out.println(msra(arr));
    }
}


//this is the second approach more optimal
    
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
