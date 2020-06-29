package design.pattern.kt.proxy

class Printer(name: String) : Printable {

    private lateinit var name: String

    override fun setPrinterName(name: String) {
        this.name = name
    }

    override fun getPrinterName(): String {
            return name
    }

    override fun print(string: String) {
        println("=== $name ===")
        println(string)
    }

    private fun heavyJob(msg: String) {
        println(msg)
        repeat(5) {
            try {
                Thread.sleep(1000L)
            } catch (e: InterruptedException) {

            }
            println(".")
        }
    }

    init {
        setPrinterName(name)
        heavyJob("Printerのインスタンス($name)を生成中")
    }
}