package ch17.sec04.exam04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) throws Exception {
		
		//StreamExample 파일이 있는 곳을 기준으로 data.txt파일을 찾겠다.
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		// data.txt 파일을 한줄씩  Stream으로 저장 기본 캐릭터셋 : UTF-8
		stream.forEach(line -> System.out.println(line));
		// 스트림을 한줄 단위 (파일을 한줄 단위로 출력)
		stream.close();
		
	}

}
