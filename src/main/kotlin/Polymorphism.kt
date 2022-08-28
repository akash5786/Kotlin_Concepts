fun main() {
    val circle: Shape = Circle(4.0)
    val square: Shape = Square(4.0)

    val shapes = arrayOf(circle, square)
    calculateAreas(shapes)
}

fun calculateAreas(shapes: Array<Shape>) {
    for (shape in shapes){
        println(shape.area())
    }
}

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

