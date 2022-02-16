fun main() {
    val infoThread = InfoThread()
    val mainThread = MainThread(infoThread)
    mainThread.start()
    infoThread.start()
}