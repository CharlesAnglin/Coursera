trait week2 {

  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)



  def singletonSet(int: Int) : Set = {
    def sinSet(input: Int) = {
      if(input == int){
        true
      } else {
        false
      }
    }

    sinSet
  }

  def union (setA: Set, setB: Set) : Set = {
    def returnSet (input: Int) = {
      if(contains(setA, input) || contains(setB, input)){
        true
      } else {
        false
      }
    }

    returnSet
  }

  def intersection (setA: Set, setB: Set) : Set = {
    def returnSet (input: Int) = {
      if(contains(setA, input) && contains(setB, input)){
        true
      } else {
        false
      }
    }

    returnSet
  }

  def diff (setA: Set, setB: Set) : Set = {
    def returnSet(input: Int) = {
      if(contains(setA, input) && !contains(setB, input)){
        true
      } else {
        false
      }
    }

    returnSet
  }

  def filter (set: Set, p: Int => Boolean) : Set = {
    def returnSet(input: Int) = {
      if(set(input)){
        p(input)
      } else {
        false
      }
    }

    returnSet
  }


}
