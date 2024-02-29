package uk.andrewcarter04.Discord;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Andrew Carter
 */
public class SlashCommands extends ListenerAdapter {

    public SlashCommands() {

    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {

        if (event.getName().equals("start")) {


        } else if (event.getName().equals("end")) {



        }
    }

}
