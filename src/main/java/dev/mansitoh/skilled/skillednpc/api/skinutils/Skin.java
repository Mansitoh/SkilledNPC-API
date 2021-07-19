package dev.mansitoh.skilled.skillednpc.api.skinutils;



import lombok.Getter;

import java.io.IOException;

/**
 * Created by Mansitoh
 * Project: SkilledNPC-API Date: 18/19/2021 @ 19:52
 * Twitter: @Mansitoh_PY Github: https://github.com/Mansitoh
 * Discord: https://discord.link/Skilled
 * CEO: Skilled | Development
 */
public class Skin {
    @Getter
    private String value = null;
    @Getter
    private String signature = null;
    public static String[] DefaultSkin = null;

    public Skin(String value, String signature) {
    }

    public Skin(SkinTypes type, String nameorid) throws IOException,Exception {

    }



}
