public static int birthdayCakeCandles(int[] inputArr){
        //convert an integer array into a integer list (array list) and find max of collections
        List<Integer> l = new ArrayList<>();
        for(int i: inputArr) l.add(i);
        int re = Collections.max(l), count=0;
        for(int i=0;i<l.size();i++)
            if(l.get(i).equals(re)) count++;
        return count;
    }
