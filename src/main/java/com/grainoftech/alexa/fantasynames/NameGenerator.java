package com.grainoftech.alexa.fantasynames;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by mak on 11/5/17.
 */
class NameGenerator {

    public enum Type {FANTASY, PONY, SCARY, PRINCESS};

    /**
     * Short, Medium, Long
     * Princess, Scary, Fantasy
     */
    String generateName(Type type) {

        if (type == null) {
            type = Type.FANTASY;
        }

        List<String> fantasyPrefix = Arrays.asList("Glimmer","Shimmering","Silver","Golden","Winter","Frost", "Beautiful", "Rainbow");
        List<String> ponySuffix = Arrays.asList("Horn","Unicorn","Pegasus","Mane","Hoof","Runner","Sparkle");
        List<String> fantasySuffix = Arrays.asList("Rose","Blade","Flower","River","Vale","Stone");

        List<String> scaryPrefix = Arrays.asList("Dark","Red","Scary","Bloody","Black");
        List<String> scarySuffix = Arrays.asList("Ghost","Demon","Death","Skeleton","Hand","Dog");

        List<String> princessSuffix = Arrays.asList("Rosie","Silver","Goldie","Shimmer");

        Random random = new Random();
        StringBuilder name = new StringBuilder();

        if (type.equals(Type.PONY)) {
            name.append(fantasyPrefix.get(random.nextInt(fantasyPrefix.size())));
            name.append(" ");
            name.append(ponySuffix.get(random.nextInt(ponySuffix.size())));
        } else if (type.equals(Type.PRINCESS)) {
            name.append("Princess");
            name.append(" ");
            name.append(princessSuffix.get(random.nextInt(princessSuffix.size())));
        } else if (type.equals(Type.SCARY)) {
            name.append(scaryPrefix.get(random.nextInt(scaryPrefix.size())));
            name.append(" ");
            name.append(scarySuffix.get(random.nextInt(scarySuffix.size())));
        } else {
            name.append(fantasyPrefix.get(random.nextInt(fantasyPrefix.size())));
            name.append(" ");
            name.append(fantasySuffix.get(random.nextInt(fantasySuffix.size())));
        }

        return name.toString();
    }
}
