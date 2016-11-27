package com.amm.manmlab.ui;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImagePanelListenerSupport {

    private Set<ImagePanelListener> imagePanelListeners = new HashSet<>();
    
    public void addImagePanelListener(ImagePanelListener listener) {
        imagePanelListeners.add(listener);
    }
    
    public Set<ImagePanelListener> getImagePanelListeners() {
        return Collections.unmodifiableSet(imagePanelListeners);
    }
    
    public void removeImagePanelListener(ImagePanelListener listener) {
        imagePanelListeners.remove(listener);
    }
    
    public void fireMouseLeftClicked(ImagePanel imagePanel, int x, int y, int width, int height) {
        for (ImagePanelListener listener: imagePanelListeners) {
            listener.mouseLeftClicked(imagePanel, x, y, width, height);
        }
    }
    
    public void fireMouseMiddleClicked(ImagePanel imagePanel, int x, int y, int width, int height) {
        for (ImagePanelListener listener: imagePanelListeners) {
            listener.mouseLeftClicked(imagePanel, x, y, width, height);
        }
    }
    
    public void fireMouseRightClicked(ImagePanel imagePanel, int x, int y, int width, int height) {
        for (ImagePanelListener listener: imagePanelListeners) {
            listener.mouseLeftClicked(imagePanel, x, y, width, height);
        }
    }
    
}