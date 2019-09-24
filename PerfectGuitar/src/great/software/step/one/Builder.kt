package great.software.step.one

enum class Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, PRS, ANY;

    override fun toString(): String {
        return when (this) {
            FENDER -> "Fender"
            MARTIN -> "Martin"
            GIBSON -> "Gibson"
            COLLINGS -> "Collings"
            OLSON -> "Olson"
            PRS -> "Prs"
            ANY -> "Any"
            else -> ""
        }
    }
}