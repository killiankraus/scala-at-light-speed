def repeatStr(re: Int, str: String): String = List.fill(re)(str).mkString("")

repeatStr(3, "$")
val a = List(1,2,3)
val b = List(4,5,6)
val c = b ::: a
