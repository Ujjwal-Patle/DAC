public class P11 {
    public static void main(String[] args) {
        preIncrement();
        postIncrement();
    }

    static void preIncrement()
    {
        int i = 1;
        int sum = i++;
        int sum1 = i;

        System.out.println(sum);
        System.out.println(sum1);
    }

    static void postIncrement(){
        int i = 1;
        int sum = ++i;
        int sum1 = i;

        System.out.println(sum);
        System.out.println(sum1);
    }
}
