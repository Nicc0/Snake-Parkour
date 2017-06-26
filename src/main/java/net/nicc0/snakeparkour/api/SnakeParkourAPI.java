package net.nicc0.snakeparkour.api;

import org.bukkit.configuration.file.YamlConfiguration;

/**
 * API interface for SnakeParkour
 * 
 * @since 1.0.0 (18.06.2017)
 * @version 1.0.0
 * @author Nicc0
 */
public interface SnakeParkourAPI {
    
    /**
     * This method start the map which name is given in argument {@code name}. 
     * You have to remember first that map must be successfully loaded. If the 
     * map start correctly, method returns {@code true}. If not {@code false}. 
     * This happens hen map can't be loaded or it's misconfigured. Console 
     * should send currently showing problem. During calling this method, event 
     * {@link net.nicc0.snakeparkour.api.events.SnakeParkourMapStartEvent}
     * is called.
     * 
     * @see net.nicc0.snakeparkour.api.events.SnakeParkourMapStartEvent
     * @param name Name of the map which you want to run
     * @return Returns {@code true} if the map was started, {@code false} if
     * occurs any problem or when event "SnakeParkourMapStartEvent" has cancelled.
     */
    public boolean startMap(String name);
    
    /**
     * This method stops the map which name is given in argument {@code name}. 
     * If it's another argument added to this method which is boolean 
     * and its value is equal {@code false} then after ended map the path will 
     * not be changed for default block of the path (bedrock). By default this 
     * is set to {@code true} for security reasons, in the case of deleting 
     * of the map or other similiar cases. During calling this method, event 
     * {@link net.nicc0.snakeparkour.api.events.SnakeParkourMapStopEvent} 
     * is called.
     *
     * @see net.nicc0.snakeparkour.api.events.SnakeParkourMapStopEvent
     * @param name Name of the map which you want to stop
     * @param bool Is the path supposed to be swapped in the default block path?
     * (Optional argument, default {@code true})
     */
    public void stopMap(String name, Object... bool);
    
    /**
     * This method checks that is the map already running. Method returns
     * {@code true} when map exists or when it's running. To check if map is loaded 
     * to the plugin (is it exists) use method: {@link mapExist(String name)}.
     * 
     * @see net.nicc0.snakeparkour.api.SnakeParkourAPI#mapExist(String name)
     * @param name Name of the map which you want to check
     * @return Returns {@code true} if the map is already running or 
     * {@code false} if it's not
     */
    public boolean isStarted(String name);
    
    /**
     * This method checks that is the map exists (is it loaded). All the maps
     * was loading during enabling plugin in {@link org.bukkit.plugin.Plugin#onEnable()}
     * or singly while saving map using command {@code /sp save}
     * 
     * @param name Name of the map which you want to check
     * @return Returns {@code true} if the map exists or {@code false} if it's not
     */
    public boolean mapExist(String name); 
    
    /**
     * Returns YAML configuration with actual existing records. 
     * If you want to know the current time of the player, use event
     * {@link net.nicc0.snakeparkour.api.events.SnakeParkourRecordEvent}.
     * In the future plugin is supposed to be compatible with database
     * so this method will be deprecated.
     * 
     * @see net.nicc0.snakeparkour.api.events.SnakeParkourRecordEvent
     * @see org.bukkit.configuration.file.YamlConfiguration
     * @deprecated 
     * @return Returns YAML configuration
     */
    @Deprecated
    public YamlConfiguration getYAMLRecords();
}
