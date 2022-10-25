
    import kotlin.math.PI
    import kotlin.math.pow
    import kotlin.math.sqrt
//pl1
    fun main() {
        val exercises: Int = 13
        var exercisesSolved: Int = 0
        exercisesSolved += 1
//pl2
        val Age: Int = 18
        println(Age)
        exercisesSolved += 1
//pl3
        var myAge: Double = 18.0
        var averageAge = (18 + 30) / 2
        println(averageAge)
        exercisesSolved += 1
//pl4
        val testNumber: Int = 457
        val evenOdd: Int = testNumber%2
        println(evenOdd)
        exercisesSolved += 1
//pl5
        var answer : Int = 0
        answer = answer+1
        answer = answer+10
        answer = answer*10
        answer= answer shr 3
        println(answer)
        exercisesSolved += 1
//pl6
        var age : Int
        age = 16
        print(age)
        age = 30
        print(age)
        exercisesSolved += 1
//pl7
        val A: Int = 46
        val B: Int = 10
        val answer1: Int =(A*100)+B
        val answer2: Int =(A*100)+(B*100)
        val answer3: Int =(A*100)+(B/10)
        println(answer1)
        println(answer2)
        println(answer3)
        exercisesSolved += 1
    //pl8
        var number: Int

        number=(5*3)-(4/2*2)
        println(number)
        exercisesSolved += 1
        //pl9
        val a: Double = 5.0
        val b: Double = 6.0
        val average: Double = (a+b)/2
        println(average)
        exercisesSolved += 1
        //pl10
        val fahrenheit: Double = 120.0
        val celcius: Double = (fahrenheit/1.8)-32
        println(celcius)
        exercisesSolved += 1
        //pl11
        val position: Int = 45
        val row: Int= position/8
        val column:Int= position%8
        println(position)
        println(row)
        println(column)
        exercisesSolved += 1
        //pl12
        val degrees: Double = 60.0
        val radians: Double = (degrees * PI) / 180.0
        println(radians)
        exercisesSolved += 1

    }