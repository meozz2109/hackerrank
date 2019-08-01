//Between Two Sets
//Input: {2, 4}, {16, 32, 96} --> Output: 3

public static int betweenTwoSets(List<Integer> a, List<Integer> b){
        int count=0, minb = Collections.min(b), maxa = Collections.max(a);
        intCheck:
        for(int i=maxa;i<= minb;i+= maxa){
            for(int num: a){
                if(i%num!=0) continue intCheck;
            }
            for(int num: b){
                if(num%i!=0) continue intCheck;
            }
            count++;
        }
        return count;
    }