package com.enderdevelopment.viooclient.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class MainGuiScreen extends Screen {
    protected MainGuiScreen() {
        super(Text.literal("ViooClient"));
    }

    @Override
    protected void init() {
        // Initialize GUI components
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        // Render GUI
    }
}