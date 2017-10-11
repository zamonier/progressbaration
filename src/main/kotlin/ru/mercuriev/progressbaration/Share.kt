package ru.mercuriev.progressbaration

/**
 * Created by Eugene_Mercuriev on 11-Oct-17.
 */
data class Share(val part: Int, val total: Int) {

	fun percentence(): Double = part.toDouble() / total

	override fun toString(): String = (percentence()*100).toString()

}