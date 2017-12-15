package com.eeposit.TrueSGNL.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: sagar
 * Date: 1/11/16
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class ServiceResponse {
    private Boolean success;
    private String message;
    private Map<String, Object> params;
    private List<?> list;
    private Object data;

    public ServiceResponse(String message) {
        this(true, message);
    }

    public ServiceResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
        this.params = new HashMap<String, Object>();
    }

    public void addParam(String key, Object value){
        params.put(key, value);
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    /*public static HttpHeaders generateRuntimeErrors(Exception e) {
        String statusCode = "exc001";
        String message = MessageBundle.getMessage(statusCode, "errorCodes.properties");

        if(e instanceof EPException) {
            statusCode = ((EPException) e).getErrorCode();
            message =  e.getMessage();
        }  else if(e instanceof GeneralSecurityException) {
            statusCode = "exc002";
            message = MessageBundle.getMessage(statusCode, "errorCodes.properties");
        } else if(e instanceof InvocationTargetException) {
            statusCode = "exc003";
            message = MessageBundle.getMessage(statusCode, "errorCodes.properties");
        } else if (e instanceof  NoSuchMethodException) {
            statusCode = "exc004";
            message = MessageBundle.getMessage(statusCode, "errorCodes.properties");
        } else if (e instanceof Exception) {
            statusCode = "exc005";
            message = MessageBundle.getMessage(statusCode, "errorCodes.properties");
        }
        else if(e instanceof StripeException){
        	message = e.getMessage();
        }

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("errorCode", statusCode);
        httpHeaders.add("errorMessage", message);
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        return httpHeaders;
    }*/

	/**
	 * @return the list
	 */
	public List<?> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<?> list) {
		if(list==null)
			list = new ArrayList<>();
		this.list = list;
	}

	/**
	 * @return the obj
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setData(Object obj) {
		this.data = obj;
	}
}
