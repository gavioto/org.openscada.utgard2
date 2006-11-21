/*
 * This file is part of the OpenSCADA project
 * Copyright (C) 2006 inavare GmbH (http://inavare.com)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.openscada.opc.lib.common;

public class ConnectionInformation
{
    private String _host = "localhost";

    private String _domain = "localhost";

    private String _user = "";

    private String _password = "";
    
    private String _clsid = "";

    public ConnectionInformation ()
    {
        super ();
    }

    public ConnectionInformation ( String user, String password )
    {
        super ();
        _user = user;
        _password = password;
    }

    public String getDomain ()
    {
        return _domain;
    }

    /**
     * Set the domain of the user used for logging on
     * @param domain
     */
    public void setDomain ( String domain )
    {
        _domain = domain;
    }

    public String getHost ()
    {
        return _host;
    }

    /**
     * Set the host on which the server is located
     * @param host The host to use, either an IP address oder hostname
     */
    public void setHost ( String host )
    {
        _host = host;
    }

    public String getPassword ()
    {
        return _password;
    }

    public void setPassword ( String password )
    {
        _password = password;
    }

    public String getUser ()
    {
        return _user;
    }

    public void setUser ( String user )
    {
        _user = user;
    }

    public String getClsid ()
    {
        return _clsid;
    }

    public void setClsid ( String clsid )
    {
        _clsid = clsid;
    }
}
