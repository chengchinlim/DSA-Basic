package bfs

import java.util.*

class Bfs {
    companion object {
        fun <T>search(root: Vertex<T>) {
            val queue = LinkedList<Vertex<T>>()
            queue.add(root)
            while (queue.isNotEmpty()) {
                val tempVertex = queue.remove()
                tempVertex.setVisited(true)
                print("${tempVertex.data} ")
                for (v in tempVertex.getNeighbors()) {
                    if (!v.getVisited()) {
                        queue.add(v)
                        v.setVisited(true)
                    }
                }
            }
        }
    }
}