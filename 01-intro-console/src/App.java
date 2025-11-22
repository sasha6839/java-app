public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Типи данних в Java");

        int userAge = 25; // ціле число
        double userHeight = 175.5; // число з плаваючою комою
        boolean isAсtive = true; // логічний тип
        char grade = 'A'; // символ
        
        
        String name = "John"; // рядок

        System.out.println(userAge);
        System.out.println(name);

        if(isAсtive) {
            System.out.println("Умова виконана");
        } else {
            System.out.println("Помилка");
        }

        int score = 70;
        if(score >= 90) {
            System.out.println("Відмінно");
        } else if(score >= 74) {
            System.out.println("Добре");
        } else {
            System.out.println("Незадовільно");
        }

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        while(j <= 5) {
            System.out.println(j);
            j++;
        }
    }
}