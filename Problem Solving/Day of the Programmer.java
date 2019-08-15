// Day of the Programmer
static String dayOfProgrammer(int year) {
        String re = "";
        if(year <1918 && year % 4 == 0 || (year >1918 && (year % 400 == 0 || year % 4 ==0 && year % 100 != 0))){
            re+="12.09."+year;
        } else if (year == 1918) {
            re+="26.09.1918";
        } else {
            re+="13.09."+year;
        }
        return re;
    }