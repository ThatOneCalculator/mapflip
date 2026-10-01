package de.goork.mapflip.parser

interface MapUrlParser {
    val serviceName: String
    val supportedHosts: List<String>

    fun canParse(url: String): Boolean
    fun parse(url: String): ParsedLocation
    fun extractUrl(text: String?): String?
}

fun isValidLatLon(lat: Double, lon: Double): Boolean {
    return !lat.isNaN() && !lon.isNaN() && lat in -90.0..90.0 && lon in -180.0..180.0
}
