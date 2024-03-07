import com.example.blank.controller.StartController
import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.generated.__ACTIVITIES
import eu.vendeli.tgbot.implementations.addInstances
import eu.vendeli.tgbot.utils.defineActivities
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val bot = TelegramBot("1068624841:AAHo_b78tOPAntyVkXK_I-0LKQwH_WFTkec") {
        updatesListener { pullingDelay = 1 }
    }

    bot.defineActivities(__ACTIVITIES)
    bot.addInstances {
        put(StartController::class, StartController())
    }

    bot.handleUpdates()
}
