package Exercise_4;

public class Reverse {
    public static void reverse(String text){
        String[] list_line = text.split("\n");
        for (int i = list_line.length-1; i >= 0 ; i--) {
            System.out.println(list_line[i]);
        }
    }
}
