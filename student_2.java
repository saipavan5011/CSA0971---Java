class student_2 {
    String[][] record = new String[10][5];
    int count = 0;

    public void add(String rol, String na, String dep, String co, String con) {
        if (count < record.length){
            record[count][0] = na;
            record[count][1] = rol;
            record[count][2] = dep;
            record[count][3] = co;
            record[count][4] = con;
            count++;
        }
    }

    public void delete(String roll) {
        for (int i = 0; i < count; i++) {
            if (record[i][1].equals(roll)) {
                record[i] = record[count - 1];
                record[count - 1] = new String[5];
                count--;
                break;
            }
        }
    }

    public void display(String roll) {
        for (int i = 0; i < count; i++) {
            if (record[i][1].equals(roll)) {
                System.out.println("Name: " + record[i][0]);
                System.out.println("Roll: " + record[i][1]);
                System.out.println("Department: " + record[i][2]);
                System.out.println("Course: " + record[i][3]);
                System.out.println("Contact: " + record[i][4]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        student_2 obj = new student_2();
        obj.add("123", "sai", "cse", "java", "98765432");
        obj.add("456", "tej", "aiml", "c++", "95329723");
        obj.delete("456");
        obj.display("123");
    }
}
