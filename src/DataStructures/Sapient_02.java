package DataStructures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.List;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

	/*
	 * Complete the 'maxEvents' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 *  1. INTEGER_ARRAY arrival
	 *  2. INTEGER_ARRAY duration
	 */
	public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
		// Write your code here
		int l=arrival.size();
		if(l==1)
			return 1;
		int res=1,max=1;
		for(int k=1;k<l;k++){
			if(res>max)
				max=res;
			for(int i=k;i<l;i++){
				if(arrival.get(i-1)+duration.get(i-1) <= arrival.get(i))
					res++;
				else{
					int temp=arrival.get(i-1)+duration.get(i-1);
					while(i<l && temp > arrival.get(i)){
						i++;
					}
					if(i<l && temp <= arrival.get(i))
						res++;
					//1 1 1 1 4
					//10 3 6 4 2
				}
			}
		}
		return max;
	}
}
public class Sapient_02 {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrivalCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arrival = IntStream.range(0, arrivalCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(toList());

		int durationCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> duration = IntStream.range(0, durationCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(toList());

		int result = Solution.maxEvents(arrival, duration);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}