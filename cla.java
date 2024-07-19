class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range. Age must be between 15 and 21.");
        }
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name not valid. Name must not contain numbers or special symbols.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course + "]";
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John Doe", 18, "Computer Science");
            System.out.println(student1);

            Student student2 = new Student(2, "Jane@Doe", 19, "Engineering");
            System.out.println(student2);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            Student student3 = new Student(3, "Alice", 22, "Mathematics");
            System.out.println(student3);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
