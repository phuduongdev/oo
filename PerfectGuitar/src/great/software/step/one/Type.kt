package great.software.step.one

enum class Type {
    ACOUSTIC, ELECTRIC;

    override fun toString(): String {
        return when (this) {
            ACOUSTIC -> "acoustic"
            ELECTRIC -> "electric"
            else -> ""
        }
    }
}