fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    // Solution using orEmpty()
    val nullableList: List<Int>? = null
    val nullableResult = (nullableList ?: emptyList()).map { it * 2 }
    println(nullableResult) // Output: []

    //Alternative Solution using let
    val nullableList2: List<Int>? = null
    val nullableResult2 = nullableList2?.let { it.map { it * 2 } } ?: emptyList()
    println(nullableResult2) // Output: []
}