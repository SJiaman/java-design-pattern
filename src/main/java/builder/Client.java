package builder;

/**
 * @author Tian Changqing
 * @date 2022/11/8 11:02
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for (int i = 0; i < count; i++) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb);
    }
}