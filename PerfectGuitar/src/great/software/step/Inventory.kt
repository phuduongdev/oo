package great.software.step

import great.software.step.one.Builder
import great.software.step.one.Type
import great.software.step.one.Wood
import great.software.step.two.GuitarSpec

class Inventory {
    private var guitars = mutableListOf<Guitar>()

    fun addGuitar(
        serialNumber: String, price: Double,
        builder: Builder, model: String,
        type: Type, backWood: Wood, topWood: Wood
    ) {
        val guitar = Guitar(
            serialNumber, price,
            GuitarSpec(
                builder, model,
                type, backWood, topWood
            )
        )
        guitars.add(guitar)
    }

    fun getGuitar(serialNumber: String): Guitar? {
        for (item in guitars) {
            if (item.serialNumber == serialNumber)
                return item
        }
        return null
    }

    fun search(searchSpec: GuitarSpec): MutableList<Guitar>? {
        val matchingGuitars = mutableListOf<Guitar>()
        for (item in guitars) {
            val guitarSpec = item.spec
            if (searchSpec.builder != guitarSpec.builder) continue
            val model = searchSpec.model.toLowerCase()
            if (model != null && model == "" && model == guitarSpec.model.toLowerCase()) continue
            if (searchSpec.type != guitarSpec.type) continue
            if (searchSpec.backWood != guitarSpec.backWood) continue
            if (searchSpec.topWood != guitarSpec.topWood) continue
            matchingGuitars.add(item)
        }
        return matchingGuitars
    }
}
//      original design
//    fun search(searchGuitar: great.software.step.Guitar): great.software.step.Guitar? {
//        for (item in guitars) {
//            val builder = searchGuitar.builder
//            if (builder != null && builder == "" && builder == item.builder) continue
//            val model = searchGuitar.model
//            if (model != null && model == "" && model == item.model) continue
//            val type = searchGuitar.type
//            if (type != null && type == "" && type == item.type) continue
//            val backWood = searchGuitar.backWood
//            if (backWood != null && backWood == "" && backWood == item.backWood) continue
//            val topWood = searchGuitar.topWood
//            if (topWood != null && topWood == "" && topWood == item.topWood) continue
//              return item
//        }
//        return null
//    }

