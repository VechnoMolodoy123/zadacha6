fun main() {
    println("Введите первую цифру:")
    //trim возвращает строку, в которой удалены начальные и конечные пробелы
    val firstDigit = readlnOrNull()?.trim()

    println("Введите вторую цифру:")
    val secondDigit = readlnOrNull()?.trim()

    // Проверяем корректность ввода
    if (firstDigit == null || secondDigit == null ||
        firstDigit.length != 1 || secondDigit.length != 1 ||
        !firstDigit.all { it.isDigit() } || !secondDigit.all { it.isDigit() } ||
        firstDigit == secondDigit) {
        println("Ошибка: Введите две различные цифры.")
        return
    }

    // Преобразуем введенные символы в цифры
    val digit1 = firstDigit[0]
    val digit2 = secondDigit[0]

    // Создаем число из двух цифр
    val number1 = "$digit1$digit2"
    val number2 = "$digit2$digit1"

    // Проверяем, является ли одно из чисел нечетным
    if (number1.toInt() % 2 == 1) {
        println("Создано нечетное число: $number1")
    } else if (number2.toInt() % 2 == 1) {
        println("Создано нечетное число: $number2")
    } else {
        println("Создать нечетное число невозможно.")
    }
}