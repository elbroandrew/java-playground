package colt_steele_data_structures.data_structures

fun main() {



}

class Node(var value: Int){
    var left: Node? = null
    var right: Node? = null
}

class BST {
    private var root: Node? = null

    fun insert(value: Int){
        var n = Node(value)
        if (root == null){
            root = n
            return
        }
        var currentNode = root
    }

}

