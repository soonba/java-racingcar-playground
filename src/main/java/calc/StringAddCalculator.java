package calc;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringAddCalculator {

    static String delimiter = ",|:";

    public static int splitAndSum(String s) throws RuntimeException {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        s = parseCustomDelimiter(s);
        String[] split = s.split(delimiter);
        int[] ints = mapToInt(split);
        throwIfNegative(ints);
        return intSum(ints);
    }

    private static void throwIfNegative(int[] ints) throws RuntimeException {
        for (int anInt : ints) {
            if (anInt < 0) throw new RuntimeException("negative!");
        }
    }

    private static String parseCustomDelimiter(String s) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
        if (m.find()) {
            delimiter += "|" + m.group(1);
            return m.group(2);
        }
        return s;
    }

    private static int intSum(int[] ints) {
        return Arrays.stream(ints).sum();
    }

    private static int[] mapToInt(String[] split) {
        return Stream.of(split).mapToInt(Integer::parseInt).toArray();
    }

}