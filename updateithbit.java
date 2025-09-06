public class updateithbit {
          public static int setithbit_1(int n,int i){
                int bitmask =1<<i;
                return n| bitmask;
        }        public static int clearithbit(int n,int i){
                int bitmask = ~(1<<i);
                return n & bitmask;
        }
        public static int Innerupdateithbit(int i,int n,int newBit) {
        if(newBit == 0){
          return clearithbit(n,i);

        }else{
                return setithbit_1(n, newBit);
        }
                
        }
        public static void main(String[] args) {
                System.out.println(Innerupdateithbit(10 ,2, 1));
        }
}
