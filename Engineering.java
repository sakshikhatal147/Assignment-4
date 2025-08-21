class College{
void study(){
  System.out.println("IN college-Study");
 }
}

public class Engineering extends College{
void study(){
 super.study();
 System.out.println("IN Engineering-Study");
 }

public static void main(String args[]){
 Engineering e =new Engineering();
 e.study();
 }
}