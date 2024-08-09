

public class Bubble {
    
    public static void main(String[] args) {
        int[] num ={7,8,2,1,3};

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j]= num[j+1];
                    num[j+1]=temp;

                }
            }
        }

        for(int nums: num){
            System.out.print(nums+ " ");
        }
    }
}

