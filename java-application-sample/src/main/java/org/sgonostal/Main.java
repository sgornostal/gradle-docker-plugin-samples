package org.sgonostal;

import java.io.IOException;

/**
 * @author Slava Gornostal
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Output environment var from docker container: " + System.getenv("ENV_VARIABLE"));
    }
}
