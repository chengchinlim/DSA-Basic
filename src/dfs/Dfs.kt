package dfs

import bfs.Vertex

class Dfs {
    companion object {
        fun <T>search(root: Vertex<T>) {
            root.setVisited(true)
            print("${root.data} ")
            for (v in root.getNeighbors()) {
                if (!v.getVisited()) {
                    search(v)
                }
            }
        }
    }
}