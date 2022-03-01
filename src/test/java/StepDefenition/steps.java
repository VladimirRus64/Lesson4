package StepDefenition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class steps {
    int a;
    int b;
    int sum;
    int sub;
    int multipl;
    int div;

    @Дано("^два числа (.*) и (.*)$")
    public void given(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Тогда("^находим сумму двух чисел$")
    public void summa(){

        sum = a + b;
    }

   @И("^выводим сумму на экран$")
    public void printResultSubtraction(){
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum);
    }

    @Тогда("^находим разность двух чисел$")
    public void subtraction(){

        sub = a - b;
    }

    @И("^выводим разность на экран$")
    public void printResultSubdsttaction(){
        System.out.println("Разность чисел " + a + " и " + b + " равна " + sub);
    }

    @Тогда("^находим произведение двух чисел$")
    public void multiplication(){

        multipl = a * b;
    }

    @И("^выводим произведение на экран$")
    public void printResultMultiplication(){
        System.out.println("Произведение чисел " + a + " и " + b + " равно " + multipl);
    }
    @Тогда("^находим частное двух чисел$")
    public void division(){

        div = a / b;
    }

    @И("^выводим частное на экран$")
    public void printResultDivision(){
        System.out.println("Деление чисел " + a + " и " + b + " равно " + div);
    }

}
