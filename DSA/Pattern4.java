public class Pattern4{
    public static void main(String args[]){
        int N = 5;
        for(int i=0; i<N; i++){
            for(int j=0; j<N-i-1; j++){
                System.out.print(" ");
            }
             for(int j=0; j<2*i+1; j++){
                System.out.print("*");
             }
             for(int j=0; j<N-i-1; j++){
                System.out.print(" ");
             }
             System.out.println();  
        }
    }

}