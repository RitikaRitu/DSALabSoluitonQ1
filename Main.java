package DSALabSolutionQ1;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input");
        String data = sc.next();
        System.out.println("The input is balanced" + " "+isbalanced(data));

    }

    static boolean isbalanced(String data) {
        if (data.length() % 2 == 1) {
            return false;
        } else {

            Stack<Character> st = new Stack<>();
            for (int i = 0; i < data.length(); i++) {
                char ch = data.charAt(i);
                if (ch == '{' || ch == '[' || ch == '(') {
                    st.push(ch);
                    continue;

                }
                if (st.isEmpty()) {
                    return false;
                }

                else {
                    char c = st.pop();
                    switch (ch) {
                        case '}':
                        {
                            if (c == '[' || c == '(') {
                                return false;

                            }
                            break;
                        }
                        case ']': {
                            if (c == '{' || c == '(') {
                                return false;

                            }
                            break;
                        }
                        case ')': {
                            if (c == '{' || c == '[') {
                                return false;

                            }
                            break;
                        }

                    }
                }
                return true;
            }
        }
        return false;
    }
}
