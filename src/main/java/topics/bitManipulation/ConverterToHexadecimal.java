package topics.bitManipulation;

public class ConverterToHexadecimal {

    public static String convert(int num){
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String result = "";

        while (num != 0) {
            char current = map[num & 15];
            result = (current) + result;
            num >>>= 4;
        }

        return result;
    }
}
