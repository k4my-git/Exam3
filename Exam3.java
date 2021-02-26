public class Exam3 {
    public static void main(String[] args) {
        double sum = 0.0;
        int add = 8;
        
        sum += add;
        for(int i = 0 ; i < 6 ; i++){
            sum += add += 7;
        }
        
        System.out.println("sum = " + sum);
    }
}