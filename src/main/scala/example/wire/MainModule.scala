package example.wire

import com.softwaremill.macwire._

trait MainModule {
  lazy val moneyEarningBusinessLogic = wire[MoneyEarningBusinessLogic]
  lazy val earnLotsOfMoney = wire[EarnLotsOfMoney]
}
