public class Q3_Fatorial {

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int x){
        if(x == 1){
            return 1;
        }
        return x * fatorial(x - 1);
    }
}
