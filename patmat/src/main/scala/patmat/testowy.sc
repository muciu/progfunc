package patmat
import patmat.Huffman._
object testowy {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val sampleTree = makeCodeTree(
    makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
    Leaf('t', 2))                                 //> sampleTree  : patmat.Huffman.Fork = Fork(Fork(Leaf(x,1),Leaf(e,1),List(x, e)
                                                  //| ,2),Leaf(t,2),List(x, e, t),4)
  weight(sampleTree)                              //> res0: Int = 4
  var chars = List('a', 'a', 'a', 'b', 'd', 'e', 'u', 'f', 'b')
                                                  //> chars  : List[Char] = List(a, a, a, b, d, e, u, f, b)
  chars = List('a', 'a', 'a', 'b', 'c', 'd', 'e', 'u', 'f', 'b', 'c', 'c', 'c')
  var u = chars.groupBy(c => c)                   //> u  : scala.collection.immutable.Map[Char,List[Char]] = Map(e -> List(e), u -
                                                  //| > List(u), f -> List(f), a -> List(a, a, a), b -> List(b, b), c -> List(c, c
                                                  //| , c, c), d -> List(d))
  times(chars).sortWith((p1, p2) => p1._2 < p2._2)//> res1: List[(Char, Int)] = List((e,1), (u,1), (f,1), (d,1), (b,2), (a,3), (c,
                                                  //| 4))
  times(List())                                   //> res2: List[(Char, Int)] = List()
  u.map(c => (c._1, c._2.size))                   //> res3: scala.collection.immutable.Map[Char,Int] = Map(e -> 1, u -> 1, f -> 1,
                                                  //|  a -> 3, b -> 2, c -> 4, d -> 1)
  chars.map(c => (c, 0)).toMap                    //> res4: scala.collection.immutable.Map[Char,Int] = Map(e -> 0, u -> 0, f -> 0,
                                                  //|  a -> 0, b -> 0, c -> 0, d -> 0)
  var k = ('c', 34)                               //> k  : (Char, Int) = (c,34)

  var uc = List("a", "b", "c")                    //> uc  : List[String] = List(a, b, c)
  uc.splitAt(1)                                   //> res5: (List[String], List[String]) = (List(a),List(b, c))
  Nil.takeWhile(c => c != "b")                    //> res6: List[Nothing] = List()
  
  uc.span(c => c != "b")                          //> res7: (List[String], List[String]) = (List(a),List(b, c))
}