package example.wire

class MoneyEarningBusinessLogic() {

  // stateful
  var total:Int = 0;

  def earnMoney(howMuch: Int): String = {
    total += howMuch
    s"Just earned another $$$howMuch. New total is $$$total!!!"
  }
}