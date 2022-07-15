/*
 * This file is part of the BleachHack distribution (https://github.com/BleachDrinker420/BleachHack/).
 * Copyright (c) 2021 Bleach and contributors.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package org.bleachhack.command.commands;

import org.bleachhack.command.Command;
import org.bleachhack.command.CommandCategory;

import org.bleachhack.command.exception.CmdSyntaxException;

public class CmdEmoji extends Command {

    public CmdEmoji() {
        super("emoji", "Sends emoji to chat.", "emoji shrug | emoji smirk | emoji angry | emoji wtf | emoji bruh | emoji dealwithit | emoji scared | emoji happy | emoji yay | emoji blush | emoji vibe | emoji wink |  emoji doggo | emoji kitty | emoji kiss |  emoji party | emoji tableflip | emoji angryflip | emoji dontflip | emoji unflip | emoji zombie", CommandCategory.MISC,
                "e");
    }

    @Override
    public void onCommand(String alias, String[] args) throws Exception {
        if (args.length == 0) {
            throw new CmdSyntaxException();
        }

        if (args[0].equalsIgnoreCase("shrug")) {
            mc.player.sendChatMessage("¯\\_(ツ)_/¯");
        } else if (args[0].equalsIgnoreCase("smirk")) {
            mc.player.sendChatMessage("(´°‿ʖ´°)");
        } else if (args[0].equalsIgnoreCase("angry")) {
            mc.player.sendChatMessage("(ಠ益ಠ)");
        } else if (args[0].equalsIgnoreCase("wtf")) {
            mc.player.sendChatMessage("(゜-゜)");
        } else if (args[0].equalsIgnoreCase("bruh")) {
            mc.player.sendChatMessage("(¬_¬)");
        } else if (args[0].equalsIgnoreCase("dealwithit")) {
            mc.player.sendChatMessage("(▀ˉL▀ˉ)");
        } else if (args[0].equalsIgnoreCase("scared")) {
            mc.player.sendChatMessage("(ಠ_ಠ)");
        } else if (args[0].equalsIgnoreCase("happy")) {
            mc.player.sendChatMessage("(ᵔ ‿ʖ ᵔ)");
        } else if (args[0].equalsIgnoreCase("yay")) {
            mc.player.sendChatMessage("(｡◕‿◕｡)");
        } else if (args[0].equalsIgnoreCase("blush")) {
            mc.player.sendChatMessage("(✿◠‿◠)");
        } else if (args[0].equalsIgnoreCase("vibe")) {
            mc.player.sendChatMessage("~(˘▾˘~)");
        } else if (args[0].equalsIgnoreCase("wink")) {
            mc.player.sendChatMessage("(◕‿↼)");
        } else if (args[0].equalsIgnoreCase("doggo")) {
            mc.player.sendChatMessage("(ᵔᴥᵔ)");
        } else if (args[0].equalsIgnoreCase("kitty")) {
            mc.player.sendChatMessage("(^•ﻌ•^)");
        } else if (args[0].equalsIgnoreCase("kiss")) {
            mc.player.sendChatMessage("(￣3￣)");
        } else if (args[0].equalsIgnoreCase("party")) {
            mc.player.sendChatMessage("♪ ┗( ･o･)┓ ♪");
        } else if (args[0].equalsIgnoreCase("tableflip")) {
            mc.player.sendChatMessage("(╯°□°）╯︵ ┻━┻");
        } else if (args[0].equalsIgnoreCase("angryflip")) {
            mc.player.sendChatMessage("┻━┻ ︵ヽ(`Д´)ﾉ︵ ┻━┻");
        } else if (args[0].equalsIgnoreCase("dontflip")) {
            mc.player.sendChatMessage("┳━┳ ¯\\_(ツ)");
        } else if (args[0].equalsIgnoreCase("unflip")) {
            mc.player.sendChatMessage("┳━┳ ノ(°-°ノ)");
        } else if (args[0].equalsIgnoreCase("zombie")) {
            mc.player.sendChatMessage("[¬°-°]¬");
        } else {
            throw new CmdSyntaxException();
        }
    }

}
