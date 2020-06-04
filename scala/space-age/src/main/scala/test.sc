"Hello world"

def fib(n: Int): Int = {
  def fibIter(i: Int, a: Int, b: Int): Int =
    if (i == n) a else fibIter(i+1, b, a+b)
  fibIter(0, 0, 1)
}

fib(3)

def square(x: Double) = x * x

square(3)

def abs(x: Double) = if (x<0) -x else x



def sqrt(x: Double) = {
  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double) =
    (guess + x / guess) / 2

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  sqrtIter(1.0)
}

sqrt(3)
sqrt(4)



def factorial(n: Int): Int = {
  def loop(acc: Int, n: Int): Int = {
    if (n ==0) acc
    else loop(acc * n, n-1)
  }
  loop(1, n)
}

factorial(10)


abstract class  IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}

