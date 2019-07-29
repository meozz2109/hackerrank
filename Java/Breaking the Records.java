public static int[] breakingTheRecords(int[] scores){
        int min = scores[0], max = scores[0], countMin=0, countMax=0;
        for(int i=0;i<scores.length;i++){
            if(scores[i]<min){
                countMin++;
                min=scores[i];
            } else if(scores[i]>max){
                countMax++;
                max=scores[i];
            }
        }
        int[] re = new int[]{countMax, countMin};
        return re;
    }