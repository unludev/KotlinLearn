package `5 - Scoope Functions`

/**
 * contextobject.also{..(it) ..} return value contextObject
 *
 * Property ve fonksiyonlardan ziyade bir obje referansi icin kullanilir veya bir dis scopedan this referansini
shadowlamamak icin kullanilir.
 *
 * ve ayrica(also) nesne(contextobject) ile asagidakileride(lambda icindekileri) yap gibi bir anlami vardir.
 *
 * Zincirin o noktasindaki degeri degistirmeden yan tarafta bir seyler yapmak istiyorsan,
 bu, onu bir çağrı zincirine eklemek için harika bir seçim yapar.
 */
fun main() {
    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")
}