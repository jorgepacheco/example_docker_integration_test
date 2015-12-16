package org.autentia.tutoriales.domain;

import java.io.Serializable;

/**
 * Abstract class for all the domain entities.
 * 
 */
public abstract class BaseDomain implements Serializable {

	private static final long serialVersionUID = -6019460239290743525L;

	public abstract int hashCode();
    
    public abstract boolean equals(Object object);
    
}