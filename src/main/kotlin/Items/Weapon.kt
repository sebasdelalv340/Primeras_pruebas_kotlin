package Items

import Personaje

abstract class Weapon(
    var name: String,
    var damage: Int
): IItem {

    override fun apply(character: Personaje) {
        character.baseDamage += damage
    }

}