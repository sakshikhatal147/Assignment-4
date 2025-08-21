class Rbi{
 public void roi(){
    System.out.println("In RBI roi = 8 %");
  }
}

public class Bom extends Rbi{
  public void roi(){
    System.out.println("In Bank of Maharashtra roi = 5 %");
  }
  
  public static void main(String args[]){
   Bom b = new Bom();
   b.roi();
  }
}