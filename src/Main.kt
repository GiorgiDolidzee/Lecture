fun main (){
    val coordinate1 = point(X = 3F , Y = 5F)

    val coordinate2 = point(X = 10F , Y = 14F )

    println(message = coordinate1)
    println(message = coordinate2)
    println(message = coordinate1 == coordinate2)
    coordinate1.movingX(3F)
    coordinate2.movingY(5F)


}
class point(private var X: Float, private var Y: Float) {

    fun movingX(k:Float){
        val v = Y - k
        println("კორდინატი1 X-ის მიმართ გადავა:$X;$v კორდინატებში")

    }
    fun movingY(m:Float){
        val v = X - m
        println("კორდინატი2 Y-ის მიმართ გადავა:$v;$Y კორდინატებში")
    }


    override fun toString(): String {
        return "($X;$Y)"
    }

    override fun equals(other: Any?): Boolean {
        if (other is point) {
            if (X == other.X && Y == other.Y) {
                return true
            }
        }
        return false
    }

}