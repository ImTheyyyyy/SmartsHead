package dev.smart;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public final class SmartsHead extends JavaPlugin {

    /**
     * Genera un ItemStack de cabeza personalizada a partir de un string Base64.
     *
     * @param base64 El valor Base64 de la textura.
     * @return El ItemStack con la cabeza personalizada.
     */
    public static ItemStack getCustomHead(String base64) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        if (skullMeta != null) {
            PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID());
            String texture = "{\"textures\":{\"SKIN\":{\"url\":\"data:image/png;base64," + base64 + "\"}}}";
            ProfileProperty profileProperty = new ProfileProperty("textures", texture);
            profile.getProperties().add(profileProperty);

            skullMeta.setPlayerProfile(profile);
            skull.setItemMeta(skullMeta);
        }

        return skull;
    }
}