package io.wdsj.clientboomerpacketevents;
import com.github.retrooper.packetevents.event.PacketListenerAbstract;
import com.github.retrooper.packetevents.event.PacketListenerPriority;
import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.event.PacketSendEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.protocol.player.User;
import org.bukkit.entity.Player;

import static io.wdsj.clientboomerpacketevents.ClientBoomerPacketEvents.BoomedMap;

public class PacketEventsPacketListener extends PacketListenerAbstract {
    public PacketEventsPacketListener() {
        super(PacketListenerPriority.HIGHEST);
    }

    @Override
    public void onPacketReceive(PacketReceiveEvent event) {
        Player player = (Player) event.getPlayer();
        if (event.getPacketType() == PacketType.Play.Client.KEEP_ALIVE) {
            if (BoomedMap.containsKey(player)){
                event.setCancelled(true);
            }
        }
        if (event.getPacketType() == PacketType.Play.Client.PLAYER_POSITION ||
                event.getPacketType() == PacketType.Play.Client.PLAYER_POSITION_AND_ROTATION ||
                event.getPacketType() == PacketType.Play.Client.PLAYER_ROTATION ||
                event.getPacketType() == PacketType.Play.Client.PLAYER_FLYING){
            if (BoomedMap.containsKey(player)){
                event.setCancelled(true);
            }
        }
        if (event.getPacketType() == PacketType.Play.Client.CHAT_ACK ||
                event.getPacketType() == PacketType.Play.Client.CHAT_COMMAND || event.getPacketType() == PacketType.Play.Client.CHAT_MESSAGE) {
            //WrapperPlayServerChunkDataBulk chunkDataBulk = new WrapperPlayServerChunkDataBulk(event);
            if (BoomedMap.containsKey(player)){
                event.setCancelled(true);
            }
        }
        if (event.getPacketType() == PacketType.Play.Client.PLAYER_BLOCK_PLACEMENT ||
        event.getPacketType() == PacketType.Play.Client.PLAYER_DIGGING ||
                event.getPacketType() == PacketType.Play.Client.INTERACT_ENTITY ||
        event.getPacketType() == PacketType.Play.Client.SLOT_STATE_CHANGE ||
        event.getPacketType() == PacketType.Play.Client.HELD_ITEM_CHANGE ||
        event.getPacketType() == PacketType.Play.Client.PICK_ITEM ||
        event.getPacketType() == PacketType.Play.Client.EDIT_BOOK) {
            if (BoomedMap.containsKey(player)){
                event.setCancelled(true);
            }
        }
    }
    @Override
    public void onPacketSend(PacketSendEvent event) {
        Player player = (Player) event.getPlayer();
        User user = event.getUser();
        if (event.getPacketType() == PacketType.Play.Server.KEEP_ALIVE) {
            //WrapperPlayServerKeepAlive keepAlive = new WrapperPlayServerKeepAlive(event);
            if (BoomedMap.containsKey(player)) {
                event.setCancelled(true);
            }
        }
        if (event.getPacketType() == PacketType.Play.Server.MAP_CHUNK_BULK) {
            //WrapperPlayServerChunkDataBulk chunkDataBulk = new WrapperPlayServerChunkDataBulk(event);
            if (BoomedMap.containsKey(player)){
                event.setCancelled(true);
            }
        }
    }
}
