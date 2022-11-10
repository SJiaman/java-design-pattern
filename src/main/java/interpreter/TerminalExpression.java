package interpreter;

import java.util.StringTokenizer;

/**
 * @author Tian Changqing
 * @date 2022/11/10 11:05
 * @desc
 */
public class TerminalExpression extends Expression{
    private String literal = null;

    public TerminalExpression(String str) {
        literal = str;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
