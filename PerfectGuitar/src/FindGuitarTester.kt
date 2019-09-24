import great.software.step.Inventory
import great.software.step.one.Builder
import great.software.step.one.Type
import great.software.step.one.Wood
import great.software.step.two.GuitarSpec

fun main(args: Array<String>) {
    var inventory = Inventory()
    initInventory(inventory)

//    original design

    //great software step one
    val whatErinLikes = GuitarSpec(
        Builder.FENDER, "Stratocastor",
        Type.ELECTRIC, Wood.ALDER, Wood.ALDER
    )

    val matchingGuitars = inventory.search(whatErinLikes)
    if (!matchingGuitars.isNullOrEmpty()) {
        println("You may like these: ")
        for (item in matchingGuitars) {
            val spec = item.spec
            println(
                " We have a ${spec.builder} ${spec.model} ${spec.type} guitar:\n" +
                        "\t${spec.backWood} back and sides,\n" +
                        "\t${spec.topWood} top.\n" +
                        " You can have it for only $${item.price}!\n-----"
            )
        }
    } else {
        println("Sorry, we have nothing for you")
    }
}

fun initInventory(inventory: Inventory) {
    inventory.addGuitar(
        "f249839", 500.0,
        Builder.FENDER,
        "Vintera",
        Type.ELECTRIC,
        Wood.ALDER,
        Wood.ALDER
    )
    inventory.addGuitar(
        "f249839", 500.0,
        Builder.FENDER,
        "Stratocastor",
        Type.ELECTRIC,
        Wood.ALDER,
        Wood.ALDER
    )
    inventory.addGuitar(
        "c876878", 500.0,
        Builder.OLSON,
        "Vintera",
        Type.ELECTRIC,
        Wood.ALDER,
        Wood.ALDER
    )
    inventory.addGuitar(
        "m098435", 500.0,
        Builder.MARTIN,
        "Vintera",
        Type.ELECTRIC,
        Wood.ALDER,
        Wood.ALDER
    )
    inventory.addGuitar(
        "f879244", 500.0,
        Builder.FENDER,
        "Vintera",
        Type.ELECTRIC,
        Wood.ALDER,
        Wood.ALDER
    )
    inventory.addGuitar(
        "f098432", 500.0,
        Builder.COLLINGS,
        "Vintera",
        Type.ELECTRIC,
        Wood.ALDER,
        Wood.ALDER
    )
    inventory.addGuitar(
        "f032424", 500.0,
        Builder.FENDER,
        "Vintera",
        Type.ELECTRIC,
        Wood.ALDER,
        Wood.ALDER
    )
}
