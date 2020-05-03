package design.pattern.kt.abstractfactory.tablefactory

import design.pattern.kt.abstractfactory.factory.Factory
import design.pattern.kt.abstractfactory.factory.Link
import design.pattern.kt.abstractfactory.factory.Page
import design.pattern.kt.abstractfactory.factory.Tray

class TableFactory : Factory() {
    override fun createLink(caption: String, url: String): Link {
        return TableLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return TableTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return TablePage(title, author)
    }
}
