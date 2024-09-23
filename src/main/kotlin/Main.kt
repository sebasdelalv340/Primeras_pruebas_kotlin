import Items.Axe
import Items.Helmet
import Items.Shield
import Items.Sword

fun main () {

    var Axe = Axe("Trueno")
    var Helmet = Helmet("Hierro")
    var Personaje_1 = Personaje(
        "Mithril",
        100,
        18,
        8,
        6,
        listOf(Axe, Helmet)
    )

    var Sword = Sword("Diablo")
    var Shield = Shield("Plata")
    var Personaje_2 = Personaje(
        "Eragor",
        110,
        15,
        7,
        7,
        listOf(Sword, Shield)
    )

    fun ApplyItems(fighter_1: Personaje, fighter_2: Personaje) {
        Axe.apply(fighter_1)
        Helmet.apply(fighter_1)

        Sword.apply(fighter_2)
        Shield.apply(fighter_2)
    }

    fun ComprobarGanador(fighter_1: Personaje, fighter_2: Personaje): Personaje {
        if (fighter_1.health <= 0) {
            return fighter_2
        } else {
            return fighter_1
        }
    }

    fun Fight(fighter_1: Personaje, fighter_2: Personaje) {

        ApplyItems(fighter_1, fighter_2)

        while (fighter_1.health >= 0 || fighter_2.health >= 0) {
            fighter_2.receiveDamage(fighter_1.attack() - fighter_2.defense())
            fighter_1.receiveDamage(fighter_2.attack() - fighter_1.defense())
        }

        val Ganador = ComprobarGanador(fighter_1, fighter_2)
        println("${Ganador.name} gana la batalla.")
    }

    Fight(Personaje_1, Personaje_2)

}