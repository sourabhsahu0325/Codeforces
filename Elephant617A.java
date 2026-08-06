import java.util.scanner;
public class main{
    public static void main(string[] args){
        Scanner sc= new Scanner (system.in);
        int x =sc.nextInt();
        int steps=x/5;
        if(x%5 !=0){
            steps++;
        }
        system.out.println(steps);
    }
}
