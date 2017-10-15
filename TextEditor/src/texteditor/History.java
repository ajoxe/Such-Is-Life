package texteditor;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

    public class History {
        private static Stack<String> historyStack = new Stack<>();
        private static Stack<String> deletedStack = new Stack<>();
        private static Scanner scanner = new Scanner(System.in);

        static void command() {
            System.out.println("Options:\nDelete | Undo | Copy | Quit\n");
            System.out.print("Enter: ");
            while (scanner.hasNext()) {
                String input = scanner.nextLine().toLowerCase();
                if (input.equals("quit")) {
                    System.out.println("Exited Program");
                    System.exit(0);
                } else if (input.equals("delete")) {
                    try {
                        String deletedInput = historyStack.pop();
                        deletedStack.push(deletedInput);
                        System.out.println(deletedInput + " has been deleted");
                    } catch (EmptyStackException e) {
                        System.out.println("Nothing to delete");
                    }
                } else if (input.equals("undo")) {
                    if (historyStack.size() >= 10) {
                        continue;
                    }
                    try {
                        String undoInput = deletedStack.pop();
                        historyStack.push(undoInput);
                        System.out.println("undo delete: " + undoInput);
                        System.out.println(undoInput + " added to history");
                    } catch (EmptyStackException e) {
                        System.out.println("Nothing to undo");
                    }
                } else if (input.equals("copy")) {
                    if (historyStack.size() >= 10) {
                        continue;
                    }
                    try {
                        String copiedInput = historyStack.peek();
                        historyStack.push(copiedInput);
                        System.out.println(copiedInput + " has been copied to history");
                    } catch (EmptyStackException e) {
                        System.out.println("Nothing to copy");
                    }
                } else {
                    if (input.isEmpty()) {
                        continue;
                    }
                    if (historyStack.size() >= 10) {
                        System.out.println("Limit reached, please delete an item.");
                        continue;
                    }
                    historyStack.push(input);
                    System.out.println(input + " added to history");
                }
            }
        }
    }

