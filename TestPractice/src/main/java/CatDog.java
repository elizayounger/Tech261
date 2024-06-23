public class CatDog {
    public static void main(String[] args) {
        String string = "catdog";
        boolean result = catDog(string);
        System.out.println(result);
    }

    public static boolean catDog(String str) {
        int catCounter = 0;
        int dogCounter = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String substring = str.substring(i, i+3);
            if (substring.equals("cat")){
                catCounter++;
            }
            else if (substring.equals("dog")){
                dogCounter++;
            }
        }
        if (catCounter == dogCounter) {
            return true;
        }
        else {
            return false;
        }
    }
}
