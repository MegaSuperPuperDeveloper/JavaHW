package JavaHW1;

// Напишите функцию printPrimeNums, которая выведет на экран все простые 
// числа в промежутке от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.

class Answer {
    public void printPrimeNums(){
        for(int i = 1; i < 1000; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if( i % j == 0) count++;
            }
            if(count == 2) System.out.println(i);
            count = 0;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3{ 
    public static void main(String[] args) { 
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}