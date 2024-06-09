import com.example.blank.controller.StartController
import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.implementations.addInstances
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val bot = TelegramBot("BOT_TOKEN") {
        updatesListener { pullingDelay = 1 }
    }

    bot.prepareActivities()
    bot.addInstances {
        put(StartController::class, StartController())
    }

    bot.handleUpdates()
}

expect fun TelegramBot.prepareActivities()