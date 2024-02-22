import kotlin.coroutines.coroutineContext

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    greetingName("Hello , Nancy)")
    add (1 ,4 ,5 ,6 ,8)
    interest("I am an actor")
    remainder(35,6)


}
fun greetingName(name: String){
    var name = "Hello, Nancy"
    var result = "Hello, Nancy"
    println(result)


}
fun remainder(num1:Int , num2: Int){
    var result = num1 % num2
    print(result)

}
fun add(f:Int, g:Int, h:Int, d:Int, e:Int){
    var result = f + g +h + d + e
    println(result)
}
fun interest(text:String) {
    var fact = "I am an actor"
    println(fact)
}

