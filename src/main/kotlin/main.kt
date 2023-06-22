fun main() {
    // Координаты вершин треугольника
    println("Введите координаты X первого угла треугольника");
    val x1 = readln().toInt()
    println("Введите координаты Y первого угла треугольника");
    val y1 = readln().toInt()

    println("Введите координаты X второго угла треугольника");
    val x2 = readln().toInt()
    println("Введите координаты Y второго угла треугольника");
    val y2 = readln().toInt()

    println("Введите координаты X третьего угла треугольника");
    val x3 = readln().toInt()
    println("Введите координаты Y третьего угла треугольника");
    val y3 = readln().toInt()

    // Проверка на существование треугольника
    val isTriangle = !((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3))

    if (!isTriangle) {
        println("Треугольник не существует")
        return
    }


    // Координаты проверяемой точки
    println("Ввелите координаты Х точки");
    val pointX = readln().toInt()
    println("Ввелите координаты Y точки");
    val pointY = readln().toInt()

    // Вычисление площади треугольника
    val triangleArea = 0.5 * ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1))
    
    // Вычисление площадей подтреугольников
    val subTriangleArea1 = 0.5 * ((x2 - pointX) * (y3 - pointY) - (x3 - pointX) * (y2 - pointY))
    val subTriangleArea2 = 0.5 * ((x1 - pointX) * (y3 - pointY) - (x3 - pointX) * (y1 - pointY))
    val subTriangleArea3 = 0.5 * ((x1 - pointX) * (y2 - pointY) - (x2 - pointX) * (y1 - pointY))

    // Проверка, находится ли точка внутри треугольника
    if (subTriangleArea1 > 0 && subTriangleArea2 > 0 && subTriangleArea3 > 0 ||
        subTriangleArea1 < 0 && subTriangleArea2 < 0 && subTriangleArea3 < 0
    ) {
        println("Точка находится внутри треугольника")
    } else {
        println("Точка находится вне треугольника")
    }
}