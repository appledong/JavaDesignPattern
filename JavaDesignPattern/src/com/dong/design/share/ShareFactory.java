package com.dong.design.share;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author dong 返回对象（三种file类型name不重复）
 */
public class ShareFactory {

	public static class ShareFactoryHolder {
		public static ShareFactory shareFactory = new ShareFactory();
	}

	public static ShareFactory getInstanse() {
		return ShareFactoryHolder.shareFactory;
	}

	public enum FileType {
		pic, video, gif
	}

	private Map<String, File> files;// 享元池，享元工厂类单例保持享元池单一

	private ShareFactory() {
		files = new HashMap<>();
	}
	
	public File getUnShareFile(FileType fileType, String name){
		File file = null;
		switch (fileType) {
		case gif:
			file = new GifFile(name);
			break;
		case video:
			file = new VideoFile(name);
			break;
		case pic:
		default:
			file = new PicFile(name);
			break;
		}
		return file;
	}

	public File getShareFile(FileType fileType, String name) {
		if (files.containsKey(name)) {
			return files.get(name);
		} else {
			File file = null;
			switch (fileType) {
			case gif:
				file = new GifFile(name);
				break;
			case video:
				file = new VideoFile(name);
				break;
			case pic:
			default:
				file = new PicFile(name);
				break;
			}
			files.put(name, file);
			return file;
		}
	}

}
