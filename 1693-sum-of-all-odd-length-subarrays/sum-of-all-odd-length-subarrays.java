class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int length=j-i+1;
                
                if(length%2!=0){
                    int sum=0;
                    for(int k=i;k<=j;k++){
                        sum=sum+arr[k];

                    }
                    ans=ans+sum;
                }
            }
        }
        return ans;
    }
}