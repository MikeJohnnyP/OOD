package practice_exam.queue;

public class Test {
    public static void main(String[] args) {
        IQueue queue = new QueueImpl<>();
        queue.put("Hom nay an gi");
        queue.put("xem bon thoi");
        queue.put("Thic thi nhich");
        queue.put(1);
        queue.put(3.14);
        System.out.println("Queue: " + queue.toString());

        IArrayList arr = new ArrayListAdapter<>(queue);
        System.out.println("Arraylist: " + arr.toString());

        arr.add("liem xi la gi");
        arr.add("di choi khong");
        System.out.println("Arraylist: " + arr.toString());
        System.out.println(arr.isContain(3.14));
    }
}
