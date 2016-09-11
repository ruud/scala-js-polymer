package example.wire

case class MoneyEarningBusinessLogic() {

  var total:Int = 0;

  def earnMoney(howMuch: Int): String = {
    total += howMuch
    s"Just earned another $$$howMuch! of total $total"
  }
}