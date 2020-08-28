import java.util.Scanner
import kotlin.system.exitProcess

fun main(){
        val read = Scanner(System.`in`)
    println("----------------------")
    println("Menghitung volume balok dan bola")
        println("1. Volume balok")
        println("2. Volume Bola")
        println("3. exit")
        println()
        println("Enter Menu Number")
        var input :Int = read.nextInt()

    when (input) {
        1 -> {
            val reader = Scanner(System.`in`)
            val length:Double
            val width:Double
            val height:Double
            val volume : Double
            val confirm: String

            print("Input Panjang : ")
            length = reader.nextDouble()

            print("Input Lebar : ")
            width = reader.nextDouble()

            print("Input Tinggi : ")
            height = reader.nextDouble()

            volume = rectVal(length, width, height)
            val s = String.format("%.2f", volume)
            println("----------------------")
            println("Result Volume Balok = $s")
            println("Again? [Y]es or [N]o")
            confirm = reader.next()
            if (confirm == "y" || confirm == "Y"){
                println("\n")

                return main()
            }
            else if (confirm == "n" || confirm == "N"){
                println("Thanks for using me!!")
                exitProcess(0)
            }
        }
        2 -> {
            val reader = Scanner(System.`in`)
            val radius:Double
            val confirm: String

            val volume : Double

            print("Input radius : ")
            radius = reader.nextDouble()
            volume = ball(radius)
            val s = String.format("%.2f", volume)
            println("----------------------")
            println("Result Volume Bola = $s")
            println("Again? [Y]es or [N]o")
            confirm = reader.next()
            if (confirm == "y" || confirm == "Y"){
                println("\n")

                return main()
            }
            else if (confirm == "n" || confirm == "N"){
                println("Thanks for using me!!")
                exitProcess(0)
            }

        }
        3 -> {
            exitProcess(0)
        }
        else -> {
            val confirm: String
            val reader = Scanner(System.`in`)
            println("Invalid Command")
            println("Back? [Y]es or [N]o")
            confirm = reader.next()
            if (confirm == "y" || confirm == "Y"){
                println("\n")

                return main()
            }
            else if (confirm == "n" || confirm == "N"){
                println("Thanks for using me!!")
                exitProcess(0)
            }
        }
    }
}
fun rectVal(Length: Double, Height: Double, Width: Double):Double {
    return Length * Height * Width
}
fun ball(rad: Double): Double {
    return rad * rad * rad * Math.PI * 4/3
}
