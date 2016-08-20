object main extends App with week1 with week2 {

//  println(countChange(4, List(1,2)))

  val set4 = singletonSet(4)
  val set5 = singletonSet(5)
  val set6 = singletonSet(6)
  val union56 = union(set5,set6)
  val int5 = intersection(union56, set5)
  val dif5 = diff(set4, union56)
  val union46 = union(set4, set6)

  def filter5(int: Int) = {
    if(int == 5){
      false
    } else {
      true
    }
  }

  def isEven(int: Int) = {
    if(int % 2 == 0){
      true
    } else {
      false
    }
  }

  def double(int: Int) = {
    int * 2
  }

  val filtered = filter(union56, filter5)
  val mapped = map(union56, double)

  println(contains(mapped, 5))
  println(contains(mapped, 6))
  println(contains(mapped, 10))
  println(contains(mapped, 11))
  println(contains(mapped, 12))

}
