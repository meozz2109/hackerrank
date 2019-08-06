//Apple and Orange
//Input: 7, 11, 5, 15, {-2, 2, 1}, {5, -6} --> output: 1\n1
public static void appleAndOrange(int s, int t, int a, int b, int[] apples, int[] oranges){
        int countA=0, countO=0;
        for(int j:apples)
            if(j+a>=s && j+a<=t) countA++;
        for(int k:oranges)
            if(k+b>=s && k+b<=t) countO++;
        System.out.println(countA+"\n"+countO);
    }