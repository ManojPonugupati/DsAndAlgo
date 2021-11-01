package matrices;
import utils.BoardIndex;

public class SearchingForANumberInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        BoardIndex b = findTheIndex(arr1,21);
        System.out.println(b.getRow() + " " + b.getCol());
    }

    static BoardIndex findTheIndex(int arr[][],int num)
    {
        int r=0;
        int rows_highest_index = arr.length-1;
        int c = arr[0].length-1;
        int cols_lowest_index = 0;
        boolean find_index=false;
        boolean end_of_the_array=false;
        BoardIndex b = new BoardIndex(-1,-1);

        while(! (find_index || end_of_the_array) ) {

            if (arr[r][c] == num) {
                b=new BoardIndex(r,c);
                find_index = true;
            } else if (arr[r][c] > num) {
                c--;
            } else {
                r++;
            }
            if (c < cols_lowest_index || r > rows_highest_index)
                end_of_the_array = true;
        }
        return b;
    }
}
