package subtask1

import java.text.SimpleDateFormat
import java.util.*


class DateFormatter {
    private var printedFormatterDate = SimpleDateFormat("dd MMMM, EEEE", Locale("ru"))

    fun toTextDay(day: String, month: String, year: String): String {

        when {
            month.toInt() > 12 -> return "Такого дня не существует"
            day.toInt() > 31 -> return "Такого дня не существует"
            month == "2" && year.toInt() % 4 ==0 && day.toInt() > 29 -> return "Такого дня не существует"
            month == "2" && day.toInt() > 28 -> return "Такого дня не существует"
            month in arrayOf("4", "6", "9", "11") && day.toInt() > 30 -> return "Такого дня не существует"

        }
        val cal = GregorianCalendar(year.toInt(), month.toInt() - 1, day.toInt())
        return printedFormatterDate.format(cal.time)
    }
}
