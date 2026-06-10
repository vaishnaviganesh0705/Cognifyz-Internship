import java.io.*;
import java.util.*;

public class FileTaskManager {

    static ArrayList<String> tasks = new ArrayList<>();
    static final String FILE_NAME = "tasks.txt";

    public static void loadTasks() {
        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) {
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {
                tasks.add(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error loading tasks.");
        }
    }

    public static void saveTasks() {
        try {

            BufferedWriter bw =
                    new BufferedWriter(new FileWriter(FILE_NAME));

            for (String task : tasks) {
                bw.write(task);
                bw.newLine();
            }

            bw.close();

        } catch (Exception e) {
            System.out.println("Error saving tasks.");
        }
    }

    public static void main(String[] args) {

        loadTasks();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== FILE TASK MANAGER =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Save Tasks");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Task: ");
                    tasks.add(sc.nextLine());
                    break;

                case 2:
                    for (String task : tasks) {
                        System.out.println(task);
                    }
                    break;

                case 3:
                    saveTasks();
                    System.out.println("Tasks Saved!");
                    break;

                case 4:
                    saveTasks();
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
