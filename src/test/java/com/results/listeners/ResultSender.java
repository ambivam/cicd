package com.results.listeners;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;

public class ResultSender {

    private static final InfluxDB INFLXUDB = InfluxDBFactory.connect("http://172.27.16.1:8086", "root", "root");
    private static final String DATABASE = "selenium";

    static{
        INFLXUDB.setDatabase(DATABASE);
    }

    public static void send(final Point point){
        System.out.println("BEFORE WRITING POINT "+point);
        INFLXUDB.write(point);
        System.out.println("AFTER WRITING POINT "+point);
    }

}