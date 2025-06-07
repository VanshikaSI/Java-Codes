import java.util.Scanner;

 public class Matrix
 {
    public static void main(String[] args) {
        int i,j,n;
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];

        System.out.println("Enter the matrix type");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println("Enter values for first matrix");
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                Scanner sc=new Scanner(System.in);
              a[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter values for second matrix");
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                Scanner sc=new Scanner(System.in);
              b[i][j]=sc.nextInt();

            }
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                c[i][j]=a[i][j]+b[i][j];
    }
}
System.out.println("Final matrix is");
for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
        System.out.print(c[i][j]+"\t");
    }
    System.out.println();
}
    }
}