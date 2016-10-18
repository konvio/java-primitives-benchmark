######Кононенко Віталій, К-24
#Лабораторна робота №1
###Визначення швидкодії обчислювальної системи

##Огляд 
Проведено наближене вимірювання шкидкості виконання елементарних 
арифметичних операцій (+, -, *, /) над елементирнити типами мови 
програмування **Java** (byte, short, int, long, float, double). Вимірювання
проводилися за допомогою спеціалізованої бібліотеки [Caliper](https://github.com/google/caliper).

##Результати
               benchmark     ns linear runtime
            ByteAddition  0.414 =
           ShortAddition  0.807 =
             IntAddition  0.428 =
            LongAddition  0.403 =
           FloatAddition  1.562 ===
          DoubleAddition  1.623 ===
             
         ByteSubtraction  0.691 =
        ShortSubtraction  0.805 =
          IntSubtraction  0.692 =
         LongSubtraction  0.432 =
        FloatSubtraction  1.591 ===
       DoubleSubtraction  1.589 ===
             
      ByteMultiplication  1.202 ==
     ShortMultiplication  1.188 ==
       IntMultiplication  1.193 ==
      LongMultiplication  1.293 ==
     FloatMultiplication  1.551 ===
    DoubleMultiplication  1.603 ===
             
            ByteDivision  2.371 ====
           ShortDivision  4.015 =======
             IntDivision  3.062 =====
            LongDivision 15.452 ==============================
           FloatDivision  4.361 ========
          DoubleDivision  5.140 =========
В ході винання лабораторної роботи було отримано наближений час виконання
кожної елементрарної операції над кожним з типів у наносекундах. За результатами
вимірювань, найбільше часу займає операція ділення (/), найбільш швидкими є
операції додавання (+) та віднімання (-), швидкість виконання кожної операції
збільшується зі збільшенням бітності її операндів.

##Хід виконання
Лабораторна робота складається з набору тестових методів для кожного
вимірювання та бібліотечного класу для їх проведення. Кожен з методів має
аргумент типу int, який характеризує кількість ітерацій вимірюваної операції.
Кожен метод з відповідним достатньо великим параметром викликається бібліотечним
класом для проведення вимірювань. Перед кожним вимірювання біблітека проводить
"розігрів" JVM, слідкує за уникненням JIT-оптимізації, кожне вимірювання
 проводить як мінімум 3 рази(кількість ітерацій 1x, 0.5x, 2x), аналізує
 отримані результати (у разі недотримання пропорції повідомляє про помилку),
 за необхідності при великому відхиленні від середнього значення може провести
 до 10 додаткових тестів.
 
 ##Зразок коду 
     
 ```java
     import com.google.caliper.SimpleBenchmark;
     import com.google.caliper.Runner;
     
          public class Main {
              public static void main(String[] args) {
                  Runner.main(AllBenchmarks.class, new String[]{});
              }
          }
          
          class AllBenchmarks extends SimpleBenchmark{
              public int timeIntAddition(int reps) {
                  int result = 0;
                  for (int i = 0; i < reps; ++i) {
                      result += i;
                  }
                  return result;
              }
     
              public int timeIntSubtraction(int reps) {
                  int result = 0;
                  for (int i = 0; i < reps; ++i) {
                      result -= i;
                  }
                  return result;
              }
     
              public int timeIntMultiplication(int reps) {
                  int result = 1;
                  for (int i = 1; i < reps; ++i) {
                      result *= i;
                  }
                  return result;
              }
     
              public int timeIntDivision(int reps) {
                  int result = 324213431;
                  int term = 3;
                  for (int i = 1; i < reps; ++i) {
                      result /= term;
                      result += 3234134;
                  }
                  return result; 
              }
          
              public double timeDoubleAddition(int reps) {
                  double result = 0;
                  double term = 23432.342421342142143;
                  for (int i = 0; i < reps; ++i) {
                      result += term;
                  }
                  return result;
              }
          
              public long timeLongDivision(int reps) {
                  long result = 1313841983479183498L;
                  long repsLong = reps;
                  for (long i = 1; i < reps; ++i) {
                      result /= i;
                  }
                  return result;
              }
          
              public long timeLongMultiplication(int reps) {
                  long result = 1;
                  long repsLong = reps;
                  for (long i = 1; i < reps; ++i) {
                      result *= i;
                  }
                  return result;
              }
          
              public double timeDoubleMultiplication(int reps) {
                  double result = 1;
                  double term = 3.32431234341;
                  for (int i = 0; i < reps; ++i) {
                      result *= term;
                  }
                  return result;
              }
           }
 ```
