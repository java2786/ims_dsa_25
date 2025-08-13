class Student{
    String name;
    public void showDetails(){
        System.out.println("Name: "+name);
    }
}
public class Basic {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Ramesh";
        System.out.println(obj.name);
    }
}
