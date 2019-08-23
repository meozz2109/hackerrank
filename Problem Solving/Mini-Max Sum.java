// Mini-Max Sum
// For instance, input data: 1 2 3 4 5
// Expected output: 10 14
static void miniMaxSum(int[] arr) {
        // sort the array up
        int tmp;
        long mini=0, max=0;
        for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]>arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
        for(int i=0;i<4;i++) mini+=arr[i];
        for(int i=1;i<5;i++) max+=arr[i];
        System.out.println(""+mini+" "+max);
    }
