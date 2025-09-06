public class clearlastibits {
        public static int clearitbit(int n,int i){
                int bitmask  =(~0)<<i;
                return n & bitmask;
        }
        public static void main(String[] args) {
                System.out.println(clearitbit(15, 2));
        }
}
