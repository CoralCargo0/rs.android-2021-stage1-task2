package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val aa = a.length
        val bb = b.length
        var i = 0
        var j = 0
        while(j < aa) {
            if(b[i] == a[j] || b[i] + 32 == a[j] || b[i] - 32 ==a[j]) {
                i++
                if(i >= bb) return "YES"
                j--
            }
            j++
        }
        return "NO"
    }
}
