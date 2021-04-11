import java.nio.file.*;

public class Task4{
    static String readFileAsString() throws Exception{
        String data;
        data = new String(Files.readAllBytes(Paths.get("src/file.txt")));
        return data;
    }

    static String Reverse(String str){
        int i = str.length() - 1;
        int start;
        int end = i + 1;
        StringBuilder result = new StringBuilder();
        while(i >= 0) {
            if(str.charAt(i) == ' '){
                start = i + 1;
                while(start != end){
                    result.append(str.charAt(start++));
                }
                result.append(' ');
                end = i;
            }
            i--;
        }
        start = 0;
        while(start != end){
            result.append(str.charAt(start++));
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception
    {
        String data = readFileAsString();
        System.out.println(data + '\n' + Reverse(data));
    }
}