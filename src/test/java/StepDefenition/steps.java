package StepDefenition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import io.qameta.allure.Step;

public class steps {
    int a;
    int b;
    int sum;
    int sub;
    int multipl;
    int div;

    @Step("Получаем на входе числа {a} и {b}")
    @Дано("^два числа (.*) и (.*)$")
    public void given(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Step("Находим сумму двух чисел")
    @Тогда("^находим сумму двух чисел$")
    public void summa(){

        sum = a + b;
    }

    @Step("Выводим сумму на экран")
    @И("^выводим сумму на экран$")
    public void printResultSubtraction(){
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum);
    }

    @Step("Находим разность двух чисел")
    @Тогда("^находим разность двух чисел$")
    public void subtraction(){

        sub = a - b;
    }
    @Step("Выводим разность на экран")
    @И("^выводим разность на экран$")
    public void printResultSubdsttaction(){
        System.out.println("Разность чисел " + a + " и " + b + " равна " + sub);
    }

    @Step("Находим произведение двух чисел")
    @Тогда("^находим произведение двух чисел$")
    public void multiplication(){

        multipl = a * b;
    }
    @Step("Выводим произведение на экран")
    @И("^выводим произведение на экран$")
    public void printResultMultiplication(){
        System.out.println("Произведение чисел " + a + " и " + b + " равно " + multipl);
    }
    @Step("Находим частное двух чисел")
    @Тогда("^находим частное двух чисел$")
    public void division(){

        div = a / b;
    }
    @Step("Выводим частное на экран")
    @И("^выводим частное на экран$")
    public void printResultDivision(){
        System.out.println("Деление чисел " + a + " и " + b + " равно " + div);
    }

}
