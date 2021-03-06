package de.brockhaus.opc.matrikonopc;

import java.net.UnknownHostException;

import org.jinterop.dcom.common.JIException;
import org.junit.Test;
import org.openscada.opc.lib.common.AlreadyConnectedException;
import org.openscada.opc.lib.common.NotConnectedException;
import org.openscada.opc.lib.da.AddFailedException;
import org.openscada.opc.lib.da.DuplicateGroupException;

import de.brockhaus.opc.matrikonopc.UtgardReader;

public class UtgardReaderTest
{
	@Test
	public void test() throws IllegalArgumentException, UnknownHostException, AlreadyConnectedException, NotConnectedException, JIException, DuplicateGroupException, AddFailedException, InterruptedException
	{
		UtgardReader ur = new UtgardReader();
		ur.init();
		ur.connect();
		ur.doRead();	
	}	
}