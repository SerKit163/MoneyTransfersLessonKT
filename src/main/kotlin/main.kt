fun main() {
    val amound = 2500000
    val commission = 0.75
    val minCommission = 3500
    val result = amound * commission / 100

    if (result > minCommission) {
        println("Коммиссия: ${result.toInt()} копеек")
    } else {
        println("Минимальная коммиссия: $minCommission копеек")
    }
}