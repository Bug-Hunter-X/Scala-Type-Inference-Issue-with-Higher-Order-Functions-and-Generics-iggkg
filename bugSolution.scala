```scala
class MyClass[T](val value: T) {
  def myMethod(f: T => T): T = f(value)
}

object Main extends App {
  val myInt = new MyClass(5)
  val resultInt = myInt.myMethod((x: Int) => x * 2)
  println(s"Result Int: $resultInt")

  val myString = new MyClass("hello")
  val resultString = myString.myMethod((x: String) => x + " world")
  println(s"Result String: $resultString")
}
```