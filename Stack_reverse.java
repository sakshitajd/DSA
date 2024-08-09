import java.util.*;
public class Stack_reverse {

    public static void Reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int temp =s.pop();
        Reverse(s);

        insertAtLast(s,temp);

    }

    public static void insertAtLast(Stack<Integer> s, int temp){
        if (s.isEmpty()) {
            s.push(temp);
        }
        int topElm = s.pop();
        insertAtLast(s, temp);
        s.push(topElm);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);

        Reverse(s);
        System.out.println(s);
}
}
