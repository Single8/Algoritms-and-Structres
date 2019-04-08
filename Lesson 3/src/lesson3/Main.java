package lesson3;

public class Main {
    public static void main(String[] args) {
//        lesson3.Stack stack = new lesson3.StackImpl(3);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.display();
//        System.out.println("\n size = " + stack.getSize());
//        System.out.println("isFull = " + stack.isFull());
//
//        System.out.println("--------------------------");
//        while (! stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
        //String input = "{text() {display(); int[] a = new int[5];}";
//        String input = "{()}{()[][]}";
//        new lesson3.Bracket(input).check();
//        lesson3.Queue queue = new lesson3.QueueImpl(5);
//        queue.insert(10);
//        queue.insert(20);
//        queue.insert(30);
//        queue.insert(40);
//        queue.insert(50);
//        if (!queue.isFull()) {
//            queue.insert(60);
//        }
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.remove());
//        }

        Queue queue = new PriorityQueue(5);
        queue.insert(40);
        queue.insert(10);
        queue.insert(30);
        queue.insert(50);
        queue.insert(20);
        if (!queue.isFull()) {
            queue.insert(60);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

        System.out.println("FINISH");
    }
}
