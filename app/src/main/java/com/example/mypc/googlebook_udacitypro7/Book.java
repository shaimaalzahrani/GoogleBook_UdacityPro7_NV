package com.example.mypc.googlebook_udacitypro7;

import com.google.api.client.util.Key;

import java.io.Serializable;

/**
 * Created by shaimaalzahrani on 14/04/2017.
 */

public class Book implements Serializable {
    @Key
    public String id;

    @Key
    public String name;

    @Key
    public String reference;

    @Key
    public String icon;

    @Key
    public String vicinity;

    @Key
    public double rating;

    @Key
    public Geometry geometry;

    @Key
    public Reviews[] reviews;

    @Key
    public String formatted_address;

    @Key
    public String formatted_phone_number;

    @Override
    public String toString() {
        return name + " - " + id + " - " + reference;
    }

    public static class Geometry implements Serializable
    {
        @Key
        public Location location;
    }
    public static class Reviews implements Serializable
    {
        @Key
        public String author_name;

        @Key
        public String text;
    }

    public static class Location implements Serializable
    {
        @Key
        public double lat;

        @Key
        public double lng;
    }

}
