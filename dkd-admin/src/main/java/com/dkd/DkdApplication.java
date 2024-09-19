package com.dkd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DkdApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DkdApplication.class, args);
        System.out.println("\n" +
                "                   ___.                             __                 __   \n" +
                " ___.__. ____  __ _\\_ |__ _____    ____     _______/  |______ ________/  |_ \n" +
                "<   |  |/  _ \\|  |  \\ __ \\\\__  \\  /  _ \\   /  ___/\\   __\\__  \\\\_  __ \\   __\\\n" +
                " \\___  (  <_> )  |  / \\_\\ \\/ __ \\(  <_> )  \\___ \\  |  |  / __ \\|  | \\/|  |  \n" +
                " / ____|\\____/|____/|___  (____  /\\____/  /____  > |__| (____  /__|   |__|  \n" +
                " \\/                     \\/     \\/              \\/            \\/             ");
    }
}
