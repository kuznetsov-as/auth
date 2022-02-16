import java.text.SimpleDateFormat
import java.util.*

class MainThread(_infoThread: InfoThread) : Thread() {
    var info: String? = null
    private val infoThread: InfoThread
    init {
        infoThread = _infoThread
    }

    override fun run() {
        sleep(5000)
        while (true) {
            println(getTime())
            info = if (info != null) {
                print(info)
                null
            } else {
                infoThread.info
            }
            sleep(5000)
        }
    }

    private fun getTime(): String {
        val today = Calendar.getInstance()
        val time = SimpleDateFormat("HH:mm:ss").format(today.time)
        return time.toString()
    }
}
