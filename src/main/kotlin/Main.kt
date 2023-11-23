fun main(args: Array<String>)
{
    //#1
    val age1:Int = 42 //Int
    val age2:Int = 21 //Int
    //#2
    val avg1 = ((age1 + age2)/2)
    println(avg1)
    //#3
    //#4,5
    val firstName = "Stas"
    val lastName = "Kilin"
    val fullName = (firstName +" "+ lastName)
    println(fullName)
    //#6
    val myDetalls = "Привет, меня зовут $fullName!"
    println(myDetalls)
    //#7,8,9
    val button:Triple<Int,Int,Int> = Triple(7,12,5)
    println(button.first)
    println(button.second)
    println(button.third)
}