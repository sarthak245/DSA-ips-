public class BasicMaths {
    public static void main(String args[]){
        int n = 12987;
        int revNum = 0;
        while (n>0) {
            int Id = n % 10;
            revNum = (revNum * 10) + Id;
            n = n/10;
        }
        System.out.println(revNum);
    }
}
