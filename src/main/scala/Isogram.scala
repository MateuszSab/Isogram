object Isogram extends App {

  def isIsogram(line: String) = {
    val lettersSplit = line.split("\\W+").flatMap(letter => letter.toCharArray)
    val lettersDist = lettersSplit.distinct
    if (lettersDist sameElements lettersSplit) true
    else false
  }

}
