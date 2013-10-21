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
  
  createCodeTree("Abrakadabra".toList)            //> res8: patmat.Huffman.CodeTree = Fork(Leaf(a,4),Fork(Fork(Leaf(d,1),Fork(Leaf
                                                  //| (A,1),Leaf(k,1),List(A, k),2),List(d, A, k),3),Fork(Leaf(b,2),Leaf(r,2),List
                                                  //| (b, r),4),List(d, A, k, b, r),7),List(a, d, A, k, b, r),11)
  decodedSecret                                   //> res9: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  2                                               //> res10: Int(2) = 2
  3                                               //> res11: Int(3) = 3
  4                                               //> res12: Int(4) = 4
  
  makeOrderedLeafList(List(('c', 1), ('a', 1), ('b', 2)))
                                                  //> res13: List[patmat.Huffman.Leaf] = List(Leaf(c,1), Leaf(a,1), Leaf(b,2))
  var leafs = List(Leaf('a', 1), Leaf('b', 1), Leaf('c', 2), Leaf('d', 5), Leaf('e', 5), Leaf('f', 6))
                                                  //> leafs  : List[patmat.Huffman.Leaf] = List(Leaf(a,1), Leaf(b,1), Leaf(c,2), L
                                                  //| eaf(d,5), Leaf(e,5), Leaf(f,6))
  combine(leafs)                                  //> res14: List[patmat.Huffman.CodeTree] = List(Fork(Leaf(a,1),Leaf(b,1),List(a,
                                                  //|  b),2), Leaf(c,2), Leaf(d,5), Leaf(e,5), Leaf(f,6))
  var ct = Fork(Leaf('a', 10), Fork(Leaf('b', 3), Leaf('c', 9), List('b', 'c'), 12), List('a','b', 'c'), 22)
                                                  //> ct  : patmat.Huffman.Fork = Fork(Leaf(a,10),Fork(Leaf(b,3),Leaf(c,9),List(b
                                                  //| , c),12),List(a, b, c),22)
  decode(ct, List(0, 0, 1, 0, 1, 1))              //> res15: List[Char] = List(a, a, b, c)
  
 // createCodeTree("cba".toList)
}