package com.example.unix.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileWildCardWithMatch {

	public static void main(String args[]) throws IOException {
		List<String> fileList = new ArrayList<>();
//		String glob = "glob:**/*.txt";
		String glob = "glob:**/*.pdf";
//		String path = "C:/";
		String path = "C:\\FindFiles\\";
		fileList = match(glob, path);
//		fileList.stream().forEach(f->{
//			if(f.contains("3"))	System.out.println(f);
//			});
		String file = fileList.stream()
		.filter(f -> f.contains("Serv") && f.contains("Brok"))
		.findAny()
		.orElse(null);
		
		System.out.println(file);
		
	}

	public static List<String> match(String glob, String location) throws IOException {
		List<String> fileList = new ArrayList<>();
		final PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(
				glob);
		
		Files.walkFileTree(Paths.get(location), new SimpleFileVisitor<Path>() {
			
			@Override
			public FileVisitResult visitFile(Path path,
					BasicFileAttributes attrs) throws IOException {
//				System.out.println(path);
				if (pathMatcher.matches(path)) {
					fileList.add(path.toString());
					System.out.println(path);
				}
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult visitFileFailed(Path file, IOException exc)
					throws IOException {
				return FileVisitResult.CONTINUE;
			}
		});
		
		return fileList;
	}

}
