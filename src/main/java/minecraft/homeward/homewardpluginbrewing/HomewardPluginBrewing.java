package minecraft.homeward.homewardpluginbrewing;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class HomewardPluginBrewing extends JavaPlugin {

    //常量部分
    public final String PLUGIN_NAME = "酿酒";


    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "嘻嘻");
    }

    /**
     * 关闭逻辑
     */
    @Override
    public void onDisable() {

    }
}
