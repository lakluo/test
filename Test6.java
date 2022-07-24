package Demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i< arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            arr[i]= sc.nextInt();
        }
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int idex=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=idex;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
