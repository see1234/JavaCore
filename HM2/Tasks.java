package ru.gb.jcore.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    public static List<Task> taskList = new ArrayList<>();

    public static void main(String[] args) {
        registerTasks();
        runConsole();
    }
    public static void registerTasks() {
        taskList.add(new CountEvensTask());
        taskList.add(new Difference());
        taskList.add(new ZeroNeighbors());
    }
    public static void runConsole() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Задачи: ");
        for(int i = 0; taskList.size() > i; i++) {
            System.out.println(String.format("%d. %s", i+1, taskList.get(i).description()));
        }
        System.out.print("Введите номер: ");
        int choice = scan.nextInt();
        if(taskList.size() >= choice && choice > 0) {
            taskList.get(choice - 1).run(scan);
        }
        else {
            System.out.println("Такой задачи нет, выхожу из системы");
        }
        scan.close();
    }
}

interface Task {
    void run(Scanner scan);
    String description();
}

class CountEvensTask implements Task {
    @Override
    public void run(Scanner scan) {
        System.out.println("Введите сколько элементов массива:");
        int[] nums = new int[scan.nextInt()];
        System.out.println("Введите элементы массива:");
        for(int i = 0; nums.length > i; i++) {
            nums[i] = scan.nextInt();
        }
        int count = countEvens(nums);
        System.out.println("Количество четных элементов: " + count);
    }

    @Override
    public String description() {
       return "Посчитать количество четных элементов массива";
    }

    private int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
class Difference implements Task {
    @Override
    public void run(Scanner scan) {
        System.out.println("Введите сколько элементов массива:");
        int[] nums = new int[scan.nextInt()];
        System.out.println("Введите элементы массива:");
        for(int i = 0; nums.length > i; i++) {
            nums[i] = scan.nextInt();
        }
        int difference = max(nums) - min(nums);
        System.out.println("Разница между максимальным и минимальным составляет: " + difference);
    }

    @Override
    public String description() {
        return "Посчитать разницу максимальным элементом и маленьким";
    }

    private int min(int[] nums) {
        int min = nums[0];
        for(int num : nums) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }
    private int max(int[] nums) {
        int max = nums[0];
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
class ZeroNeighbors implements Task {
    @Override
    public void run(Scanner scan) {
        System.out.println("Введите сколько элементов массива:");
        int[] nums = new int[scan.nextInt()];
        System.out.println("Введите элементы массива:");
        for(int i = 0; nums.length > i; i++) {
            nums[i] = scan.nextInt();
        }
        boolean bool = hasZeroNeigbors(nums);
        System.out.println("Ответ: " + (bool ? "Да" : "Нет"));
    }

    @Override
    public String description() {
        return "Проверяет, есть ли в переданном массиве два соседних элемента со значением 0";
    }

    private boolean hasZeroNeigbors(int[] nums) {
        for(int i = 0; nums.length - 1 > i; i++) {
            if (nums[i] == 0 && nums[i+1] == 0) {
                return true;
            }
        }
        return false;
    }

}