import Items.IItem

class Personaje(
    var name: String,
    var health: Int,
    var maxHitPoints: Int,
    var baseDamage: Int,
    var baseArmor: Int,
    var _inventory: List<IItem>
) {
    fun attack(): Int {
        return baseDamage
    }

    fun defense(): Int {
        return baseArmor
    }

    fun heal(treat: Int) {
        health += treat
    }

    fun receiveDamage(damage: Int){
        health -= damage
    }
}