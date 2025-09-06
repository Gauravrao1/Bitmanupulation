public class setithbit {
        public static int setithbit_1(int n,int i){
                int bitmask =1<<i;
                return n| bitmask;
        }
                public static void main(String[] args) {
                System.out.println(setithbit_1(10, 2));
        }
}
