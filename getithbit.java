public class getithbit {
        public static int getithbit_1(int n,int i){
                int bitmask = 1<<i;
                if ((n&bitmask)==0){
                        return 0;
                  }  else{
                        return 1;

                    }    
                

        }
        public static void main(String[] args) {
                getithbit_1(4, 3);
                System.out.println(getithbit_1(4, 2));
        }
        
}
