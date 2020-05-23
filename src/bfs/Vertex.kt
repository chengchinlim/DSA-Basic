package bfs

data class Vertex<T>(val data: T) {
    private var isVisited = false
    private var neighbors = ArrayList<Vertex<T>>()

    fun setVisited(isVisited: Boolean) {
        this.isVisited = isVisited
    }

    fun getVisited(): Boolean {
        return isVisited
    }

    fun addNeighbor(vertex: Vertex<T>) {
        neighbors.add(vertex)
    }

    fun getNeighbors(): List<Vertex<T>> {
        return neighbors
    }
}