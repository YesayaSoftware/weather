package software.yesaya.weather.data.provider

import software.yesaya.weather.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}