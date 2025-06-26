public class method {
    //method
        int add(){
        int a=10;
        int b=20;
        int sum=a+b;
        return sum;
    }
//method with parameter
    int addition(int c,int d){
        int  summ=c+d;
        return summ;
    }
    //default constructor
    method(){
        System.out.println("this is default constructor");
    }
    public static void main(String[] args) {
        method m =new method();
        System.out.println(m.add());
    }
     
}
