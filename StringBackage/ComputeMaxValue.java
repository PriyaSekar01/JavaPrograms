package StringBackage;

public class ComputeMaxValue {

    int[] computeMxvalue(int[] integers){
        int n = integers.length;
        int[]  result = new int[n];
        for(int i =0; i<n;i++){
            int numbers = integers[i];
            int sum =0;
            int product = 1;
            while(numbers!=0){
                int digit = numbers % 10;
                sum+=digit;
                product*=digit;
                numbers/=10;
            }
            result[i]=Math.max(sum,product);
        }
          return result;
    }

    public static void main(String args[]){
    }
}
