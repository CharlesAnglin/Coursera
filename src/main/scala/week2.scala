trait week2 {

  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)

  def evenInts(int : Int) = {
    if(int % 2 == 0){
      true
    } else {
      false
    }
  }


  def singletonSet(int: Int) = {
    ???
  }

}
