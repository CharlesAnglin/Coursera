trait week2 {

  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)


  def singletonSet(int: Int): Set = {
    def sinSet(input: Int) = {
      if (input == int) {
        true
      } else {
        false
      }
    }

    sinSet
  }

  def union(setA: Set, setB: Set): Set = {
    def returnSet(input: Int) = {
      if (contains(setA, input) || contains(setB, input)) {
        true
      } else {
        false
      }
    }

    returnSet
  }

  def intersection(setA: Set, setB: Set): Set = {
    def returnSet(input: Int) = {
      if (contains(setA, input) && contains(setB, input)) {
        true
      } else {
        false
      }
    }

    returnSet
  }

  def diff(setA: Set, setB: Set): Set = {
    def returnSet(input: Int) = {
      if (contains(setA, input) && !contains(setB, input)) {
        true
      } else {
        false
      }
    }

    returnSet
  }

  def filter(set: Set, p: Int => Boolean): Set = {
    def returnSet(input: Int) = {
      if (set(input)) {
        p(input)
      } else {
        false
      }
    }

    returnSet
  }

  def forall(set: Set, p: Int => Boolean): Boolean = {
    def iterator(int: Int): Boolean = {
      if (int == 1001) {
        true
      } else if (contains(set, int) && !p(int)) {
        false
      } else {
        iterator(int + 1)
      }
    }

    iterator(-1000)
  }

  def exists(set: Set, p: Int => Boolean) : Boolean = {
    def iterator(int: Int): Boolean = {
      if (int == 1001) {
        false
      } else if (contains(set, int) && p(int)) {
        true
      } else {
        iterator(int + 1)
      }
    }

    iterator(-1000)
  }

  def map(set: Set, p: Int => Int) : Set = {
    def returnSet(input: Int) = {
      if( exists(set, p(_)==input)){
        true
      } else {
        false
      }
    }

    returnSet
  }


}
