package topo

import topo.Vertex

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

    v2.addNeighbor(v4)

    v3.addNeighbor(v5)
    v3.addNeighbor(v6)

    v5.addNeighbor(v7)

    v7.addNeighbor(v4)

//    v7.addNeighbor(v1) // test cycle

    val graph = ArrayList<Vertex<Int>>()
    graph.add(v7)
    graph.add(v5)
    graph.add(v4)

    graph.add(v1)
    graph.add(v2)
    graph.add(v3)
    graph.add(v6)


    val topo = Topo<Int>()
    topo.sort(graph)
    val stack = topo.getStack()
    while (stack.isNotEmpty()) {
        print("${stack.pop().data} ")
    }
}