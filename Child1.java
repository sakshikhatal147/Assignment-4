class Parent{
String name="Ashok";
}
public class Child1 extends Parent{
   String name="sakshi";
   {
   System.out.println("name is : "+name);
   System.out.println("name is : "+super.name);
   }
 public static void main(String args[]){
  Child1 c = new Child1();

 }
}