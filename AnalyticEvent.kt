interface AnalyticEvent {
    val eventData: EventData

    val services: List<Analytics>
        get() = listOf(FirebaseAnalyticEvent, CleverTapAnalyticEvent)

    fun track() {
        services.forEach { it.track(eventData) }
    }
}

class ClickEvent(
    private val buttonName: String
) : AnalyticEvent {

    override val eventData: EventData
        get() = EventData(
            eventName = "CLICK_BUTTON",
            data = mapOf(
                "button_name" to buttonName
            )
        )

}

class ScreenLoadEvent(
    private val screenName: String
) : AnalyticEvent {


    override val eventData: EventData
        get() = EventData(
            eventName = "SCREEN_LOAD",
            data = mapOf(
                "screen_name" to screenName
            )
        )

}