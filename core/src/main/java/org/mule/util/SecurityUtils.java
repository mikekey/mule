/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.util;


import org.mule.api.config.MuleProperties;
import org.mule.api.security.tls.TlsConfiguration;

public final class SecurityUtils
{

    public static String getSecurityModel()
    {
        return System.getProperty(MuleProperties.MULE_SECURITY_SYSTEM_PROPERTY, TlsConfiguration.DEFAULT_SECURITY_MODEL);
    }

    public static boolean isFipsSecurityModel()
    {
        return getSecurityModel().equals(TlsConfiguration.FIPS_SECURITY_MODEL);
    }
}
