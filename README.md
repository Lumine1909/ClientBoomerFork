# ClientBoomer
A packet-based bukkit plugin that allows you to crash/ban the clients of cheaters

## How to use
1. Put the jar file in your plugins folder
2. Restart your server
3. Configure the plugin via config.yml

## Commands

`/boom <player>` - Crash the client of the specified player

`/boomban <player>` - Ban the client of the specified player

`/boomunban <player>` - Unban the client of the specified player

`/boombanlist` - List all the banned players


## Permissions

`clientboomer.boom.use` - Allows you to use the /boom command

`clientboomer.boomban.use` - Allows you to use the /boomban command

`clientboomer.boomunban.use` - Allows you to use the /boomunban command

`clientboomer.boombanlist.use` - Allows you to use the /boombanlist command`

## Config.yml
```yaml
#Main config file of ClientBoomer-PacketEvents

#顶级折磨，尝试崩端后拒绝处理客户端keepAlive包并让服务器拒绝发送keepAlive(冻结玩家活动)
#Freeze players
zeroBPM: true
#是否在控制台输出消息
#Send console output or not
consoleOutput: true
#封禁功能,包含/boomban /boomunban和/boombanlist
#Ban feature
banFeature: false
```
## Statistics
![Graph](https://bstats.org/signatures/bukkit/ClientBoomer.svg)
## Dependencies using
- PpacketEvents](https://github.com/retrooper/packetevents)
- [bStats](https://bstats.org/)
