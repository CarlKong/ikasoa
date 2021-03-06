package com.ikamobile.ikasoa.core.thrift.client;

import com.ikamobile.ikasoa.core.thrift.AbstractThriftConfiguration;
import com.ikamobile.ikasoa.core.ServerCheck;
import com.ikamobile.ikasoa.core.ServerCheckFailProcessor;

/**
 * Thrift客户端配置
 * 
 * @author <a href="mailto:larry7696@gmail.com">Larry</a>
 * @version 0.1
 */
public class ThriftClientConfiguration extends AbstractThriftConfiguration {

	/**
	 * 服务器可用性检测接口
	 * <p>
	 * 如果不需要检测,则保持为空.
	 */
	private ServerCheck serverCheck;

	/**
	 * 服务器连接失败处理接口
	 */
	private ServerCheckFailProcessor serverCheckFailProcessor;

	public ThriftClientConfiguration() {
	}

	public ServerCheck getServerCheck() {
		return serverCheck;
	}

	public void setServerCheck(ServerCheck serverCheck) {
		this.serverCheck = serverCheck;
	}

	public ServerCheckFailProcessor getServerCheckFailProcessor() {
		return serverCheckFailProcessor;
	}

	public void setServerCheckFailProcessor(ServerCheckFailProcessor serverCheckFailProcessor) {
		this.serverCheckFailProcessor = serverCheckFailProcessor;
	}

}
