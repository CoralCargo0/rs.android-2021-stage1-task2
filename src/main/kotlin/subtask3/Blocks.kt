package subtask3

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        when (blockB) {

            String::class -> {

                var result = ""
                blockA.forEach{
                    if(it is String) {
                        result += it
                    }
                }
                return result
            }

            Int::class -> {

                var sum = 0
                blockA.forEach {
                    if (it is Int) sum += it
                }
                return sum
            }

            else -> {

                var maxDate : LocalDate = LocalDate.parse("0000-01-01")
                blockA.forEach {
                    if(it is LocalDate) {
                        if( it > maxDate) maxDate = it
                    }
                }
                return "${maxDate.dayOfMonth}.${maxDate.monthValue}.${maxDate.year}"
            }
        }

    }
}
