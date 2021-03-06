/*
 Copyright 2010, Hong-Linh Truong, Distributed Systems Group, Vienna University of Technology
 This software is a part of the SOD1 framework. Please see
 http://www.infosys.tuwien.ac.at/prototyp/SOD1/

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package at.ac.tuwien.infosys.sod1.crq.restdesign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Very Simple REST Web Service
 *
 * @author truong
 */
public class GoogleFluTrendResource {

    @Context
    private UriInfo context;

    /** Creates a new instance of GoogleFluTrendResource */
    public GoogleFluTrendResource() {
    }

    /**
     * Retrieves representation of an instance of at.ac.tuwien.infosys.sod1.crq.restdesign.GoogleFluTrendResource
     * @param id resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson(@PathParam("id") String id) throws ClassNotFoundException, SQLException, JSONException {
        JSONObject jQoD = null;

        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:/data/googleflu.db");
        Statement stat = conn.createStatement();
        String query = "select Date," + id + " from fludata;";
        System.out.println(query);
        ResultSet rs = stat.executeQuery(query);
        JSONObject jDataSet = new JSONObject();
        JSONArray jEntries = new JSONArray();
        while (rs.next()) {
            JSONObject jEntry = new JSONObject();
            jEntry.put("Date", rs.getString("Date"));
            jEntry.put("Value", rs.getInt(id));
            jEntries.put(jEntry);
        }
        jDataSet.put("dataset", jEntries);
        rs.close();
        conn.close();
        return jDataSet.toString(5);
    }

    /**
     * PUT method for updating or creating an instance of GoogleFluTrendResource
     * @param id resource URI parameter
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(@PathParam("id") String id, String content) {
    }

    /**
     * DELETE method for resource GoogleFluTrendResource
     * @param id resource URI parameter
     */
    @DELETE
    public void delete(@PathParam("id") String id) {
    }
}
