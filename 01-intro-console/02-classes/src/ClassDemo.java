public class ClassDemo {
    public static void main(String[] args) {
        System.out.println(" === Створення об'єктів ===");

        int sc = Student.getStudentCount();
        System.out.println("Кількість студентів: " + sc);

        Student student1 = new Student();
        student1.nickname = "wrong name";
        student1.setName("john");
        student1.setAge(19);

        Student student2 = new Student();
        student2.nickname = "Gari007";
        student2.setName("Gari");
        student2.setAge(17);

        student1.introduce();
        student2.introduce();

        String strNumber = "234";
        int myNumber = Integer.parseInt(strNumber);

        System.out.println(myNumber);

        sc = Student.getStudentCount();

        System.out.println("Нікнейм студента 1: " + student1.nickname);
        System.out.println(sc);
    }
}

class Student {
    private String name; // ""
    private int age;

    private static int studentCount = 0;
    public String nickname;

    // Конструктор за замовчуванням
    public Student() {
        studentCount ++;
    }

    // Конструктор з параметрами (перегружаємо)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount ++;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Недопустиме ім'я студента");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Привіт! Я " + name + ", мені " + age + " років.");
    }

    public static int getStudentCount() {
        return studentCount;
    }
}