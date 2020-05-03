package design.pattern.kt.abstractfactory.listfactory

import design.pattern.kt.abstractfactory.factory.Link

class ListLink(caption :String, url: String): Link(caption, url) {
    override fun makeHTML(): String {
        return "<li><a href=\"$url\">$caption</a></li>\n"
    }
}