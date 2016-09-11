package example.wire

case class EarnLotsOfMoney(moneyEarningBusinessLogic: MoneyEarningBusinessLogic) {

  def doIt(): String = {
    moneyEarningBusinessLogic.earnMoney(100)
  }
}