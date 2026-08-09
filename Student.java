class Student{
    public String name;
    public int roll_no;
    public String department;

    public Student(){
        name = "ABC";
        roll_no = 12;
        department = "CSE";
    }
    public Student(String n, int r, String d){
        name = n;
        roll_no = r;
        department = d;
    }
    public Student(Student s){
        name = s.name;
        roll_no = s.roll_no;
        department = s.department;
    }
    void display(){
        System.out.println("Name: " + name + " Roll no.: " + roll_no + " Department: " + department);  
    }
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("XYZ", 24, "CSE");
        Student s3 = new Student(s2);
        s1.display();
        s2.display();
        s3.display();

    }
}