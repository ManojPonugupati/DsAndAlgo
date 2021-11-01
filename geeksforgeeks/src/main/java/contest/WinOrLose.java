package contest;

public class WinOrLose {
    public static void main(String[] args) {
         String A = "vwowovwovvwwvwvvoowovv";
         boolean v=false;
         boolean double_v=false;
         boolean w=false;
         boolean o=false;
         boolean wo=false;
         int cnt=0;
         int v_cnt=0;
         for(int i=0;i<A.length();i++){
            if((!v || !double_v) && A.charAt(i)=='v') {
                v = true;
                v_cnt++;
            }
            if(v && (!double_v) && A.charAt(i)=='v' && v_cnt==2){
                double_v=true;
                v_cnt=0;
            }

            if(double_v) {
                v = false;
                w = true;
                double_v=false;
            }
            if(A.charAt(i)=='w') {
                w = true;
                v=false;
                double_v=false;
                v_cnt=0;
            }
            if(w && A.charAt(i)=='o')
            {
                wo=true;
                w=false;
                o=false;
                double_v=false;
                v=false;
            }

            if(wo && w){
                cnt++;
                w=true;
                v=false;
                o=false;
                double_v=false;
                wo=false;
            }

         }
        System.out.println(cnt);
    }
}
