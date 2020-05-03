package design.pattern.kt.abstractfactory

import design.pattern.kt.abstractfactory.factory.Factory
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: java Main class.name.of.ConcreteFactory")
        println("Example 1: java Main listfactory.ListFactory")
        println("Exapmle 2: java Main tablefactory.TableFactory")
        exitProcess(0)
    }
    val factory = Factory.getFactory(args[0])

    val asahi = factory.createLink("朝日新聞", "http://www.asahi.com/")
    val yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/")
    val yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/")
    val jpYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/")
    val excite = factory.createLink("Excite", "http://www.excite.com/")
    val google = factory.createLink("Google", "http://www.google.com/")

    val trayNews = factory.createTray("新聞")
    trayNews.add(asahi)
    trayNews.add(yomiuri)

    val trayYahoo = factory.createTray("Yahoo!")
    trayYahoo.add(yahoo)
    trayYahoo.add(jpYahoo)

    val traySearch = factory.createTray("サーチエンジン")
    traySearch.add(trayYahoo)
    traySearch.add(excite)
    traySearch.add(google)

    val page = factory.createPage("LinkPage", "i-whammy")
    page.add(trayNews)
    page.add(trayYahoo)
    page.output()
}