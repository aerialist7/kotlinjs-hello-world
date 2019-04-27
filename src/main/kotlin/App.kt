import kotlin.browser.document
import kotlin.dom.createElement

fun hello() {
    println("Hello World!")

    val div = document.createElement("div") {
        innerHTML = "Hello World!"
    }

    document.body?.appendChild(div)
}