import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N != 0){
            int mat[][] = new int [N][N];

            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    mat[i][j] = 1 + Math.abs(i-j);
                }
            }

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < N; i++){
                sb.append(String.format("%3d", mat[i][0]));
                for (int j = 1; j < N; j++){
                    sb.append(String.format(" %3d", mat[i][j]));
                }
                sb.append(System.lineSeparator());
            }
            System.out.println(sb);

            N = sc.nextInt();
        }

        sc.close();
    }
}
