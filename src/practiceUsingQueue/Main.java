package practiceUsingQueue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enqueue(14);
        solution.enqueue(22);
        solution.enqueue(-6);
        solution.deQueue();
        solution.deQueue();
        solution.enqueue(9);
        solution.enqueue(20);
        System.out.println(solution.getMyQueue());
    }
}
