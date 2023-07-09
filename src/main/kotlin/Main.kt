fun main() {
    var vize: Int = 0
    var odev: Int = 0
    var yilSonu: Int = 0
    var gecmeNotu: Double
    var harf: String

    do {
        print("Vize notunu giriniz (0-100): ")
        vize = readLine()?.toIntOrNull() ?: continue
    } while (vize !in 0..100)

    do {
        print("Ödev notunu giriniz (0-100): ")
        odev = readLine()?.toIntOrNull() ?: continue
    } while (odev !in 0..100)

    do {
        print("Yıl sonu notunu giriniz (0-100): ")
        yilSonu = readLine()?.toIntOrNull() ?: continue
    } while (yilSonu !in 0..100)

    gecmeNotu = vize * 0.2 + odev * 0.2 + yilSonu * 0.6

    harf = when {
        gecmeNotu >= 90 -> "AA"
        gecmeNotu >= 85 -> "BA"
        gecmeNotu >= 80 -> "BB"
        gecmeNotu >= 75 -> "CB"
        gecmeNotu >= 70 -> "CC"
        gecmeNotu >= 65 -> "DC"
        gecmeNotu >= 60 -> "DD"
        gecmeNotu >= 50 -> "FD"
        else -> "FF"
    }

    println("Geçme notunuz: $gecmeNotu, Harf notunuz: $harf")
}