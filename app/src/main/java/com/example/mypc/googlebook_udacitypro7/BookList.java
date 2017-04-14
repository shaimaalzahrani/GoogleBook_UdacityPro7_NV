package com.example.mypc.googlebook_udacitypro7;

/**
 * Created by shaimaalzahrani on 14/04/2017.
 */
import com.google.api.client.util.Key;

import java.io.Serializable;
import java.util.List;

/** Implement this class from "Serializable"
 * So that you can pass this class Object to another using Intents
 * Otherwise you can't pass to another actitivy
 * */
public class BookList implements Serializable {

    @Key
    public List<Book> results;
    @Key
    public String status;


}
