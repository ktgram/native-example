import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.generated.__ACTIVITIES
import eu.vendeli.tgbot.utils.common.defineActivities

actual fun TelegramBot.prepareActivities() {
    defineActivities(__ACTIVITIES)
}