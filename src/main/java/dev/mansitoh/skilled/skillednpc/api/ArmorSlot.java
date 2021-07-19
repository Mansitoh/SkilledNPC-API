package dev.mansitoh.skilled.skillednpc.api;

/**
 * Created by Mansitoh
 * Project: SkilledNPC-API Date: 18/19/2021 @ 19:52
 * Twitter: @Mansitoh_PY Github: https://github.com/Mansitoh
 * Discord: https://discord.link/Skilled
 * CEO: Skilled | Development
 */
public enum ArmorSlot {

    HAND(0),HELMET(4),CHESTPLATE(3),LEGGINGS(2),BOOTS(1);

    private final int a;

    ArmorSlot(int i) {
        a = i;
    }

    public int getSlot(){
        return a;
    }

    public static boolean exist(String slot){
        return false;
    }
}
