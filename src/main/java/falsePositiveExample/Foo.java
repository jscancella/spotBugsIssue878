package falsePositiveExample;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public enum Foo { ; // using enum to enforce singleton
	public static void bar(String[] args) throws IOException {
		try (DirectoryStream<Path> files = Files.newDirectoryStream(Paths.get(("/tmp")))) {
			for (final Path file : files) {
				System.err.println(file);
			}
		}
	}
}
