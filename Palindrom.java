public class Palindrom {
    public static boolean isPalindrom(String str){
        String string = str.replaceAll("\\s+", "").toLowerCase();
            char[]pal=string.toCharArray();

            for(int i=0;i<pal.length;i++){
                    if(pal[i]!=pal[pal.length-i-1]){
                         return false;
                    }
            }
        return true;

    }
}
