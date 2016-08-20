trait week1 {

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) {
      1
    } else {
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  def balance(chars: List[Char]): Boolean = {

    def bracketCounter(counter: Int, chars: List[Char]): Boolean = {
      if (counter < 0) {
        false
      } else if (chars.isEmpty && counter == 0) {
        true
      } else if (chars.isEmpty) {
        false
      } else if (chars.head.toString == ")") {
        bracketCounter(counter - 1, chars.tail)
      } else if (chars.head.toString == "(") {
        bracketCounter(counter + 1, chars.tail)
      } else {
        bracketCounter(counter, chars.tail)
      }
    }

    bracketCounter(0, chars)
  }

  def countChange(money: Int, coins: List[Int]): Int = {

    def coinIterate(money: Int, coins: List[Int]): Int = {
      if (coins.isEmpty) {
        0
      } else {
        countChange2(coins.head, money - coins.head, coins) + coinIterate(money, coins.tail)
      }
    }

    def countChange2(coin: Int, money: Int, coins: List[Int]): Int = {
      val coinsFiltered = coins.filter(_ <= money).filter(_ >= coin)

      if (money == 0) {
        1
      } else {
        coinIterate(money, coinsFiltered)
      }
    }

    if (money == 0 || coins.isEmpty) {
      0
    } else {
      countChange2(0, money, coins)
    }
  }

}

