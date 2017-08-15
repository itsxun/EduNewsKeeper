package xin.fallen.EduNewsKeeper.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import xin.fallen.EduNewsKeeper.config.GlobalConfig;
import xin.fallen.EduNewsKeeper.util.ConfigLoader;

import java.io.File;


public class SpringReadyLis implements ApplicationListener<ApplicationPreparedEvent> {
    private static Logger log = LoggerFactory.getLogger("log");

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        ConfigLoader.load(new File("D:\\git\\ProjUsedVeh\\src\\main\\resources\\config.xml"), GlobalConfig.class);
//        ConfigLoader.load(FileFinder.find("config.xml"), StaticConfig.class);
        log.info("<=================Config Load Complete==================>");
    }
}