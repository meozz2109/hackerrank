public static int birthdayCakeCandles(int[] inputArr){
        List<Integer> l = new ArrayList<>();
        for(int i: inputArr) l.add(i);
        int re = Collections.max(l), count=0;
        for(int i=0;i<l.size();i++)
            if(l.get(i).equals(re)) count++;
        return count;
    }