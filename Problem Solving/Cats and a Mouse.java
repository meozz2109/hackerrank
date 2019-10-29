// Cats and a Mouse
// For instance, input data: 1 2 3
// Expected output: Mouse B
static String catAndMouse(int x, int y, int z) {
        String re = "";
        if(Math.abs(x-z)>Math.abs(y-z)) re = "Cat B";
        else if(Math.abs(x-z)<Math.abs(y-z)) re = "Cat A";
        else re ="Mouse C";
        return re;
    }
