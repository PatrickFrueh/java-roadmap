public class exceptionHandlingExample {
    public static void main(String[] args) {
             try{  
                //code that may raise exception  
                int data=100/0;  
             }catch(ArithmeticException e){System.out.println(e);}  
                //rest - after the exception
                System.out.println("rest of the code...");  
            }  
          }  

