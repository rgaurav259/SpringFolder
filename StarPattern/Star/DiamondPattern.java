package Star;

public class DiamondPattern {
    public static void main(String[] args) {
        //it's a combinations of hill pattern and reverse hill pattern


        int n=5;
        int i,j;

        for (i=1;i<n;i++){
            for (j=i;j<=n;j++){
                System.out.print(" ");
            }
            for (j=1;j<i;j++){
                System.out.print("*");
            }

            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (j=i;j<n;j++){
                System.out.print("*");
            }

            for (j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
