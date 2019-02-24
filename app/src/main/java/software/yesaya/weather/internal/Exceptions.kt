package software.yesaya.weather.internal

import java.io.IOException

class NoConnectivityException : IOException()
class LocationPermissionNotGrantedException : Exception()
class DateNotFoundException : Exception()