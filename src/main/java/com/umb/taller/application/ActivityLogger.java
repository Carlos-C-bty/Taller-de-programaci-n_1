package com.umb.taller.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActivityLogger {

    private static final Logger logger =
            LoggerFactory.getLogger(ActivityLogger.class);

    public void logActivity(String activity) {

        logger.info("Activity: {}", activity);
    }
}
