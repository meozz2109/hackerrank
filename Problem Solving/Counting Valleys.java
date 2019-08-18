// Counting Valleys
// For example, input: UDDDUDUU
// -> Output: 1
static int countingValleys(int n, String s) {
        int total = 0, counter = 0;
        Character c1 = new Character('U'), c2 = new Character('D');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c1.equals(c)) {
                counter++;
            } else if (c2.equals(c)) {
                counter--;
                if (counter == -1) {
                    total++;
                }
            }
        }
        return total;
    }
