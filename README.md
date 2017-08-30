<div align="center"><img alt="SnakeParkour Header" src="https://i.imgur.com/SMjiNii.png"></div>

# Snake Parkour - Plugin for Minecraft Server (Bukkit/Spigot)
![](https://img.shields.io/badge/Java-7_or_later-green.svg?style=flat-square&link=https://java.com)
![](https://img.shields.io/badge/CraftBukkit->_1.10.2-blue.svg?style=flat-square&link=https://bukkit.org) 
![](https://img.shields.io/badge/Spigot->_1.10.2-yellow.svg?style=flat-square&link=https://spigotmc.org)

This plugin adds to your server the ability to create your own SnakeParkour. 
This is perfect copy of the plugin from a popular server and it's fully custmizable! 
You can change everything... speed, length, blocks and even every message. With that you can configure it as you need it. 
Plugin is compatible with most servers such as [Bukkit](https://bukkit.org), [Spigot](https://spigotmc.org), [PaperSpigot](https://paper.readthedocs.io/) 
and uses the Java 7 or later. If you like our project give us Star on GitHub and remember about review and stars on Spigot resource page.

### Features
 * Fully customizable (Speed, Length, Frequency, Paths, Blocks etc.)
 * Possibility of change messages
 * Possibility of change main command
 * Timer
 * Records storage
 * Own API (check below)
 
### Want to know more? Visit our wiki
* [Setup](https://github.com/Nicc0/Snake-Parkour/wiki/Setup-Guide)
* [Commands](https://github.com/Nicc0/Snake-Parkour/wiki/Commands)
* [Permissions](https://github.com/Nicc0/Snake-Parkour/wiki/Permissions)
* [Messages](https://github.com/Nicc0/Snake-Parkour/wiki/Messages)
* [Creating map](https://github.com/Nicc0/Snake-Parkour/wiki/Creating-Map-Guide)
* [API](https://github.com/Nicc0/Snake-Parkour/wiki/API)

## Problems, errors and ideas
If you have some problems with configuration, messages, creating map or your console send weird errors, 
create [new issue](https://github.com/Nicc0/Snake-Parkour/issues/new) and we will try to help you as quickly as we can. Remember to check first our [wiki](https://github.com/Nicc0/Snake-Parkour/wiki/) or [existing issues](https://github.com/Nicc0/Snake-Parkour/issues).
Maybe someone already had a similar problem as you. You will save your and our time so we can focus on developing the project.

### To do in the future
- MySQL Records Storage
- BungeeCord Support
- Transform to minigame
- Rewards System (Vault)
- Title messages
- And your ideas

### For developers (API)
Our plugin doesn't allow to modify existing sources, so that's why we created API for you.

```java
private SnakeParkourAPI snakeparkour;

@Override
public void onEnable() {
  snakeparkour = SnakeParkourManagment.getAPI();
  
  if(snakeparkour == null) {
    getServer().getLogger().log(Level.WARNING, "API for SnakeParkour doesn't exists.");
  }
}
```

More information about API you find on our wiki, [click here](https://github.com/Nicc0/Snake-Parkour/wiki/API).

## Frequently Asked Question (FAQ)
<dl>
  <dt>Where can I download plugin?</dt>
  <dd>You can download the plugin from our resource page on www.spigotmc.org (<a href="https://goo.gl/AWj3VF">click here</a>)</dd>

  <dt>Can I have the source code to modify plugin for my network/server??</dt>
  <dd>We would prefer you didn't do it. That's why we created the API.</dd>

  <dt>Does the plugin works in the latest Minecraft versions?</dt>
  <dd>In principle it should work from version 1.8 to the latest.</dd>

  <dt>I have latest version of spigot/bukkit and plugin doesn't work, what I am doing wrong?</dt>
  <dd>If the plugin doesn't work in the latest version we will try to fix it as soon as possible.</dd>
  
  <dt>I have a problem but you don't answer on spigotmc.org, so where do I have to go for help?</dt>
  <dd>I get too many questions there and it's hard to answer for all of it. If you have any problem create new issiue on github.</dd>
</dl>
