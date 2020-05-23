package bfs

fun main() {
    val v1 = Vertex(1)
    val v2 = Vertex(2)
    val v3 = Vertex(3)
    val v4 = Vertex(4)
    val v5 = Vertex(5)
    val v6 = Vertex(6)
    val v7 = Vertex(7)

    v1.addNeighbor(v2)
    v1.addNeighbor(v3)
    v1.addNeighbor(v7)

    v2.addNeighbor(v1)
    v2.addNeighbor(v4)

    v3.addNeighbor(v5)
    v3.addNeighbor(v6)

    v5.addNeighbor(v3)

    v7.addNeighbor(v4)

//    Bfs.search(v1)
//    println("Steps to find v7 start from v2 is ${Bfs.search(v2, v7)}")
    println("Steps to find v6 start from v2 is ${Bfs.search(v2, v6)}")
}