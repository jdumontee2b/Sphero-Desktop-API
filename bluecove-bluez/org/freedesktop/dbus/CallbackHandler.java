/*
   D-Bus Java Implementation
   Copyright (c) 2005-2006 Matthew Johnson

   This program is free software; you can redistribute it and/or modify it
   under the terms of either the GNU Lesser General Public License Version 2 or the
   Academic Free Licence Version 2.1.

   Full licence texts are included in the COPYING file with this program.
*/
package org.freedesktop.dbus;

import org.freedesktop.dbus.exceptions.DBusExecutionException;

/**
 * Interface for callbacks in async mode
 */
public interface CallbackHandler<ReturnType>
{
   public void handle(ReturnType r);
   public void handleError(DBusExecutionException e);
}
