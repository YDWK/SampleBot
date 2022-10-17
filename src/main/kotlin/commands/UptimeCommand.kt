package commands

import handler.SlashCommandExtender
import io.github.ydwk.ydwk.event.events.interaction.SlashCommandEvent

class UptimeCommand : SlashCommandExtender {

    override fun onSlashCommand(event: SlashCommandEvent) {
        event.slash.channel?.asGuildTextChannel()?.sendMessage("Uptime: ${event.ydwk.uptime}ms")?.get()
    }

    override val name: String
        get() = "uptime"

    override val description: String
        get() = "Get the uptime of the bot"

    override val isGuildOnly: Boolean
        get() = false
}