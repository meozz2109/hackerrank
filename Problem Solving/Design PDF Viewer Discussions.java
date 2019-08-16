// Design PDF Viewer Discussions
// Input : 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7 \n zaba
// Expected output: 28 (7 * 4)
static int designerPdfViewer(int[] h, String word) {
       int maxHeight = 0;
       for(int i=0;i<word.length();i++){
           // 97 for the character “a”
           if(maxHeight < h[word.charAt(i) - 97]){
               maxHeight = h[word.charAt(i) - 97];
           }
       }
       return word.length() * maxHeight;
   }
