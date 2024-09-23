package Items

import Personaje

class Helmet(
    Name: String,
    Armor: Int = 20
): Protection(Name, Armor) {

    override fun apply(character: Personaje) {
        character.baseArmor += armor
    }
}