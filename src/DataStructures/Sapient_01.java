package DataStructures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
	/*
	 * Complete the 'getMinOperations' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts LONG_INTEGER_ARRAY kValues as parameter.
	 */
	public static List<Integer> getMinOperations(List<Long> kValues) {
		// Write your code here
		List<Integer> l=new ArrayList<Integer>();
		int j,len=kValues.size();
		for(int i=0;i<len;i++){
			Long t=kValues.get(i);
			for(j=1;t>=1;j++){
				if(t%2==0)
					t/=2;
				else{
					t=(t-1)/2;
					j++;
				}
			}
			l.add(j-2);
		}
		return l;
	}
}
public class Sapient_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int kValuesCount = Integer.parseInt(bufferedReader.readLine().trim());
		List<Long> kValues = IntStream.range(0, kValuesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.map(String::trim)
				.map(Long::parseLong)
				.collect(toList());
		List<Integer> result = Result.getMinOperations(kValues);
		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(joining("\n"))
						+ "\n"
		);
		bufferedReader.close();
		bufferedWriter.close();
	}
}