object session {
  println("Welcome to scala session")
  def abs(x: Double) = if (x < 0) -x else x
  abs(-5.3)

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess,x)) guess
    else sqrtIter(improve(guess,x),x)

  def isGoodEnough(guess: Double, x:Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)

  sqrt(2)
  sqrt(4)
  sqrt(1e-6)
  sqrt(x = 1e60)

}