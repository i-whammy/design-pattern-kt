package design.pattern.kt.abstractfactory.factory

abstract class Factory {
    companion object {
        fun getFactory(classname: String): Factory {
            return Class.forName(classname).getDeclaredConstructor().newInstance() as Factory
        }
    }

    abstract fun createLink(caption: String, url: String) : Link
    abstract fun createTray(caption: String) : Tray
    abstract fun createPage(title: String, author: String) : Page
}