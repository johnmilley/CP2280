public class EX422 {
    public static void main(String[] args) {

        System.out.println("---- Output ----\n");
        
        
        System.out.printf("N\t10*N\t100*N\t1000*N%n");
        for (int i = 1; i < 6; i++) {
            System.out.printf("%d\t%d\t%d\t%d%n", i, 10*i, 100*i, 1000*i);
        }
        
        System.out.println("\n\n---- End Output ----\n");
    }
}