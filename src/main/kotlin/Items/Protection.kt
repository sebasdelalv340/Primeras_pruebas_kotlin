package Items

import Personaje

abstract class Protection(
    var name: String,
    var armor: Int
): IItem {

    override fun apply(character: Personaje) {
        character.baseArmor += armor
    }

}