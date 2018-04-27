/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bca.jenkins.service;

import javax.ws.rs.core.Response;
import org.json.simple.JSONObject;

/**
 *
 * @author U058627
 */
public class ServiceUtil {

    public JSONObject getJSONSchemaSuccesfull() {
        JSONObject object = new JSONObject();

        JSONObject objectErrorMessage = new JSONObject();
        objectErrorMessage.put("Indonesian", "Transaksi berhasil");
        objectErrorMessage.put("English", "Transaction successful");

        JSONObject objectErrorSchema = new JSONObject();
        objectErrorSchema.put("ErrorCode", "00-000");
        objectErrorSchema.put("ErrorMessage", objectErrorMessage);

        JSONObject objectOutputSchema = new JSONObject();
        objectOutputSchema.put("ReferenceNumber", "00000000000");

        object.put("ErrorSchema", objectErrorSchema);
        object.put("OutputSchema", objectOutputSchema);

        return object;
    }
    
    public JSONObject getJSONSchemaSuccesfull(String messageIndonesian) {
        JSONObject object = new JSONObject();

        JSONObject objectErrorMessage = new JSONObject();
        objectErrorMessage.put("Indonesian", messageIndonesian);
        objectErrorMessage.put("English", "");

        JSONObject objectErrorSchema = new JSONObject();
        objectErrorSchema.put("ErrorCode", "00-000");
        objectErrorSchema.put("ErrorMessage", objectErrorMessage);

        JSONObject objectOutputSchema = new JSONObject();
        objectOutputSchema.put("ReferenceNumber", "00000000000");

        object.put("ErrorSchema", objectErrorSchema);
        object.put("OutputSchema", objectOutputSchema);

        return object;
    }

    public JSONObject getJSONSchemaFailed() {
        JSONObject object = new JSONObject();

        JSONObject objectErrorMessage = new JSONObject();
        objectErrorMessage.put("Indonesian", "Transaksi gagal");
        objectErrorMessage.put("English", "Transaction failed");

        JSONObject objectErrorSchema = new JSONObject();
        objectErrorSchema.put("ErrorCode", "00-001");
        objectErrorSchema.put("ErrorMessage", objectErrorMessage);

        JSONObject objectOutputSchema = new JSONObject();
        objectOutputSchema.put("ReferenceNumber", "00000000000");

        object.put("OutputSchema", objectOutputSchema);
        object.put("ErrorSchema", objectErrorSchema);

        return object;
    }

    public JSONObject getJSONSchemaFailed(String errorMessageIndonesian, String errorMessageEnglish) {
        JSONObject object = new JSONObject();

        JSONObject objectErrorMessage = new JSONObject();
        objectErrorMessage.put("Indonesian", errorMessageIndonesian);
        objectErrorMessage.put("English", errorMessageEnglish);

        JSONObject objectErrorSchema = new JSONObject();
        objectErrorSchema.put("ErrorCode", "00-001");
        objectErrorSchema.put("ErrorMessage", objectErrorMessage);

        JSONObject objectOutputSchema = new JSONObject();
        objectOutputSchema.put("ReferenceNumber", "00000000000");

        object.put("OutputSchema", objectOutputSchema);
        object.put("ErrorSchema", objectErrorSchema);

        return object;
    }

    public JSONObject getJSONSchemaFailed(String errorMessageIndonesian) {
        JSONObject object = new JSONObject();

        JSONObject objectErrorMessage = new JSONObject();
        objectErrorMessage.put("Indonesian", errorMessageIndonesian);
        objectErrorMessage.put("English", "");

        JSONObject objectErrorSchema = new JSONObject();
        objectErrorSchema.put("ErrorCode", "00-001");
        objectErrorSchema.put("ErrorMessage", objectErrorMessage);

        JSONObject objectOutputSchema = new JSONObject();
        objectOutputSchema.put("ReferenceNumber", "00000000000");

        object.put("OutputSchema", objectOutputSchema);
        object.put("ErrorSchema", objectErrorSchema);

        return object;
    }
    
    public Response getResponse(int status, String entity) {
        return Response.status(status).entity(entity).build();
    }

    public Response getResponseSuccessfull(String entity) {
        return Response.status(200).entity(entity).build();
    }

    public Response getResponseFailed(String entity) {
        return Response.status(400).entity(entity).build();
    }

    public Response getResponseSuccessfull() {
        return Response.status(200).entity(getJSONSchemaSuccesfull()).build();
    }

    public Response getResponseFailed() {
        return Response.status(400).entity(getJSONSchemaFailed()).build();
    }

}
