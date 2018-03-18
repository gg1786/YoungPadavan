package Lesson2;

public class Calculator implements Info{
    public int num1;
    public int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void multiplaction(int num1, int num2){
        System.out.println ("Mltiplaction "+ this.num1 * this.num2);
    }

    public void division(int num1, int num2){
        System.out.println ("Division "+ this.num1 / this.num2);
    }

    public void subtraction(int num1, int num2){
        System.out.println ("Subtraction "+ this.num1 * this.num2);
    }

    public void addition(int num1, int num2){
        System.out.println ("Addition "+ this.num1 + this.num2);
    }

}
