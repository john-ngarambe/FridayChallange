package exercise.collections.java;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Stack stack  = new Stack();
          for(int i= 0 ; i<10 ; i++){
              stack.push(i);
          }
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search(5));
        System.out.println(!stack.isEmpty());
        System.out.println(stack.clone());
    }
}
