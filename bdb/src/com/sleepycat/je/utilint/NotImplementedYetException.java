/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 2002-2006
 *      Oracle Corporation.  All rights reserved.
 *
 * $Id: NotImplementedYetException.java,v 1.15 2006/09/12 19:17:00 cwl Exp $
 */

package com.sleepycat.je.utilint;

/**
 * Something is not yet implemented.
 */
public class NotImplementedYetException extends RuntimeException {

    public NotImplementedYetException() {
	super();
    }

    public NotImplementedYetException(String message) {
	super(message);
    }
}