import java.util.*;

public class USTAssignment {

    /* =========================
       TASK 1: ARRAY DEMO
       ========================= */
    static void arrayDemo() {
        int[] arr = {10, 20, 30};
        System.out.println("Array Elements:");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    /* =========================
       TASK 1: LINKED LIST DEMO
       ========================= */
    static void linkedListDemo() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Linked List: " + list);
    }

    /* =========================
       TASK 1: DOUBLY LINKED LIST
       ========================= */
    static void doublyLinkedListDemo() {
        LinkedList<Integer> dll = new LinkedList<>();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        System.out.println("Doubly Linked List: " + dll);
    }

    /* =========================
       TASK 1: CIRCULAR LINKED LIST (SIMULATED)
       ========================= */
    static void circularLinkedListDemo() {
        LinkedList<Integer> cll = new LinkedList<>();
        cll.add(5);
        cll.add(10);
        cll.add(15);
        System.out.println("Circular Linked List (Logical): " + cll);
        System.out.println("Last element points to first (conceptually)");
    }

    /* =========================
       TASK 2: TWO STACKS USING ONE ARRAY
       ========================= */
    static class TwoStacks {
        int[] arr;
        int top1, top2;

        TwoStacks(int size) {
            arr = new int[size];
            top1 = -1;
            top2 = size;
        }

        void push1(int x) {
            if (top1 < top2 - 1)
                arr[++top1] = x;
        }

        void push2(int x) {
            if (top1 < top2 - 1)
                arr[--top2] = x;
        }

        int pop1() {
            if (top1 >= 0)
                return arr[top1--];
            return -1;
        }

        int pop2() {
            if (top2 < arr.length)
                return arr[top2++];
            return -1;
        }
    }

    /* =========================
       TASK 3: BINARY SEARCH (RECURSION)
       ========================= */
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (key < arr[mid])
                return binarySearch(arr, low, mid - 1, key);
            else
                return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }

    /* =========================
       MAIN OVERALL ASSIGNMENT
       ========================= */
    static void collectionsDemo() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("UST");

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(100);
        hashSet.add(200);

        System.out.println("Stack: " + stack);
        System.out.println("Queue: " + queue);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashSet: " + hashSet);
    }

    /* =========================
       MAIN METHOD
       ========================= */
    public static void main(String[] args) {

        System.out.println("---- TASK 1 ----");
        arrayDemo();
        linkedListDemo();
        doublyLinkedListDemo();
        circularLinkedListDemo();

        System.out.println("\n---- TASK 2 ----");
        TwoStacks ts = new TwoStacks(10);
        ts.push1(10);
        ts.push2(100);
        System.out.println("Pop Stack1: " + ts.pop1());
        System.out.println("Pop Stack2: " + ts.pop2());

        System.out.println("\n---- TASK 3 ----");
        int[] arr = {2, 4, 6, 8, 10};
        int result = binarySearch(arr, 0, arr.length - 1, 8);
        System.out.println("Binary Search Result Index: " + result);

        System.out.println("\n---- COLLECTIONS ----");
        collectionsDemo();
    }
}
