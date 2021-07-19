package dev.mansitoh.skilled.skillednpc.api;

import dev.mansitoh.skilled.skillednpc.api.entity.NPCEntity;
import dev.mansitoh.skilled.skillednpc.api.skinutils.Skin;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class SkilledNPCAPI {

    @Getter
    public static HashMap<String, NPCEntity> NPCList = new HashMap<>();
    @Getter
    public static HashMap<String, Integer> NPCByID = new HashMap<>();
    @Getter
    @Setter
    private FileConfiguration config;
    @Getter
    private String Name = null;
    @Getter
    private NPCEntity NPCEntity;


    public SkilledNPCAPI(String npcname) {
    }

    public static String getNMSVersion() {
        return null;
    }

    public void setNPCEntity(NPCEntity entity) {
    }

    public static boolean existsNPCName(String npcname) {
        return false;
    }

    public static ArrayList<String> getAllNPCSName() {
        return null;
    }

    public static SkilledNPCAPI createNPC(String Name, Location Loc) {
        return null;
    }


    public String getDisplayname() {
        return null;
    }

    private static void createEntityPlayer(String name) {
    }

    public void saveNPC() throws IOException {
    }

    /**
     * Set the spawning location of the npc without patching the npc
     *
     * @param loc
     * @return
     */
    public Location setLocation(Location loc) {
        return loc;
    }

    public void setSpawnLocation(Location loc) {
    }


    public static ArrayList<SkilledNPCAPI> getAllNPCS(){
        return null;
    }

    public SkilledNPCAPI showNPC() {
        return this;
    }

    public SkilledNPCAPI showNPC(Player player) {
        return this;
    }


    public Location getSpawnLocation() {
        return null;
    }

    public SkilledNPCAPI setSkin(Skin skin) {
        return this;
    }

    public SkilledNPCAPI hideNPC(Player player) {
        return this;
    }

    public SkilledNPCAPI hideNPC() {
        return this;
    }

    public SkilledNPCAPI setDisplayname(String displayname) {
        return this;
    }


    public String[] getSkin() {
        return null;
    }

    public static void loadALL() {
    }

    public static void unLoadAll() {
    }

    public boolean containsInventory() {
        return false;
    }

    public String getInventoryName() {
        return null;
    }

    public int getRows() {
        return 0;
    }

    public SkilledNPCAPI openInventory(Player p) {
        return this;
    }

    public static ArrayList<String> getAllInventorysName() {
        return null;
    }

    public static void itemContainsCommand(Inventory inv, ItemStack currentItem, int slot, Player p) {
    }

    public static void itemContainsMessage(Inventory inv, ItemStack currentItem, int slot, Player p) {
    }

    public static void itemContainsBroadcast(Inventory inv, ItemStack currentItem, int slot, Player p) {

    }

    public static Location getLocation(String name) {
        return null;
    }

    public SkilledNPCAPI delete() {
        return this;
    }

    public void equipArmor() {
    }

    public SkilledNPCAPI setArmor(ArmorSlot armorslot, ItemStack item) {
        return this;
    }

    public String getCommandExecuter() {
        return null;
    }

    public ArrayList<String> getCommands() {
        return null;
    }

    public SkilledNPCAPI addCommand(String stringBuilder) throws IOException {
        return this;
    }

    public SkilledNPCAPI removeCommand(int line) throws IOException {
        return this;
    }

    public SkilledNPCAPI addBroadcast(String stringBuilder) throws IOException {
        return this;
    }

    public ArrayList<String> getBroadcasts() {
        return null;
    }

    public SkilledNPCAPI removeBroadcast(int line) throws IOException {
        return this;
    }

    public ArrayList<String> getHoloLines() {
        return null;
    }

    public SkilledNPCAPI addHoloLine(String arg) throws IOException {
        return this;
    }

    public SkilledNPCAPI removeHoloLine(int line) throws IOException {
        return this;
    }

    public boolean containsCommand() {
        return false;
    }

    public boolean containsBroadcast() {
        return false;
    }

    public boolean isFollowPlayer() {
        return false;
    }

    public boolean useItem(Player p) {
        return false;
    }

    public boolean containsQueue() {
        return false;
    }

    public String getQueue() {
        return null;
    }

    public SkilledNPCAPI joinQueue(Player player) {
        return this;
    }


    private void sendAJQueue(Player player, String subchannel, String data) {
    }

    public boolean containsMessage() {
        return false;
    }

    public ArrayList<String> getMessages() {
        return null;
    }


    public int getDistance(Location location) {
        return 0;
    }
}
