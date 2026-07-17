public class Numbers {
    public static void main(String [] args){
        for(int i=5; i>=0; i--){
            for(int j=1; j<=i; j++){
                for(int k=1; k<=i; k++){
                    System.out.print("");
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
