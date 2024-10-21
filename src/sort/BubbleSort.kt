package sort

class BubbleSort {
    // 버블 정렬 : 비교함 - 배열에서 인덱스와 인덱스를 비교해서 큰 수를 뒤로 교환함
    fun sortByBubble(arr: MutableList<Int>){
        var n = arr.size
        for(i in 0 until n-1){
            for(j in 0 until n-i-1){
                if(arr[j]> arr[j+1]){
                    var temp = arr[j]
                    arr[j] = arr[j+1]
                    arr[j+1] = temp
                }
            }
        }
    }

    fun testSortByBubble(){
        val testCases = listOf(
            mutableListOf(5,1,4,2,8),
            mutableListOf(),
            mutableListOf(1),
            mutableListOf(1,2,3,4,5),
            mutableListOf(5,4,3,2,1)
        )

        val expectedResults = listOf(
            listOf(1,2,4,5,8),
            listOf(),
            listOf(1),
            listOf(1,2,3,4,5),
            listOf(1,2,3,4,5)
        )

        for(i in testCases.indices){
            sortByBubble(testCases[i])
            if(testCases[i] == expectedResults[i]){
                println("테스트케이스 $i : 성공")
            } else {
                println("테스트케이스 $i : 실패")
                println("기대결과 : ${expectedResults[i]}, 실제결과 : ${testCases[i]}")
            }
        }
    }

}