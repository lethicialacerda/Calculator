public class Calculator { 
    //calculadora aritmética
    public Calculator(){
        //constructor
    }
    
    public int add(int a, int b){
       return a+b;
        //method 1
    }
    
    public int subtract(int a, int b){
        return a-b;
        //method 2
    }
    
    public int multiply(int a, int b){
        return a*b;
        //method 3
        
    }
    
    public int divise(int a, int b){
        return a/b;
        //method 4
    }
    
    public int modulo(int a, int b){
        return a%b;
        //method 5
    }
    
    public static void main(String [] args){
      Calculator myCalculator = new Calculator();//objeto
      int difference = myCalculator.subtract(45,11);
      System.out.println(difference);
    }
    
}