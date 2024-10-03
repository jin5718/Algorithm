
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비


        String input = sc.nextLine();

        int answer = 0;
        String[] inputArray = input.split(" ");

        int[] num = new int[inputArray.length];

        for(int i = 0; i < inputArray.length; i++){
            num[i] = Integer.parseInt(inputArray[i]);
        }

        int mx = -999999;

        for(int i = 0; i < num.length - 2; i++){
            for(int j = i + 1; j < num.length-1; j++){
                for(int k = j + 1; k < num.length; k++){
                    if((num[i] + num[j] + num[k]) <= M && (num[i] + num[j] + num[k]) >= mx ){
                        mx = (num[i] + num[j] + num[k]);
                    }
                }
            }
        }

        answer = mx;
        System.out.println(answer);
    }
}
