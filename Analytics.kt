interface Analytics {
    fun track(eventData: EventData)
}

object FirebaseAnalyticEvent : Analytics {
    override fun track(eventData: EventData) {
        println("FirebaseEvent : ${eventData.eventName}")
    }
}

object CleverTapAnalyticEvent : Analytics {
    override fun track(eventData: EventData) {
        println("CleverTapEvent : ${eventData.eventName}")
    }
}


data class EventData(
    val eventName: String,
    val data: Map<String, Any>
)