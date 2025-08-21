class Emp1{
public Emp1(String name){
   System.out.println("employee is :"+name);
  }
}

public class Programmer5 extends Emp1{
public Programmer5(){
    super("sakshi");
    System.out.println("Programmer class");
  }

  public static void main(String args[]){
    Programmer5 p = new Programmer5();
  }
}