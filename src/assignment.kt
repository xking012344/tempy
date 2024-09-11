//temperature converter

fun main() {
    val celToFah : (Double) -> Double = {
        (9.0 / 5.0) * it + 32
    }

    val kelToCel : (Double) -> Double = {
        it + 273.15
    }

    val fahToKel : (Double) -> Double = {
        (5.0 / 9.0) * (it - 32) + 273.15
    }

    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celToFah)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelToCel)
    printFinalTemperature(360.0, "Fahrenheit", "Kelvin", fahToKel)

}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}