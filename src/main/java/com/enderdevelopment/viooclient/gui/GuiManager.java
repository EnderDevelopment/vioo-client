package com.enderdevelopment.viooclient.gui;

import net.minecraft.client.gui.screen.Screen;

public class GuiManager {
    public static Screen createMainGui() {
        // Create and return the main GUI screen
        return new MainGuiScreen();
    }
}