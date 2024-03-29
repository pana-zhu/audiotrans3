package com.zll.lib.link.core;

import java.io.Closeable;
import java.io.IOException;

public interface Sender extends Closeable  {
	
	void setSendListener(IoArgs.IoArgsEventProcessor processor);
	boolean postSendAsync() throws IOException;
	long getLastWriteTime();
}
