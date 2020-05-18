package design.pattern.kt.visitor

fun main() {
    println("Making root entries")
    val root = Directory("root")
    val bin = Directory("bin")
    val tmp = Directory("tmp")
    val usr = Directory("usr")
    root.add(bin)
    root.add(tmp)
    root.add(usr)
    bin.add(File("vi", 10000))
    bin.add(File("latex", 20000))
    root.accept(ListVisitor())

    println("======")

    println("Making user entries")
    val yuki = Directory("yuki")
    val hanako = Directory("hanako")
    val tomura = Directory("tomura")
    usr.add(yuki)
    usr.add(hanako)
    usr.add(tomura)
    yuki.add(File("dialy.html", 100))
    yuki.add(File("Composite.java", 200))
    hanako.add(File("index.html",300))
    tomura.add(File("game.doc", 400))
    tomura.add(File("junk.mail", 500))
    val fileFindVisitor = FileFindVisitor(".html")
    root.accept(fileFindVisitor)
    val iterator = fileFindVisitor.getFoundFiles()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("======")

    val elementArrayList = ElementArrayList()
    elementArrayList.add(root)
    elementArrayList.add(File("etc.html", 1234))
    elementArrayList.accept(ListVisitor())
}