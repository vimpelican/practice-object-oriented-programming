package lecture_230407;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();

        String nums = input.nextLine();
        String[] nums_list = nums.split(" ");

        for(int i = 0; i < nums_list.length; i++) {
            int num = Integer.parseInt(nums_list[i]);
            queue.enqueue(num);
        }

        while(!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
        input.close();
    }
}
