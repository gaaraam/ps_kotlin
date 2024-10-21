import sort.BubbleSort

    fun main() {
        val arr = mutableListOf(5, 1, 4, 2, 8)
        println("정렬전 : $arr")

        val bubbleSort = BubbleSort()
        bubbleSort.testSortByBubble()

        println("정렬 후 : $arr")
    }
