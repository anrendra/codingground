public class HelloWorld{
    int rno;
    String name;
    HelloWorld(){
         System.out.println("Defeault Constructor");
    }
     HelloWorld(int rno,String name){
         this.rno=rno;
         this.name=name;
        // System.out.println("Defeault Constructor");
    }
     public static void m2(){
          System.out.println("Static Method");
     }
     static {
          System.out.println("Static Block");
     }
     {
          System.out.println("InstanceBlock");
     }
     
    public String toString(){//overriding the toString() method  
  return rno+" "+name;  
 }  
     public static void main(String []args)throws InterruptedException{
        System.out.println("Hello World");
     HelloWorld h=new  HelloWorld(101,"NATARAZ");
        h.m1();
        h.m2();
        System.out.println(h);
     }
     public void m1()  {
          System.out.println("Hello World");
         //Thread.sleep(10);
         try{
          System.out.println(10/2);
          }catch(Exception e){
            System.out.println(e.toString());
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            
         }
          System.out.println("Hello World");
         
     }
    
}
