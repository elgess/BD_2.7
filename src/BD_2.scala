import scala.util.Random

object Main extends App {
  val random = new Random()                             // Создание генератора случайных чисел.
  val numbers = List.fill(10)(random.nextInt(100))      // Генерация списка из 10 случайных чисел от 0 до 99.
  val oddCount = numbers.count(_ % 2 != 0)              // Подсчёт количества нечетных элементов.
  println(s"List: ${numbers.mkString(", ")}")           // Вывод списка.
  println(s"Number of odd elements: $oddCount")         // Вывод количества нечётных элементов.
}