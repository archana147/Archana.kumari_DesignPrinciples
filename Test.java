import java.util.*;
abstract  class Calculator
{ public float n1,n2;
  Calculator(float n1,float n2)
  {
    this.n1=n2;
    this.n2=n2;
 }
 abstract void display();
}
class Add extends Calculator
{
  float sum=0;
  Add(float n1,float n2)
  {
    super(n1,n2);
 sum=n1+n2;
 }
void display()
 { 
  System.out.println("result of +"+"="+sum);
}
}
class Subtract extends Calculator
{
  float diff=0;
  Subtract(float n1,float n2)
  {
    super(n1,n2);
diff=n1-n2;
 }
void display()
{  
  System.out.println("result of -"+"="+diff);
}
}

class Multiply extends Calculator
{
  float product=0;
  Multiply(float n1,float n2)
  {
    super(n1,n2);
   product=n1*n2;
 }
void display()
{ 
  System.out.println("result of *"+"="+product);
}
}
class Divide extends Calculator
  {
   float div=0;
   Divide(float n1,float n2)
    { 
      super(n1,n2);
     div=n1/n2;
    }
   void display()
    {  
     System.out.println("result of /"+"="+div);
    }
}
class Test{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n1 & n2");
  float n1=sc.nextFloat();
 float n2=sc.nextFloat();
  char operator=sc.next().charAt(0);
  Calculator obj1=new Add(n1,n2);
   
  Calculator obj2=new Subtract(n1,n2);
  
  Calculator  obj3=new Multiply(n1,n2);
  
  Calculator  obj4=new Divide(n1,n2);
  if(operator=='+')
   obj1.display();
  else if(operator=='-')
   obj2.display();
  else if(operator=='*')
   obj3.display();
  else if(operator=='/')
   obj4.display();
  else 
  System.out.println("Invalid operator");
 }
} 

  
    
   
  

   
  