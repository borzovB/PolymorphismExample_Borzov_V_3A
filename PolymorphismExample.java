/*
Программа создает объекты различных типов (SquareFigures, Rectangle, Square, Triangle), вызывает их методы для вычисления площадей, 
а затем использует метод Type для иллюстрации полиморфизма. Метод Type принимает объект типа SquareFigures, который является родительским классом 
для всех остальных классов, и вызывает его метод CalculatingTheArea(). При этом метод Type может принимать объекты разных типов, проявляя полиморфизм.
*/
package com.mycompany.polymorphismexample;

public class PolymorphismExample {

    public static void main(String[] args) {
        SquareFigures squareFigures = new SquareFigures(); // Создание объекта типа SquareFigures
        Rectangle rectangle = new Rectangle(6, 9); // Создание объекта типа Rectangle
        Square square = new Square(8, 9); // Создание объекта типа Square
        Triangle triangle = new Triangle(6, 10); // Создание объекта типа Triangle

        // Вывод "Обращение к методам:" для обозначения начала вывода методов объектов.
        System.out.println("Обращение к методам:");

        // Вызов методов CalculatingTheArea() для каждого объекта и вывод результатов.
        System.out.println(squareFigures.CalculatingTheArea()); // Вывод площади для squareFigures
        System.out.println(rectangle.CalculatingTheArea()); // Вывод площади для rectangle
        System.out.println(square.CalculatingTheArea()); // Вывод площади для square
        System.out.println(triangle.CalculatingTheArea()); // Вывод площади для triangle

        // Вывод "Польза полиморфизма:" для обозначения начала вывода пользы полиморфизма.
        System.out.println("Польза полиморфизма:");

        // Вызов метода Type для каждого объекта и вывод результатов.
        System.out.println(Type(squareFigures)); // Вызов метода Type для squareFigures
        System.out.println(Type(rectangle)); // Вызов метода Type для rectangle
        System.out.println(Type(square)); // Вызов метода Type для square
        System.out.println(Type(triangle)); // Вызов метода Type для triangle
    }

    // Метод Type принимает объект типа SquareFigures и вызывает его метод CalculatingTheArea().
    // Этот метод иллюстрирует полиморфизм, так как он может принимать разные подклассы SquareFigures.
    public static double Type(SquareFigures squareFigures) {
        return squareFigures.CalculatingTheArea();
    }
}
