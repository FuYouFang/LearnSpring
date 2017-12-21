package com.fuyoufang.anno5_10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MyComponent {

    @Autowired(required = false)
    private List<Plugin> plugins;

    @Autowired
    private Map<String, Plugin> pluginMap;

    public List<Plugin> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<Plugin> plugins) {
        this.plugins = plugins;
    }

    public Map<String, Plugin> getPluginMap() {
        return pluginMap;
    }

    public void setPluginMap(Map<String, Plugin> pluginMap) {
        this.pluginMap = pluginMap;
    }
}
