public static String convertTime(String s){
        String[] st = s.split("");
        String re = "", timeM = st[0]+st[1], defaultT ="00";
        int time = 0;
        if(st[8].equals("A") && Integer.valueOf(timeM)>=12) {
            time+=Integer.parseInt(st[0]+st[1])-12;
            if(time==0) re+=defaultT;
            else re+=String.valueOf(time);
            for(int i=2;i<st.length-2;i++){
                re+=st[i];
            }
        } else if(st[8].equals("A") && Integer.valueOf(timeM)<12){
            for(int i=0;i<st.length-2;i++){
                re+=st[i];
            }
        } else if(st[8].equals("P")) {
            time+=Integer.parseInt(st[0]+st[1])+12;
            if(time==24) re+="12";
            else re+=String.valueOf(time);
            for(int i=2;i<st.length-2;i++){
                re+=st[i];
            }
        }
        return re;
    }