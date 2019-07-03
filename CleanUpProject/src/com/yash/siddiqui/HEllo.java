package com.yash.siddiqui;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class HEllo {
	
public static void main(String[] args) {
	 try {
		  String user ="cumulus.connect"; // username for remote host
		  String password ="4L5d0z3cFpXcU-lX"; // password of the remote host

		   String host = "10.0.18.6"; // remote host address

				   
				   
				   
		  JSch jsch = new JSch();
		  Session session = jsch.getSession(user, host);
		  session.setPassword(password);
		  session.connect();

		  ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
		  sftpChannel.connect();

		  
		  System.out.println("Connected ");
		  sftpChannel.put("I:/demo/myOutFile.txt", "/tmp/QA_Auto/myOutFile.zip");
		  sftpChannel.disconnect();
		  session.disconnect();
		 }catch(Exception ex){
		     ex.printStackTrace();
		 }
		   }
}

		

