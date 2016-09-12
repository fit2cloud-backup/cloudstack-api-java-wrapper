package com.fit2cloud.cloudstack.wsclient;

/**
 * 
 * @author jason
 *
 */
public class CloudStackClientException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5562309362764717920L;
	
	private String serviceName;

    private int errorCode;

    private String errorMessage;
	
	public CloudStackClientException(String message, Throwable t) {
        super(message, t);
    }

    public CloudStackClientException(String message) {
        super(message);
    }

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
    
	@Override
    public String getMessage() {
        return getErrorMessage()
            + "; Action : " + getServiceName()
            + "; Error Code: " + getErrorCode()
            + "; Error Message: " + getErrorMessage() + ")";
    }

}
