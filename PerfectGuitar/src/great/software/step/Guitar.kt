package great.software.step

import great.software.step.one.Builder
import great.software.step.one.Type
import great.software.step.one.Wood
import great.software.step.two.GuitarSpec

// original design
//data class great.software.step.Guitar(
//    val serialNumber: String, val price: Double,
//    val builder: String, val model: String,
//    val type: String, val backWood: String,
//    val topWood: String
//)
// great software step one
data class Guitar(
    val serialNumber: String, val price: Double,
    val spec: GuitarSpec
)
