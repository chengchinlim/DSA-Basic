package bfs

import java.util.*

class Bfs {
    companion object {
        fun <T>search(root: Vertex<T>, target: Vertex<T>): Int {
            var count = 0
            val queue = LinkedList<Vertex<T>>()
            queue.add(root)
            var lastVertex = root
            while (queue.isNotEmpty()) {
                val tempVertex = queue.remove()
                tempVertex.setVisited(true)
                print("${tempVertex.data} ")
                for (v in tempVertex.getNeighbors()) {
                    if (v.data == target.data) {
                        return count
                    }
                    if (!v.getVisited()) {
                        queue.add(v)
                        v.setVisited(true)
                    }
                }
            }
            return count
        }
    }
}