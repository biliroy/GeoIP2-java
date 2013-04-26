package com.maxmind.geoip2;

import java.lang.*;
import java.util.*;
import java.io.*;
import org.json.*;

public class TraitsRecord
{
  private String ipAddress;
  private int autonomousSystemNumber;
  private String autonomousSystemOrganization;
  private String domain;
  private String isp;
  private String organization;
  private String userType;
  
  public TraitsRecord(JSONObject json) throws JSONException {
    ipAddress = json.getString("ip_address");
    autonomousSystemNumber = json.optInt("autonomous_system_number");
    domain = json.optString("domain");
    isp = json.optString("isp");
    organization = json.optString("organization");
    userType = json.optString("user_type");
  }
  public String getIpAddress() {
    return ipAddress;
  }
  public int getAutonomousSystemNumber() {
    return autonomousSystemNumber;
  }
  public String getAutonomousSystemOrganization() {
    return autonomousSystemOrganization;
  }
  public String getDomain() {
    return domain;
  }
  public String getIsp() {
    return isp;
  }
  public String getOrganization() {
    return organization;
  }
  public String getUserType() {
    return userType;
  }
}


