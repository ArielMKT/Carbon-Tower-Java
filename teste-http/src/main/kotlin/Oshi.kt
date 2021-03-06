import java.math.BigDecimal

data class Oshi(
    val memoryRam: BigDecimal,
    val tempCpu: BigDecimal,
    val tempGpu: BigDecimal,
    val useGpu: BigDecimal
)