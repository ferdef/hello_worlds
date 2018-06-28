class Person(var name: String, var last_name: String)

fun createPerson() {
  var person = Person("Pepe", "López")
  println("Just creted ${person.name} ${person.last_name}")
  person.name = "Jose"
  println("Now renamed to ${person.name} ${person.last_name}")
}

fun sum(a: Int, b: Int) : Int = a + b

fun multiply(a: Int, b: Int) : Int = a * b

fun operate(fn: (Int, Int)->Int, a: Int, b: Int) : Int {
  return fn(a, b)
}


fun main(args: Array<String>) {
  println("Hello, World!")
	for (item in args) {
		println(item)
	}
  createPerson()
  
  val a = 5
  val b = 6
  println("$a + $b = ${operate(::sum, a, b)}")
  println("$a - $b = ${operate({ a:Int, b:Int -> a-b }, a, b)}")
}
