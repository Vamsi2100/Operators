public class Quadratic {
    public static void main(String[] args) {
        int a = 02;
        int b = 1;
        int c = 5;
        double d = b*b-4*a*c;

        if(d>=0) {
            double root1 = (-b + Math.sqrt(d)/2*a);
            double root2 = (-b - Math.sqrt(d)/2*a);
            System.out.println("Roots1 : " + root1);
            System.out.println("Roots2 :" + root2);
        }else {
            System.out.println("No Real roots exists");
        }
    }
}
