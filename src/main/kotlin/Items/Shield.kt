package Items

import Personaje

class Shield(
    name: String,
    armor: Int = 30
): Protection(name, armor) {

    override fun apply(character: Personaje) {
        character.baseArmor += armor
    }
}