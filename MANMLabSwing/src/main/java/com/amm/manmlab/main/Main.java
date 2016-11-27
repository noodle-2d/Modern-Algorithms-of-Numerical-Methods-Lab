package com.amm.manmlab.main;

import com.amm.manmlab.controller.MainController;
import com.amm.manmlab.implementations.FileInputLoaderImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.EventQueue;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.info("Start program...");
        EventQueue.invokeLater(() -> {
            MainController mainController = new MainController(
                    new FileInputLoaderImplementation()
            );
            mainController.startApplication();
        });
        LOG.info("End program...");
    }
    
}