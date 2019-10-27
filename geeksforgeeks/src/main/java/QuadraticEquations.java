public class QuadraticEquations {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int c = 8;
        int root1 =0;
        int root2 = 0;

        System.out.println(((Math.pow(b,2) - 4*a*c) + b)/(2.0*a));
        double bsquareminus4ac = (Math.pow(b,2) - 4*a*c);

        root1 = (int)Math.floor(( -b + Math.sqrt(bsquareminus4ac))/2.0*a);
        root2 = (int)Math.floor((-b-Math.sqrt(bsquareminus4ac))/2.0*a);
        if(bsquareminus4ac < 0.0) {
            System.out.print(root1);
        }else if(root1 > root2 )
        {
            System.out.println(root1 + " " + root2);
        }else {
            System.out.println(root2 + " " + root1);

        }
    }
}
