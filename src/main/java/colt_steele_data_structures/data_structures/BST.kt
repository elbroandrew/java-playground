package colt_steele_data_structures.data_structures

fun main() {

    var n = Node(10)
    var t = Node(12)
    n.left = t
    println(n.left)

}

class Node(var value: Int){
    var left: Node? = null
    var right: Node? = null
}

class BST {
    var root: Int? = null
}

