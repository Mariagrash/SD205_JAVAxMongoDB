/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sample1;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Student.admin
 */
public class Sample1 {

    public static void main(String[] args) {
        try {
//---------- Connecting DataBase -------------------------//  
            MongoClient mongoClient = new MongoClient("localhost", 27017);
//---------- Creating DataBase ---------------------------//  
            MongoDatabase db = mongoClient.getDatabase("SD205");
//---------- Creating Collection -------------------------//  
            MongoCollection<Document> table = db.getCollection("Registered");
//---------- Creating Document ---------------------------//    
            Document doc = new Document("name", "Peter John");
            doc.append("id", 12);
//----------- Inserting Data ------------------------------//  
            table.insertOne(doc);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

