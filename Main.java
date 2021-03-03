import java.util.ArrayList;

class Main {  
  public static void main(String[] args) {    
    Student student1 = new Student();  

    student1.setName("Arnold Spielberg");    
    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");
    // or can do this with the dot operator    
      //student1.name = "Arnold Spielberg";    
      //student1.gpa = 4.0;    
      //student1.major = "Electrical Engineering";  
    student1.print();

    Student student2 = new Student();

    student2.setName("John Trygier");
    student2.setGPA(4.3);
    student2.setMajor("Business Analytics & Operations Management");

    student2.print();
      // or can do this with the dot operator    
          //System.out.println("student1's name is " + student1.name + " and their GPA is" + student1.gpa + " and their major is " + student1.major);  

    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    double gpaSum = 0;
   for (double i : gpas) {
      gpaSum += i;
    }
    System.out.println("The sum of the gpa's is: " + gpaSum);

    double avgGPA = gpaSum / gpas.size();
    System.out.println("The average GPA is: " + avgGPA);
      
  }
}