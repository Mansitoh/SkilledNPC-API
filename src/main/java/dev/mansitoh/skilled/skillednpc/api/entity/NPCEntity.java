package dev.mansitoh.skilled.skillednpc.api.entity;

import dev.mansitoh.skilled.skillednpc.api.SkilledNPCAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Mansitoh
 * Project: SkilledNPC-API Date: 18/19/2021 @ 19:51
 * Twitter: @Mansitoh_PY Github: https://github.com/Mansitoh
 * Discord: https://discord.link/Skilled
 * CEO: Skilled | Development
 */
public interface NPCEntity {

    public static NPCEntity getInstance(Object entity) {
        try {
            Constructor constructor = Class.forName("dev.mansitoh.skilled.skillednpc.api.versions." + SkilledNPCAPI.getNMSVersion()+".NPCEntityImplementer").getDeclaredConstructors()[0];
            NPCEntity npcEntity = (NPCEntity) constructor.newInstance(entity);
            return npcEntity;
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException /*| IllegalAccessException | InstantiationException*/ e) {
            e.printStackTrace();
        }
        return null;
    }

    Object getEntity();

    int getId();

    Object getDataWatcher();

    void setLocation(double x, double y, double z, float yaw, float pitch);

    Object getProfile();
}