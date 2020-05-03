package design.pattern.kt.abstractfactory.listfactory

import design.pattern.kt.abstractfactory.factory.Factory
import design.pattern.kt.abstractfactory.factory.Link
import design.pattern.kt.abstractfactory.factory.Page
import design.pattern.kt.abstractfactory.factory.Tray

class ListFactory: Factory() {
    override fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }
}