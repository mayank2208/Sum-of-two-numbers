
package javaapplication23;

class PlusNos{

        int a,b,c;
        
        PlusNos(int a,int b){
            this.a=a;
            this.b=b;
            
        }
        
        void sum(){
            c=a+b;
        }
        
       void display(){
           System.out.println(+c);
       }
}


public class JavaApplication23 {

    
    public static void main(String[] args) {
     
        PlusNos plus=new PlusNos(50,40);
        plus.sum();
        plus.display();
    }
    
}
