package gskproject.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.carewebframework.shell.elements.ElementPlugin;
import org.carewebframework.shell.plugins.PluginController;

import org.fujion.component.BaseComponent;

public class Gsk_projectController extends PluginController {

    private static final Log log = LogFactory.getLog(Gsk_projectController.class);

    /**
     * @see org.carewebframework.ui.controller.FrameworkController#afterInitialized(org.fujion.component.BaseComponent)
     */
    @Override
    public void afterInitialized(BaseComponent comp) {
        super.afterInitialized(comp);
        log.trace("Controller initialized");
    }
    
    /**
     * @see org.carewebframework.shell.plugins.IPluginEvent#onLoad(org.carewebframework.shell.elements.ElementPlugin)
     */
    @Override
    public void onLoad(ElementPlugin plugin) {
        super.onLoad(plugin);
    }
    
    /**
     * @see org.carewebframework.shell.plugins.IPluginEvent#onUnload()
     */
    @Override
    public void onUnload() {
        super.onUnload();
    }
    
    /**
     * @see org.carewebframework.shell.plugins.IPluginEvent#onActivate()
     */
    @Override
    public void onActivate() {
        super.onActivate();
    }
    
    /**
     * @see org.carewebframework.shell.plugins.IPluginEvent#onInactivate()
     */
    @Override
    public void onInactivate() {
        super.onInactivate();
    }

}
