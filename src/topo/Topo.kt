package topo

import topo.Vertex
import java.util.*

class Topo<T> {
    private val stack = Stack<Vertex<T>>()

    fun getStack(): Stack<Vertex<T>> {
        return stack
    }

    fun sort(graph: ArrayList<Vertex<T>>) {
        for (v in graph) {
            if (!v.getVisited()) {
                dfs(v)
            }
        }
    }

    private fun dfs(root: Vertex<T>) {
        root.setVisited(true)
        root.setPopped(false)
        for (v in root.getNeighbors()) {
            if (!v.getPopped()) {
                println("Cycle! ${v.data} points to wrong vertex")
                return
            }
            if (!v.getVisited()) {
                dfs(v)
            }
        }
        root.setPopped(true)
        stack.push(root)
    }
}