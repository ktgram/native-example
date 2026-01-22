import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.annotations.internal.KtGramInternal
import eu.vendeli.tgbot.generated.KtGramCtxLoader
import eu.vendeli.tgbot.utils.common.loadContext

@OptIn(KtGramInternal::class)
actual fun TelegramBot.setup() {
    loadContext(KtGramCtxLoader())
}