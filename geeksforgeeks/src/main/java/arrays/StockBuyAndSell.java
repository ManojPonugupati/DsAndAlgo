package arrays;

import java.io.BufferedWriter;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr ={100, 180, 260, 310, 40, 535, 695};
        System.out.println(stockBuyAndSell(arr,arr.length));
    }
    public static String stockBuyAndSell(int[] arr,int n){
        StringBuilder sb = new StringBuilder();
        int[] localminarr = new int[n/2 +1];
        int[] localmaxarr = new int[n/2 +1];
        boolean minfound=false;
        boolean maxfound = false;
        int lmin=0;
        int lmax=0;
        if(n==1){
            return "-1";
        }
        for(int i=0;i<n-1;i++){

            if(arr[i] < arr[i+1] && (!minfound)){
                localminarr[lmin] = arr[i];
                lmin++;
            } else
            {
                if(arr[i] > arr[i+1] && (!!maxfound)){
                  localmaxarr[lmax] = arr[i];
                  lmax++;
                } else {
                    minfound=false;
                    maxfound=false;
                    localminarr[lmin]=arr[i];
                }
            }
        }
        for(int i=0;i<=lmin || i<=lmax;i++){
            sb.append(localminarr[i] +" " + localmaxarr[i] + " ;") ;
        }
        return sb.toString();
    }

}
