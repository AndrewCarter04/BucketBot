package uk.andrewcarter04.Discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.interactions.commands.DefaultMemberPermissions;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

/**
 * @author Andrew Carter
 */
public class BucketBot {

    /*
    *
    *
    *
    * */

    private static JDA jda;

    public static void main(String[] args) throws InterruptedException {

        JDABuilder builder = JDABuilder.createDefault(Private.getToken());

        builder.setActivity(Activity.playing("Buckets and Balls!!!"));
        builder.setStatus(OnlineStatus.ONLINE);
        builder.disableCache(CacheFlag.VOICE_STATE, CacheFlag.SCHEDULED_EVENTS);
        builder.setEnabledIntents(GatewayIntent.DIRECT_MESSAGES, GatewayIntent.DIRECT_MESSAGE_REACTIONS,
                GatewayIntent.GUILD_MESSAGE_REACTIONS, GatewayIntent.GUILD_MESSAGES,
                GatewayIntent.GUILD_EMOJIS_AND_STICKERS, GatewayIntent.GUILD_MEMBERS);

        builder.addEventListeners(new SlashCommands());

        jda = builder.build();

        jda.awaitReady();

        jda.updateCommands().addCommands(
                Commands.slash("fact", "(Java) Fact about buckets")

        ).queue();

    }

    public static JDA getJDA() {
        return jda;
    }

}