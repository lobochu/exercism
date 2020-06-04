object Leap {
  /*
  Algorithm
  if (year is not divisible by 4) then (it is a common year)
  else if (year is not divisible by 100) then (it is a leap year)
  else if (year is not divisible by 400) then (it is a common year)
  else (it is a leap year)
  For example, 1997 is not a leap year, but 1996 is. 1900 is not a leap year, but 2000 is.
  西元年份除以4不可整除，為平年。
  西元年份除以4可整除，且除以100不可整除，為閏年。
  西元年份除以100可整除，且除以400不可整除，為平年
  西元年份除以400可整除，為閏年。
   */
  def leapYear1(year: Int): Boolean = {
    year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)
  }

  def leapYear(year: Int): Boolean =
    (year % 4, year % 100, year % 400) match {
      case (0, 0, 0) => true
      case (0, 0, _) => false
      case (0, _, _) => true
      case _ => false
    }
}
