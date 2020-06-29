package design.pattern.kt.proxy

class PrinterProxy(private var name: String): Printable {
    private var real: Printer? = null

    @Synchronized
    override fun setPrinterName(name: String) {
        if (real != null) real!!.setPrinterName(name)
        this.name = name
    }

    override fun getPrinterName(): String {
        return this.name
    }

    override fun print(string: String) {
        realize()
        real!!.print(string)
    }

    @Synchronized
    private fun realize() {
        if (real == null) real = Printer(name)
    }
}